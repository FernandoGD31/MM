package com.example.kanner;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;


public class FragmentCuest1 extends Fragment {

    public RadioButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
    public RadioButton b11, b12, b13, b14, b15, b16, b17, b18, b19, b20;
    public RadioButton b21, b22, b23, b24, b25, b26, b27, b28, b29, b30;
    public RadioButton b31, b32, b33, b34, b35, b36, b37, b38, b39, b40;
    public RadioButton b41, b42, b43, b44, b45, b46, b47, b48, b49, b50;
    public RadioButton b51, b52, b53, b54, b55, b56, b57, b58, b59, b60;
    public RadioButton b61, b62, b63, b64, b65, b66, b67, b68, b69, b70;
    public RadioButton b71, b72, b73, b74, b75, b76, b77, b78, b79, b80, b81,b82,b83,b84,b85,b86,b87;
    public Button btn_cuest1;
    public int resul1 = 0;
    public int resul2 = 0;
    public int resul3 = 0;
    public int edad = 0;

    public FragmentCuest1() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cuest1, container, false);

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

        b41 = view.findViewById(R.id.rb41);
        b42 = view.findViewById(R.id.rb42);
        b43 = view.findViewById(R.id.rb43);
        b44 = view.findViewById(R.id.rb44);
        b45 = view.findViewById(R.id.rb45);
        b46 = view.findViewById(R.id.rb46);
        b47 = view.findViewById(R.id.rb47);
        b48 = view.findViewById(R.id.rb48);
        b49 = view.findViewById(R.id.rb49);
        b50 = view.findViewById(R.id.rb50);

        b51 = view.findViewById(R.id.rb51);
        b52 = view.findViewById(R.id.rb52);
        b53 = view.findViewById(R.id.rb53);
        b54 = view.findViewById(R.id.rb54);
        b55 = view.findViewById(R.id.rb55);
        b56 = view.findViewById(R.id.rb56);
        b57 = view.findViewById(R.id.rb57);
        b58 = view.findViewById(R.id.rb58);
        b59 = view.findViewById(R.id.rb59);
        b60 = view.findViewById(R.id.rb60);

        b61 = view.findViewById(R.id.rb61);
        b62 = view.findViewById(R.id.rb62);
        b63 = view.findViewById(R.id.rb63);
        b64 = view.findViewById(R.id.rb64);
        b65 = view.findViewById(R.id.rb65);
        b66 = view.findViewById(R.id.rb66);
        b67 = view.findViewById(R.id.rb67);
        b68 = view.findViewById(R.id.rb68);
        b69 = view.findViewById(R.id.rb69);
        b70 = view.findViewById(R.id.rb70);

        b71 = view.findViewById(R.id.rb71);
        b72 = view.findViewById(R.id.rb72);
        b73 = view.findViewById(R.id.rb73);
        b74 = view.findViewById(R.id.rb74);
        b75 = view.findViewById(R.id.rb75);
        b76 = view.findViewById(R.id.rb76);
        b77 = view.findViewById(R.id.rb77);
        b78 = view.findViewById(R.id.rb78);
        b79 = view.findViewById(R.id.rb79);
        b80 = view.findViewById(R.id.rb80);
        b81 = view.findViewById(R.id.rb81);
        b82 = view.findViewById(R.id.rb82);
        b83 = view.findViewById(R.id.rb83);
        b84= view.findViewById(R.id.rb84);
        b85 = view.findViewById(R.id.rb85);
        b86 = view.findViewById(R.id.rb86);
        b87 = view.findViewById(R.id.rb87);


        btn_cuest1 = view.findViewById(R.id.btn_cuest1);

        btn_cuest1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validar();

                Bundle bundle = new Bundle();
                bundle.putInt("Res1",resul1 );
                bundle.putInt("Res2",resul2 );
                bundle.putInt("Res3",resul3 );
                bundle.putInt("Edad",edad );

                getParentFragmentManager().setFragmentResult("key2", bundle);
                Navigation.findNavController(view).navigate(R.id.resultadoCSBS);



            }
        });

        return view;
    }


    public void validar() {


        if (b1.isChecked()) {
            resul1 += 0;
        }
        if (b2.isChecked()) {
            resul1 += 1;
        }
        if (b3.isChecked()) {
            resul1 += 2;
        }
        if (b4.isChecked()) {
            resul1 += 0;
        }
        if (b5.isChecked()) {
            resul1 += 1;
        }
        if (b6.isChecked()) {
            resul1 += 2;
        }
        if (b7.isChecked()) {
            resul1 += 0;
        }
        if (b8.isChecked()) {
            resul1 += 1;
        }
        if (b9.isChecked()) {
            resul1 += 2;
        }
        if (b10.isChecked()) {
            resul1 += 0;
        }

        if (b11.isChecked()) {
            resul1 += 1;
        }
        if (b12.isChecked()) {
            resul1 += 2;
        }
        if (b13.isChecked()) {
            resul1 += 0;
        }
        if (b14.isChecked()) {
            resul1 += 1;
        }
        if (b15.isChecked()) {
            resul1 += 2;
        }
        if (b16.isChecked()) {
            resul1 += 0;
        }
        if (b17.isChecked()) {
            resul1 += 1;
        }
        if (b18.isChecked()) {
            resul1 += 2;
        }
        if (b19.isChecked()) {
            resul1 += 0;
        }
        if (b20.isChecked()) {
            resul1 += 1;
        }


        if (b21.isChecked()) {
            resul1 += 2;
        }
        if (b22.isChecked()) {
            resul1 += 0;
        }
        if (b23.isChecked()) {
            resul1 += 1;
        }
        if (b24.isChecked()) {
            resul1 += 2;
        }
        if (b25.isChecked()) {
            resul1 += 0;
        }
        if (b26.isChecked()) {
            resul1 += 1;
        }
        if (b27.isChecked()) {
            resul1 += 2;
        }
        if (b28.isChecked()) {
            resul1 += 0;
        }
        if (b29.isChecked()) {
            resul1 += 1;
        }
        if (b30.isChecked()) {
            resul1 += 2;
        }


        if (b31.isChecked()) {
            resul1 += 0;
        }
        if (b32.isChecked()) {
            resul1 += 1;
        }
        if (b33.isChecked()) {
            resul1 += 2;
        }
        if (b34.isChecked()) {
            resul1 += 0;
        }
        if (b35.isChecked()) {
            resul1 += 1;
        }
        if (b36.isChecked()) {
            resul1 += 2;
        }
        if (b37.isChecked()) {
            resul1 += 0;
        }
        if (b38.isChecked()) {
            resul1 += 1;
        }
        if (b39.isChecked()) {/*1.	Compuesto de Comunicación:     */
            resul1 += 2;
        }


        if (b40.isChecked()) {
            resul2 += 0;
        }
        if (b41.isChecked()) {
            resul2 += 1;
        }
        if (b42.isChecked()) {
            resul2 += 2;
        }
        if (b43.isChecked()) {
            resul2 += 0;
        }
        if (b44.isChecked()) {
            resul2 += 1;
        }
        if (b45.isChecked()) {
            resul2 += 2;
        }


        if (b46.isChecked()) {
            resul2 += 0;
        }
        if (b47.isChecked()) {
            resul2 += 1;
        }
        if (b48.isChecked()) {
            resul2 += 2;
        }
        if (b49.isChecked()) {
            resul2 += 3;
        }
        if (b50.isChecked()) {
            resul2 += 4;
        }


        if (b51.isChecked()) {
            resul2 += 0;
        }
        if (b52.isChecked()) {
            resul2 += 1;
        }
        if (b53.isChecked()) {
            resul2 += 2;
        }
        if (b54.isChecked()) {
            resul2 += 3;
        }
        if (b55.isChecked()) {
            resul2 += 4;
        }


        if (b56.isChecked()) {
            resul2 += 0;
        }
        if (b57.isChecked()) {
            resul2 += 1;
        }
        if (b58.isChecked()) {/*2.	Compuesto lenguaje expresivo:*/
            resul2 += 2;
        }


        if (b59.isChecked()) {
            resul3 += 0;
        }
        if (b60.isChecked()) {
            resul3 += 1;
        }

        if (b61.isChecked()) {
            resul3 += 2;
        }


        if (b62.isChecked()) {
            resul3 += 0;
        }
        if (b63.isChecked()) {
            resul3 += 1;
        }
        if (b64.isChecked()) {
            resul3 += 2;
        }
        if (b65.isChecked()) {
            resul3 += 3;
        }
        if (b66.isChecked()) {
            resul3 += 4;
        }


        if (b67.isChecked()) {
            resul3 += 0;
        }
        if (b68.isChecked()) {
            resul3 += 1;
        }
        if (b69.isChecked()) {
            resul3 += 2;
        }


        if (b70.isChecked()) {
            resul3 += 0;
        }


        if (b71.isChecked()) {
            resul3 += 1;
        }
        if (b72.isChecked()) {
            resul3 += 2;
        }
        if (b73.isChecked()) {
            resul3 += 3;
        }
        if (b74.isChecked()) {
            resul3 += 4;
        }


        if (b75.isChecked()) {
            resul3 += 0;
        }
        if (b76.isChecked()) {
            resul3 += 1;
        }
        if (b77.isChecked()) {
            resul3 += 2;
        }
        if (b78.isChecked()) {
            resul3 += 3;
        }


        if (b79.isChecked()) {
            resul3 += 0;
        }
        if (b80.isChecked()) {
            resul3 += 1;
        }
        if (b81.isChecked()) {/*3.	Compuesto simbólico:*/
            resul3 += 2;
        }


        if (b82.isChecked()) {
            edad = 1;
        }
        if (b83.isChecked()) {
            edad = 2;
        }
        if (b84.isChecked()) {
            edad = 3;
        }
        if (b85.isChecked()) {
            edad = 4;
        }
        if (b86.isChecked()) {
            edad = 5;
        }
        if (b87.isChecked()) {
            edad = 6;
        }












    }


}