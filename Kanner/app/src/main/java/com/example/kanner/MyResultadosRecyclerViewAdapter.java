package com.example.kanner;

import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class MyResultadosRecyclerViewAdapter extends RecyclerView.Adapter<MyResultadosRecyclerViewAdapter.ViewHolder> {
    private Context context;
    private ResultadosFragment.OnListFragmentInteractionListener myListenes;
    private final List<Resultados> mValues;



    public MyResultadosRecyclerViewAdapter(Context context, List<Resultados> items, ResultadosFragment.OnListFragmentInteractionListener myListener) {
        mValues = items;
        this.context = context;
        this.myListenes = myListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mTituloView.setText(holder.mItem.getNombreC());
        holder.mRes1View.setText(holder.mItem.getSimbolico());
        holder.mRes2loView.setText(holder.mItem.getExpresivo());
        holder.mRes3loView.setText(holder.mItem.getComunicacion());
        holder.mClaveView.setText(holder.mItem.getClave());
        holder.mfechaView.setText(holder.mItem.getFecha());

        holder.mBotonEliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TablaRes tablaRes = new TablaRes((Activity) context);
                tablaRes.eliminar(holder.mClaveView.getText().toString());
                Navigation.findNavController(view).navigate(R.id.nav_home);
                Toast.makeText(context, "Registro eliminado", Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mTituloView;
        public final TextView mRes1View;
        public final TextView mRes2loView;
        public final TextView mRes3loView;
        public final TextView mClaveView;
        public final Button mBotonEliminar;
        public final TextView mfechaView;

        public Resultados mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mTituloView = view.findViewById(R.id.textViewTitulo);
            mRes1View = view.findViewById(R.id.textViewRes1);
            mRes2loView = view.findViewById(R.id.textViewRes2);
            mRes3loView = view.findViewById(R.id.textViewRes3);
            mClaveView = view.findViewById(R.id.textViewFech);
            mfechaView = view.findViewById(R.id.textViewCve);
            mBotonEliminar = view.findViewById(R.id.buttoneliminar);

        }

        @Override
        public String toString() {
            return super.toString() + " '" + mTituloView.getText() + "'";
        }
    }
}