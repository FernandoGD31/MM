package com.example.kanner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsFragment extends Fragment {
    private GoogleMap mMap;

    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        @Override
        public void onMapReady(GoogleMap googleMap) {
            mMap=googleMap;
            LatLng CAADD = new LatLng(20.558765615760596, -100.42947229079222);
            mMap.addMarker(new MarkerOptions().position(CAADD).title("Centro para la Atención del Autismo y Desórdenes del Desarrollo A.C."));

            LatLng IMADN = new LatLng( 19.354688739582425, -99.18521194678539  );
            mMap.addMarker(new MarkerOptions().position(IMADN).title("Instituto Mexicano para la Atención del Desarrollo del niño"));

            LatLng CATC = new LatLng( 19.355905480334933, -99.28233720289388  );
            mMap.addMarker(new MarkerOptions().position(CATC).title("Clinica De Autismo Y Trastornos De La Comunicacion"));

            LatLng ADAA = new LatLng( 19.342705521613055, -99.15591840289412  );
            mMap.addMarker(new MarkerOptions().position(ADAA).title("Asociación de Autismo: Desarrollo y Arte"));

            LatLng CAT = new LatLng(  19.513043802792463, -99.0453376893983 );
            mMap.addMarker(new MarkerOptions().position(CAT).title("Centro Autismo Teletón"));

            LatLng ASTRA = new LatLng( 21.16486579886657, -86.83435767402543  );
            mMap.addMarker(new MarkerOptions().position(ASTRA).title("Astra, AC - Asociación de Ayuda a Niños con Trastornos en el Desarrollo, A.C."));

            LatLng CMAAD = new LatLng(  21.1677627044479, -101.64545886053251);
            mMap.addMarker(new MarkerOptions().position(CMAAD).title("Clínica Mexicana de Autismo y Alteraciones del Desarrollo Filial Bajío A C"));

            LatLng CADZ = new LatLng(  20.735806097228195, -103.4005005758835 );
            mMap.addMarker(new MarkerOptions().position(CADZ).title("Centro De Autismo Dif Zapopan"));

            LatLng Cappdi = new LatLng(  19.26778118412156, -99.63891611638833 );
            mMap.addMarker(new MarkerOptions().position(Cappdi).title("Centro De Atención Psicopedagógica Y Desarrollo Infantil Cappdi"));

            LatLng CAC = new LatLng(  19.472339551210162, -99.1794825028919 );
            mMap.addMarker(new MarkerOptions().position(CAC).title("Clínica de Autismo CDMX"));


            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CAADD, 6));
        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_maps, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }
}