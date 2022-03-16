package com.example.kanner;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Trastornos#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Trastornos extends Fragment {

    public Button btn_tea, btn_tel, btn_tdah,btn_auditivo,btn_sensoriales,btn_aprendizaje,btn_cognitivo;
    public String pagina;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Trastornos() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Trastornos.
     */
    // TODO: Rename and change types and number of parameters
    public static Trastornos newInstance(String param1, String param2) {
        Trastornos fragment = new Trastornos();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trastornos, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btn_tea = view.findViewById(R.id.btn_tea);
        btn_tel = view.findViewById(R.id.btn_tel);
        btn_tdah = view.findViewById(R.id.btn_tdah);
        btn_auditivo = view.findViewById(R.id.btn_auditivo);
        btn_sensoriales = view.findViewById(R.id.btn_sensoriales);
        btn_aprendizaje = view.findViewById(R.id.btn_aprendizaje);
        btn_cognitivo = view.findViewById(R.id.btn_cognitivo);




        btn_tea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("nombre", "https://medlineplus.gov/spanish/autismspectrumdisorder.html");
                getParentFragmentManager().setFragmentResult("key", bundle);
                Navigation.findNavController(view).navigate(R.id.trastornosInfo);
            }
        });

        btn_tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("nombre", "http://ceril.net/index.php/articulos?id=348");
                getParentFragmentManager().setFragmentResult("key", bundle);
                Navigation.findNavController(view).navigate(R.id.trastornosInfo);
            }
        });
        btn_tdah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("nombre", "https://www.cdc.gov/ncbddd/spanish/adhd/index.html");
                getParentFragmentManager().setFragmentResult("key", bundle);
                Navigation.findNavController(view).navigate(R.id.trastornosInfo);
            }
        });
        btn_auditivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("nombre", "https://www.understood.org/es-mx/learning-thinking-differences/child-learning-disabilities/auditory-processing-disorder/understanding-auditory-processing-disorder");
                getParentFragmentManager().setFragmentResult("key", bundle);
                Navigation.findNavController(view).navigate(R.id.trastornosInfo);
            }
        });
        btn_sensoriales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("nombre", "https://www.psyciencia.com/que-es-el-trastorno-de-procesamiento-sensorial/#:~:text=Las%20evaluaciones%20de%20los%20terapeutas,ansiedad%2C%20son%20hipersensibles%20al%20tacto.");
                getParentFragmentManager().setFragmentResult("key", bundle);
                Navigation.findNavController(view).navigate(R.id.trastornosInfo);
            }
        });
        btn_aprendizaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("nombre", "http://www.enciclopedia-infantes.com/trastornos-del-aprendizaje/sintesis#:~:text=Los%20trastornos%20del%20aprendizaje%20son,deletrear%20o%20resolver%20problemas%20matem%C3%A1ticos.");
                getParentFragmentManager().setFragmentResult("key", bundle);
                Navigation.findNavController(view).navigate(R.id.trastornosInfo);
            }
        });
        btn_cognitivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("nombre", "https://www.topdoctors.es/diccionario-medico/trastorno-cognitivo");
                getParentFragmentManager().setFragmentResult("key", bundle);
                Navigation.findNavController(view).navigate(R.id.trastornosInfo);
            }
        });



    }


}