package com.example.mapsapk;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback{
    private GoogleMap gMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment=(SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.id_map);
        mapFragment.getMapAsync((OnMapReadyCallback) this);

    }
    @Override
    public void onMapReady(GoogleMap googleMap){
        LatLng initialLocation = new LatLng(17.3850, 78.4867); // Coordinates for Hyderabad
        float zoomLevel = 15.0f; // Set an appropriate zoom level (e.g., 15 for close-up view)

        // Move the camera to the initial location
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(initialLocation, zoomLevel));
    }
}