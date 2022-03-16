package com.example.kanner;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class FragResultadoMCHAT extends Fragment {
    public TextView puntaje, resultadoPes;
    public Button btnGuarC2;
    public String nombrec = "M-CHAT-R/F";
    public int puntajefinal;


    public FragResultadoMCHAT() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_frag_resultado_m_c_h_a_t, container, false);
        puntaje = view.findViewById(R.id.puntaje);
        resultadoPes = view.findViewById(R.id.resultadoPes);
        btnGuarC2 = view.findViewById(R.id.btnGuarC2);


        btnGuarC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TablaRes tablaRes = new TablaRes(getActivity());

                Date date = new Date();
                DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
                String fecha = hourdateFormat.format(date);

                String puntajes = "El puntaje final es: \n"+puntaje.getText().toString();

                Resultados resultados = new Resultados(null, nombrec, puntajes, null, resultadoPes.getText().toString(), fecha);
                tablaRes.guardar(resultados);
                Toast.makeText(getActivity(), "Guardando", Toast.LENGTH_SHORT).show();
                Navigation.findNavController(view).navigate(R.id.nav_gallery);

            }
        });






        getParentFragmentManager().setFragmentResultListener("key3", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                puntajefinal = result.getInt("Res1");


                if (puntajefinal <= 2) {
                    puntaje.setText(String.valueOf(puntajefinal));
                    resultadoPes.setText("Si el niño es menor a 24 meses, pesquisar nuevamente luego de los 2 años. No es necesario adoptar otras medidas a menos que la evaluación del desarrollo indique riesgo de TEA.\n");
                }

                if (puntajefinal >= 3 && puntajefinal <= 7) {
                    puntaje.setText(String.valueOf(puntajefinal));
                    resultadoPes.setText(" Administre la entrevista de Seguimiento para obtener más información con respecto a las respuestas de riesgo. Si el puntaje del M-CHAT-R/F sigue siendo 2 o más, se considera que el niño tiene una pesquisa positiva. Medida que se debe tomar: derivar al niño a evaluación diagnóstica y evaluación de necesidad de intervención temprana.\n");
                }

                if (puntajefinal >= 8 && puntajefinal <= 20) {
                    puntaje.setText(String.valueOf(puntajefinal));
                    resultadoPes.setText("Es aceptable omitir la entrevista de Seguimiento y derivar inmediatamente a evaluación diagnóstica y evaluación de necesidad de intervención temprana.\n");
                }

            }
        });


        return view;
    }
}