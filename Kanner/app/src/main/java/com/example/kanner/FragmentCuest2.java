package com.example.kanner;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class FragmentCuest2 extends Fragment {
    public RadioButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
    public RadioButton b11, b12, b13, b14, b15, b16, b17, b18, b19, b20;
    public RadioButton b21, b22, b23, b24, b25, b26, b27, b28, b29, b30;
    public RadioButton b31, b32, b33, b34, b35, b36, b37, b38, b39, b40;

    public TextView puntaje, resultadoPes;

    public Button btn_cuest2;
    public int resul1 = 0;

    public FragmentCuest2() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cuest2, container, false);

        b1 = view.findViewById(R.id.rb1);
        b2 = view.findViewById(R.id.rb2);
        b3 = view.findViewById(R.id.rb3);
        b4 = view.findViewById(R.id.rb4);
        b5 = view.findViewById(R.id.rb5);
        b6 = view.findViewById(R.id.rb6);
        b7 = view.findViewById(R.id.rb7);
        b8 = view.findViewById(R.id.rb8);
        b9 = view.findViewById(R.id.rb9);
        b10 = view.findViewById(R.id.rb10);

        b11 = view.findViewById(R.id.rb11);
        b12 = view.findViewById(R.id.rb12);
        b13 = view.findViewById(R.id.rb13);
        b14 = view.findViewById(R.id.rb14);
        b15 = view.findViewById(R.id.rb15);
        b16 = view.findViewById(R.id.rb16);
        b17 = view.findViewById(R.id.rb17);
        b18 = view.findViewById(R.id.rb18);
        b19 = view.findViewById(R.id.rb19);
        b20 = view.findViewById(R.id.rb20);

        b21 = view.findViewById(R.id.rb21);
        b22 = view.findViewById(R.id.rb22);
        b23 = view.findViewById(R.id.rb23);
        b24 = view.findViewById(R.id.rb24);
        b25 = view.findViewById(R.id.rb25);
        b26 = view.findViewById(R.id.rb26);
        b27 = view.findViewById(R.id.rb27);
        b28 = view.findViewById(R.id.rb28);
        b29 = view.findViewById(R.id.rb29);
        b30 = view.findViewById(R.id.rb30);

        b31 = view.findViewById(R.id.rb31);
        b32 = view.findViewById(R.id.rb32);
        b33 = view.findViewById(R.id.rb33);
        b34 = view.findViewById(R.id.rb34);
        b35 = view.findViewById(R.id.rb35);
        b36 = view.findViewById(R.id.rb36);
        b37 = view.findViewById(R.id.rb37);
        b38 = view.findViewById(R.id.rb38);
        b39 = view.findViewById(R.id.rb39);
        b40 = view.findViewById(R.id.rb40);

        btn_cuest2 = view.findViewById(R.id.btn_cuest2);

        btn_cuest2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                validar();

                Bundle bundle = new Bundle();
                bundle.putInt("Res1",resul1 );

                getParentFragmentManager().setFragmentResult("key3", bundle);
                Navigation.findNavController(view).navigate(R.id.fragResultadoMCHAT);

            }
        });


        return view;
    }

    private void validar() {
        if (b1.isChecked()) {
            resul1 += 0;
        }
        if (b2.isChecked()) {
            resul1 += 1;
        }
        if (b3.isChecked()) {
            resul1 += 0;
        }
        if (b4.isChecked()) {
            resul1 += 1;
        }
        if (b5.isChecked()) {
            resul1 += 0;
        }
        if (b6.isChecked()) {
            resul1 += 1;
        }
        if (b7.isChecked()) {
            resul1 += 0;
        }
        if (b8.isChecked()) {
            resul1 += 1;
        }
        if (b9.isChecked()) {
            resul1 += 0;
        }
        if (b10.isChecked()) {
            resul1 += 1;
        }

        if (b11.isChecked()) {
            resul1 += 0;
        }
        if (b12.isChecked()) {
            resul1 += 1;
        }
        if (b13.isChecked()) {
            resul1 += 0;
        }
        if (b14.isChecked()) {
            resul1 += 1;
        }
        if (b15.isChecked()) {
            resul1 += 0;
        }
        if (b16.isChecked()) {
            resul1 += 1;
        }
        if (b17.isChecked()) {
            resul1 += 0;
        }
        if (b18.isChecked()) {
            resul1 += 1;
        }
        if (b19.isChecked()) {
            resul1 += 0;
        }
        if (b20.isChecked()) {
            resul1 += 1;
        }


        if (b21.isChecked()) {
            resul1 += 0;
        }
        if (b22.isChecked()) {
            resul1 += 1;
        }
        if (b23.isChecked()) {
            resul1 += 0;
        }
        if (b24.isChecked()) {
            resul1 += 1;
        }
        if (b25.isChecked()) {
            resul1 += 0;
        }
        if (b26.isChecked()) {
            resul1 += 1;
        }
        if (b27.isChecked()) {
            resul1 += 0;
        }
        if (b28.isChecked()) {
            resul1 += 1;
        }
        if (b29.isChecked()) {
            resul1 += 0;
        }
        if (b30.isChecked()) {
            resul1 += 1;
        }


        if (b31.isChecked()) {
            resul1 += 0;
        }
        if (b32.isChecked()) {
            resul1 += 1;
        }
        if (b33.isChecked()) {
            resul1 += 0;
        }
        if (b34.isChecked()) {
            resul1 += 1;
        }
        if (b35.isChecked()) {
            resul1 += 0;
        }
        if (b36.isChecked()) {
            resul1 += 1;
        }
        if (b37.isChecked()) {
            resul1 += 0;
        }
        if (b38.isChecked()) {
            resul1 += 1;
        }
        if (b39.isChecked()) {
            resul1 += 0;
        }
        if (b40.isChecked()) {
            resul1 += 1;
        }
    }
}