package com.damdos.vivardaniel1eva;



import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


public class Contacto extends AppCompatActivity {
    private EditText correo , mensaje, asunto, titulo;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
        titulo= findViewById(R.id.editTextTextPersonName);
        correo = findViewById(R.id.etCorreo);
        asunto = findViewById(R.id.etAsunto);
        mensaje = findViewById(R.id.etMensaje);
        Button enviar = findViewById(R.id.enviarcorreo);
        resultado = findViewById(R.id.resultadoPuntuacion);
        SeekBar barra = findViewById(R.id.barraPuntuacion);
        barra.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            resultado.setText( i + "/10 puntos.");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                /*
                Comprobación si todos los apartados han sido cubiertos.
                 */
                if(correo.getText().toString().equals(""))
                {
                    Toast.makeText(Contacto.this,"Ingresa un Correo", Toast.LENGTH_LONG).show();
                }


                else if(asunto.getText().toString().equals(""))
                {
                    Toast.makeText(Contacto.this,"Ingresa el Asunto", Toast.LENGTH_LONG).show();
                }


                else if(mensaje.getText().toString().equals(""))
                {
                    Toast.makeText(Contacto.this, "Ingresa un Mensaje en el contenido", Toast.LENGTH_LONG).show();
                }
                else

                {
                    Intent botonEnviar = new Intent(Contacto.this, MainActivity.class);
                    startActivity(botonEnviar);
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.putExtra(Intent.EXTRA_EMAIL, new String[]{correo.getText().toString()});
                    intent.putExtra(Intent.EXTRA_TITLE, titulo.getText().toString());
                    intent.putExtra(Intent.EXTRA_SUBJECT, asunto.getText().toString());
                    intent.putExtra(Intent.EXTRA_TEXT,  resultado.getText().toString() + "\n" + mensaje.getText().toString() );
                    intent.setType("message/rfc822");
                    startActivity(Intent.createChooser(intent, "Seleccione un cliente de correo: "));

                }

            }
        });

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
        if (id==R.id.action_inicio)
        {
            ejecutar_inicio(null);
            return true;
        }
        return super.onOptionsItemSelected(opcion_menu);
    }
}