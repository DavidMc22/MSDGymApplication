package com.example.msdgymapplication;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

//References:
//Used a youtube tutorial to help
// Link : https://www.youtube.com/watch?v=XimcwP-OzFg
//Also looked at lab 9

public class MapLocation extends FragmentActivity implements OnMapReadyCallback {

    //Variables
    private final int FINE_PERMISSION_CODE = 1;
    private GoogleMap mMap;

    Location currentlocation;
    FusedLocationProviderClient fusedLocationProviderClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_location);

        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
        getLastKnownLocation();


    }

    //Method to get last location
    private void getLastKnownLocation() {
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION}, FINE_PERMISSION_CODE);
            return;
        }

        Task<Location> task = fusedLocationProviderClient.getLastLocation();

        //On click Success listener used to gather current location.
        task.addOnSuccessListener(new OnSuccessListener<Location>() {
            @Override
            public void onSuccess(Location location) {
                if (location != null) {
                    currentlocation = location;

                    SupportMapFragment mapFragment = new SupportMapFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.mapContainer, mapFragment)
                            .commit();

                    mapFragment.getMapAsync(MapLocation.this);
                }
            }
        });
    }

    //Method to display location on map
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng currentLatLng = new LatLng(currentlocation.getLatitude(), currentlocation.getLongitude());
        mMap.addMarker(new MarkerOptions().position(currentLatLng).title("Your Location"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(currentLatLng));
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == FINE_PERMISSION_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                getLastKnownLocation();
            } else {
                Toast.makeText(this, "Location permission denied", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
