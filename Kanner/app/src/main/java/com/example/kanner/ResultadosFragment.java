package com.example.kanner;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;


public class ResultadosFragment extends Fragment {

    private static final String ARG_COLUMN_COUNT = "column-count";
    private int mColumnCount = 1;
    private RecyclerView recyclerView;
    private MyResultadosRecyclerViewAdapter adapterResultados;
    private OnListFragmentInteractionListener myListener;
    private List<Resultados> resultadosList;
    public ResultadosFragment() {
    }

    @SuppressWarnings("unused")
    public static ResultadosFragment newInstance(int columnCount) {
        ResultadosFragment fragment = new ResultadosFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            /**LLenado de info***/
            TablaRes tablaRes = new TablaRes(getActivity());
            resultadosList=tablaRes.getResultados();
            if(resultadosList!=null){
                adapterResultados = new MyResultadosRecyclerViewAdapter((AppCompatActivity) getActivity(), resultadosList, myListener);
                recyclerView.setAdapter(adapterResultados);
            }else{
                Toast.makeText(getActivity(),"No hay Registros", Toast.LENGTH_LONG).show();
            }

        }
        return view;
    }


    @Override
    public void onDetach() {
        super.onDetach();
        myListener = null;
    }

    public interface OnListFragmentInteractionListener{
        void onListFragmentInteractionListener(Resultados resultados);
    }

}