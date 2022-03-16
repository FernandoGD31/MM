package com.example.kanner.ui.slideshow;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kanner.BaseDatos;
import com.example.kanner.R;
import com.example.kanner.Resultados;
import com.example.kanner.ResultadosFragment;

import java.util.ArrayList;

public class SlideshowFragment extends Fragment implements ResultadosFragment.OnListFragmentInteractionListener{

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_slideshow, container, false);
        return view;
    }
    @Override
    public void onListFragmentInteractionListener(Resultados resultados) {
    }
}