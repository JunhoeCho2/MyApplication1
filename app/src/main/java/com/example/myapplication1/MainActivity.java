package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Location;
import android.os.Bundle;

import com.google.android.gms.maps.model.LatLng;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public double getDistance(LatLng LatLng1, LatLng LatLng2){
            double distance = 0;
            Location locationA = new Location("pointA");
            locationA.setLatitude(31);
            locationA.setLongitude(31);
            Location locationB = new Location("pointB");
            locationA.setLatitude(55);
            locationA.setLongitude(55);
            distance = locationA.distanceTo(locationB);

            return distance;
    }
}