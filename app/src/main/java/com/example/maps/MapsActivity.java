package com.example.maps;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, LocationListener {

    private Marker marker;
    private GoogleMap mMap;
    LocationManager locationManager;
    private final float DEFAULT_ZOOM = 7;

    @SuppressLint("MissingPermission")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);

        String[] permission = {Manifest.permission.INTERNET,
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION};

        if (!hasPermission(permission)) {
            askPermission((permission));
            locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER,0,0,this);
        } else {
           // locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,0,0,this);
            locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER,0,0,this);
        }


    }

    public void askPermission(String[] permission)
    {
        for(String perm:permission) {
            ActivityCompat.requestPermissions(this,permission,1);
        }
    }

    public boolean hasPermission(String[] permissions)
    {
        for(String permission:permissions) {
          if(ContextCompat.checkSelfPermission(getBaseContext(),permission)!= PackageManager.PERMISSION_GRANTED)
          {
              return  false;
          }
        }
        return  true;
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

        LatLng Ramanagara  = new LatLng(15.2361, 74.6173);
        Marker marker = mMap.addMarker(new MarkerOptions().position(Ramanagara).title("Ramanagara"));
        marker.showInfoWindow();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Ramanagara, DEFAULT_ZOOM));

        LatLng Mullayanagiri = new LatLng(13.3909, 75.7213);
        Marker marker1 = mMap.addMarker(new MarkerOptions().position(Mullayanagiri).title("Mullayanagiri(Near Chikmagalur)"));
        marker1.showInfoWindow();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Mullayanagiri, DEFAULT_ZOOM));

        LatLng BabaBudangiri = new LatLng( 13.4229, 75.7704);
        Marker marker2 = mMap.addMarker(new MarkerOptions().position(BabaBudangiri).title("Baba Budangiri"));
        marker2.showInfoWindow();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(BabaBudangiri, DEFAULT_ZOOM));

        LatLng Kemmangundi = new LatLng( 13.5500, 75.7500);
        Marker marker3 = mMap.addMarker(new MarkerOptions().position(Kemmangundi).title("Kemmangundi(Z Point)"));
        marker3.showInfoWindow();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Kemmangundi,DEFAULT_ZOOM));

        LatLng BilikalRangaswamyBetta = new LatLng( 12.5537, 77.5124);
        Marker marker4 = mMap.addMarker(new MarkerOptions().position(BilikalRangaswamyBetta).title("Bilikal Rangaswamy Betta(Near Bangalore)"));
        marker4.showInfoWindow();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(BilikalRangaswamyBetta, DEFAULT_ZOOM));

        LatLng NandiHills = new LatLng( 13.3702, 77.6835);
        Marker marker5 = mMap.addMarker(new MarkerOptions().position(NandiHills).title("Nandi Hills(Near Bangalore)"));
        marker5.showInfoWindow();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(NandiHills, DEFAULT_ZOOM));

        LatLng Skandagiri = new LatLng( 13.4181, 77.6830);
        Marker marker6 = mMap.addMarker(new MarkerOptions().position(Skandagiri).title("Skandagiri(Near Bangalore)"));
        marker6.showInfoWindow();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Skandagiri, DEFAULT_ZOOM));

        LatLng ShivagangaHill = new LatLng( 13.4181, 77.6830);
        Marker marker7 = mMap.addMarker(new MarkerOptions().position(Skandagiri).title("Shivaganga Hill(Near Bangalore)"));
        marker7.showInfoWindow();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ShivagangaHill, DEFAULT_ZOOM));

        LatLng Devarayanadurga = new LatLng( 13.3742, 77.2127);
        Marker marker8 = mMap.addMarker(new MarkerOptions().position(Devarayanadurga).title("Devarayanadurga(Near Bangalore)"));
        marker8.showInfoWindow();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Devarayanadurga, DEFAULT_ZOOM));

        LatLng Yana = new LatLng( 14.5801, 74.5609);
        Marker marker9 = mMap.addMarker(new MarkerOptions().position(Yana).title("Yana(Near Jog Falls)"));
        marker9.showInfoWindow();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Yana, DEFAULT_ZOOM));

        LatLng Madhugiri = new LatLng( 13.6643, 77.2089);
        Marker marker10 = mMap.addMarker(new MarkerOptions().position(Madhugiri).title("Madhugiri(Near Bangalore)"));
        marker10.showInfoWindow();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Madhugiri, DEFAULT_ZOOM));

        LatLng Anthargange = new LatLng( 13.1424, 78.1006);
        Marker marker11 = mMap.addMarker(new MarkerOptions().position(Anthargange).title("Anthargange"));
        marker11.showInfoWindow();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Anthargange, DEFAULT_ZOOM));

        LatLng SavandurgaHill  = new LatLng( 12.9206, 77.2944);
        Marker marker12 = mMap.addMarker(new MarkerOptions().position(SavandurgaHill ).title("Savandurga Hill "));
        marker12.showInfoWindow();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(SavandurgaHill , DEFAULT_ZOOM));

        LatLng Makalidurga  = new LatLng( 13.4324, 77.5009);
        Marker marker13 = mMap.addMarker(new MarkerOptions().position(Makalidurga ).title("Makalidurga "));
        marker13.showInfoWindow();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Makalidurga , DEFAULT_ZOOM));

        LatLng ChannarayanaDurga  = new LatLng( 13.5897, 77.2067);
        Marker marker14 = mMap.addMarker(new MarkerOptions().position(ChannarayanaDurga ).title("Channarayana Durga "));
        marker14.showInfoWindow();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ChannarayanaDurga , DEFAULT_ZOOM));

        LatLng KuntiBetta  = new LatLng( 12.5083, 76.6981);
        Marker marker15 = mMap.addMarker(new MarkerOptions().position(KuntiBetta ).title("Kunti Betta "));
        marker15.showInfoWindow();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(KuntiBetta , DEFAULT_ZOOM));

        LatLng Bheemeshwari  = new LatLng( 12.31, 77.28);
        Marker marker16 = mMap.addMarker(new MarkerOptions().position(Bheemeshwari ).title("Bheemeshwari "));
        marker16.showInfoWindow();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Bheemeshwari, DEFAULT_ZOOM));

        LatLng KumaraParvatha  = new LatLng( 12.6581, 75.6867);
        Marker marker17 = mMap.addMarker(new MarkerOptions().position(KumaraParvatha ).title("Kumara Parvatha "));
        marker17.showInfoWindow();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(KumaraParvatha , DEFAULT_ZOOM));

        LatLng Tadiandamol  = new LatLng( 12.2171, 75.6088);
        Marker marker18 = mMap.addMarker(new MarkerOptions().position(Tadiandamol ).title("Tadiandamol "));
        marker18.showInfoWindow();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Tadiandamol , DEFAULT_ZOOM));

        mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                if(marker != null && marker.getTitle().equals("Ramanagara")){
                    Intent it1 = new Intent(MapsActivity.this, Ramanagara.class);
                    startActivity(it1);}
                if(marker != null && marker.getTitle().equals("Mullayanagiri(Near Chikmagalur)")){
                    Intent it2 = new Intent(MapsActivity.this, Mullayanagiri.class);
                    startActivity(it2);}
                if(marker != null && marker.getTitle().equals("Baba Budangiri")){
                    Intent it3 = new Intent(MapsActivity.this, BabaBudangiri.class);
                    startActivity(it3);}
                if(marker != null && marker.getTitle().equals("Kemmangundi(Z Point)")){
                    Intent it4 = new Intent(MapsActivity.this, Kemmangundi.class);
                    startActivity(it4);}
                if(marker != null && marker.getTitle().equals("Bilikal Rangaswamy Betta(Near Bangalore)")){
                    Intent it5 = new Intent(MapsActivity.this, BilikalRangaswamyBetta.class);
                    startActivity(it5);}
                if(marker != null && marker.getTitle().equals("Nandi Hills(Near Bangalore)")){
                    Intent it6 = new Intent(MapsActivity.this, NandiHills.class);
                    startActivity(it6);}
                if(marker != null && marker.getTitle().equals("Skandagiri(Near Bangalore)")){
                    Intent it7 = new Intent(MapsActivity.this, Skandagiri.class);
                    startActivity(it7);}
                if(marker != null && marker.getTitle().equals("Shivaganga Hill(Near Bangalore)")){
                    Intent it8 = new Intent(MapsActivity.this, ShivagangaHill.class);
                    startActivity(it8);}
                if(marker != null && marker.getTitle().equals("Devarayanadurga(Near Bangalore)")){
                    Intent it9 = new Intent(MapsActivity.this, Devarayanadurga.class);
                    startActivity(it9);}
                if(marker != null && marker.getTitle().equals("Yana(Near Jog Falls)")){
                    Intent it10 = new Intent(MapsActivity.this, Yana.class);
                    startActivity(it10);}
                if(marker != null && marker.getTitle().equals("Madhugiri(Near Bangalore)")){
                    Intent it11 = new Intent(MapsActivity.this, Madhugiri.class);
                    startActivity(it11);}
                if(marker != null && marker.getTitle().equals("Anthargange")){
                    Intent it12 = new Intent(MapsActivity.this, Anthargange.class);
                    startActivity(it12);}
                if(marker != null && marker.getTitle().equals("Savandurga Hill ")){
                    Intent it13 = new Intent(MapsActivity.this, SavandurgaHill.class);
                    startActivity(it13);}
                if(marker != null && marker.getTitle().equals("Makalidurga ")){
                    Intent it14 = new Intent(MapsActivity.this, Makalidurga.class);
                    startActivity(it14);}
                if(marker != null && marker.getTitle().equals("Channarayana Durga ")){
                    Intent it15 = new Intent(MapsActivity.this, ChannarayanaDurga.class);
                    startActivity(it15);}
                if(marker != null && marker.getTitle().equals("Kunti Betta ")){
                    Intent it16 = new Intent(MapsActivity.this, KuntiBetta.class);
                    startActivity(it16);}
                if(marker != null && marker.getTitle().equals("Bheemeshwari ")){
                    Intent it17 = new Intent(MapsActivity.this, Bheemeshwari.class);
                    startActivity(it17);}
                if(marker != null && marker.getTitle().equals("Kumara Parvatha ")){
                    Intent it18 = new Intent(MapsActivity.this, KumaraParvatha.class);
                    startActivity(it18);}
                if(marker != null && marker.getTitle().equals("Tadiandamol")){
                    Intent it19 = new Intent(MapsActivity.this, Tadiandamol.class);
                    startActivity(it19);}


            }
        });





    }

    @Override
    public void onLocationChanged(Location location) {

        //mMap.clear();
        //LatLng myloc = new LatLng(location.getLatitude(), location.getLongitude());
        //MarkerOptions option = new MarkerOptions();
        //option.position(myloc);
        //option.icon(); //
        //option.title("My location");
        //mMap.addMarker(option);
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(myloc));
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }



}
