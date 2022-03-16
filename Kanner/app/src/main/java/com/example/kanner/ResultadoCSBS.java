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
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ResultadoCSBS extends Fragment {

    public TextView tv1, tv2, tv3, tvr, tvr2, tvr3;
    public Button btn_g;
    int res1, res2, res3, edad;
    public String nombrec = "CSBS-DP";

    public ResultadoCSBS() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_resultado_c_s_b_s, container, false);

        tv1 = view.findViewById(R.id.tv1);
        tv2 = view.findViewById(R.id.tv2);
        tv3 = view.findViewById(R.id.tv3);
        tvr = view.findViewById(R.id.tvr);
        tvr2 = view.findViewById(R.id.tvr2);
        tvr3 = view.findViewById(R.id.tvr3);

        btn_g = view.findViewById(R.id.btn_g);

        btn_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TablaRes tablaRes = new TablaRes(getActivity());

                Date date = new Date();
                DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
                String fecha = hourdateFormat.format(date);

                Resultados resultados = new Resultados(null, nombrec, tvr.getText().toString(), tvr2.getText().toString(), tvr3.getText().toString(),fecha);
                tablaRes.guardar(resultados);
                Toast.makeText(getActivity(), "Guardando", Toast.LENGTH_SHORT).show();
                Navigation.findNavController(view).navigate(R.id.nav_gallery);
            }
        });


        getParentFragmentManager().setFragmentResultListener("key2", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                res1 = result.getInt("Res1");
                res2 = result.getInt("Res2");
                res3 = result.getInt("Res3");
                edad = result.getInt("Edad");

                tv1.setText(String.valueOf(res1));
                tv2.setText(String.valueOf(res2));
                tv3.setText(String.valueOf(res3));


                if (edad == 1) {
                    if (res1 >= 8) {
                        tvr.setText(getString(R.string.positivo));
                    } else {
                        tvr.setText(getString(R.string.negativo));
                    }

                    if (res2 >= 2) {
                        tvr2.setText(getString(R.string.positivo2));
                    } else {
                        tvr2.setText(getString(R.string.negativo2));
                    }

                    if (res3 >= 3) {
                        tvr3.setText(getString(R.string.positivo3));
                    } else {
                        tvr3.setText(getString(R.string.negativo3));
                    }
                }

                if (edad == 2) {
                    if (res1 >= 12) {
                        tvr.setText(getString(R.string.positivo));
                    } else {
                        tvr.setText(getString(R.string.negativo));
                    }

                    if (res2 >= 5) {
                        tvr2.setText(getString(R.string.positivo2));
                    } else {
                        tvr2.setText(getString(R.string.negativo2));
                    }

                    if (res3 >= 5) {
                        tvr3.setText(getString(R.string.positivo3));
                    } else {
                        tvr3.setText(getString(R.string.negativo3));
                    }
                }

                if (edad == 3) {
                    if (res1 >= 15) {
                        tvr.setText(getString(R.string.positivo));
                    } else {
                        tvr.setText(getString(R.string.negativo));
                    }

                    if (res2 >= 6) {
                        tvr2.setText(getString(R.string.positivo2));
                    } else {
                        tvr2.setText(getString(R.string.negativo2));
                    }

                    if (res3 >= 8) {
                        tvr3.setText(getString(R.string.positivo3));
                    } else {
                        tvr3.setText(getString(R.string.negativo3));
                    }
                }

                if (edad == 4) {
                    if (res1 >= 18) {
                        tvr.setText(getString(R.string.positivo));
                    } else {
                        tvr.setText(getString(R.string.negativo));
                    }

                    if (res2 >= 7) {
                        tvr2.setText(getString(R.string.positivo2));
                    } else {
                        tvr2.setText(getString(R.string.negativo2));
                    }

                    if (res3 >= 11) {
                        tvr3.setText(getString(R.string.positivo3));
                    } else {
                        tvr3.setText(getString(R.string.negativo3));
                    }
                }

                if (edad == 5) {
                    if (res1 >= 19) {
                        tvr.setText(getString(R.string.positivo));
                    } else {
                        tvr.setText(getString(R.string.negativo));
                    }

                    if (res2 >= 9) {
                        tvr2.setText(getString(R.string.positivo2));
                    } else {
                        tvr2.setText(getString(R.string.negativo2));
                    }

                    if (res3 >= 12) {
                        tvr3.setText(getString(R.string.positivo3));
                    } else {
                        tvr3.setText(getString(R.string.negativo3));
                    }
                }


            }
        });

        return view;
    }
}