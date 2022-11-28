package com.damdos.vivardaniel1eva;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    ImageView imagen;
    Button botonContacto;
    ImageButton botonCalculadora;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.nombreInicio);

        imagen= findViewById(R.id.imagenPrincipal);

        Animation animacion2 = AnimationUtils.loadAnimation(this, R.anim.rotacion);
        textView.startAnimation(animacion2);

        imagen.setImageResource(R.drawable.logo);


        botonContacto = findViewById(R.id.botonContacto);


        botonContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent botonContacto = new Intent(MainActivity.this, Contacto.class);
                startActivity(botonContacto);



            }
        });

        botonCalculadora = findViewById(R.id.botonCalculadora);
        botonCalculadora.setImageResource(R.drawable.calculadora3);

        botonCalculadora.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent botonCalculadora = new Intent(MainActivity.this, Calculadora.class);
                                            startActivity(botonCalculadora);

                                        }
                                    }

        );
    }
    /*
    Métodos de ejecución de Activitys
     */
public void ejecutar_cuestionario(View view){
        Intent i = new Intent(this, Contacto.class);
        startActivity(i);
}
public void ejecutar_calculadora(View view){
        Intent i = new Intent(this, Calculadora.class);
        startActivity(i);
}
    public void ejecutar_inicio(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
/*
Creación del menú
 */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
/*
Configurar las acciones del menú
 */
    @Override
    public boolean onOptionsItemSelected(MenuItem opcion_menu) {
        int id=opcion_menu.getItemId();

        if (id==R.id.action_calculadora)
        {
            ejecutar_calculadora(null);
            return true;
        }
        if (id==R.id.action_calculadora_img)
        {
            ejecutar_calculadora(null);
            return true;
        }
        if (id==R.id.action_cuestionario)
        {
            ejecutar_cuestionario(null);
            return true;
        }
        if (id==R.id.action_cuestionario_img)
        {
            ejecutar_cuestionario(null);
            return true;
        }
        if (id==R.id.action_calculadora_micalculadora)
        {
            ejecutar_calculadora(null);
            return true;
        }

        if (id==R.id.action_calculadora_calculadoraonline)
        {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://web2.0calc.es/")));
            return true;
        }
        if (id==R.id.action_cuestionario_mail)
        {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://mail.google.com/mail/u/0/?hl=es#inbox")));
            return true;
        }



        if (id==R.id.action_cuestionario_gmail)
        {
            ejecutar_cuestionario(null);
            return true;
        }






        if (id==R.id.action_inicio)
        {
            ejecutar_inicio(null);
            return true;
        }
        return super.onOptionsItemSelected(opcion_menu);
    }
}