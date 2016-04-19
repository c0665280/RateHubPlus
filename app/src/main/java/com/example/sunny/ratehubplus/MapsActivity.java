package com.example.sunny.ratehubplus;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney1 = new LatLng(42.9719269, -82.3755624);
        LatLng sydney2 = new LatLng(42.9733452, -82.3709288);
        LatLng sydney3 = new LatLng(42.978187, -82.3664751);
        LatLng sydney4 = new LatLng(42.9781887, -82.3689515);
        LatLng sydney5 = new LatLng(42.9781887, -82.3689515);
        LatLng sydney6 = new LatLng(42.978205, -82.369023);
        LatLng sydney7 = new LatLng(42.978205, -82.369023);
        LatLng sydney8 = new LatLng(42.9811129, -82.3606604);
        LatLng sydney9 = new LatLng(42.9811129, -82.3606604);
        LatLng sydney10 = new LatLng(42.9845738, -82.3922449);

        mMap.addMarker(new MarkerOptions().position(sydney1).title("Swiss Chalet"));
        mMap.addMarker(new MarkerOptions().position(sydney2).title("Norm's Pub & Grill"));
        mMap.addMarker(new MarkerOptions().position(sydney3).title("MacDonalds"));
        mMap.addMarker(new MarkerOptions().position(sydney4).title("Taco Bell"));
        mMap.addMarker(new MarkerOptions().position(sydney5).title("Wendy's"));
        mMap.addMarker(new MarkerOptions().position(sydney6).title("Arby's"));
        mMap.addMarker(new MarkerOptions().position(sydney7).title("Victory Buffet"));
        mMap.addMarker(new MarkerOptions().position(sydney8).title("Sitara"));
        mMap.addMarker(new MarkerOptions().position(sydney9).title("Boston Pizza"));
        mMap.addMarker(new MarkerOptions().position(sydney10).title("Cosmo's Tavern"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney1,12));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney2,12));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney3,12));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney4,12));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney5,12));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney6,12));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney7,12));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney8,12));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney9,12));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney10,12));
    }
}
