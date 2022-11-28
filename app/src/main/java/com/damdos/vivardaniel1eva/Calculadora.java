package com.damdos.vivardaniel1eva;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class Calculadora extends AppCompatActivity {
private TextView calcular, resultado;
private String calc, res;
    private boolean puntoInsert, resultadoOper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        calcular = findViewById(R.id.pantallaoperacion);
        resultado = findViewById(R.id.pantallaresultado);

        calc="";
        res="";

        puntoInsert= false;
        resultadoOper= false;
        Button btnalcuadrado = findViewById(R.id.btnalcuadrado);
        Button btncero = findViewById(R.id.btncero);
        Button btnpunto = findViewById(R.id.btnpunto);
        Button btnigual = findViewById(R.id.btnigual);
        Button btnuno = findViewById(R.id.btnuno);
        Button btndos = findViewById(R.id.btndos);
        Button btntres = findViewById(R.id.btntres);
        Button btnmas = findViewById(R.id.btnmas);
        Button btncuatro = findViewById(R.id.btncuatro);
        Button btncinco = findViewById(R.id.btncinco);
        Button btnseis = findViewById(R.id.btnseis);
        Button btnmenos = findViewById(R.id.btnmenos);
        Button btnsiete = findViewById(R.id.btnsiete);
        Button btnocho = findViewById(R.id.btnocho);
        Button btnnueve = findViewById(R.id.btnnueve);
        Button btnpor = findViewById(R.id.btnpor);
        Button btnborrar = findViewById(R.id.btnborrar);
        Button btninv = findViewById(R.id.btninv);
        Button btndiv = findViewById(R.id.btndiv);



        btncero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc=calc+"0";
                pantallaUno();
            }
        });

        btnuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc=calc+"1";
                pantallaUno();
            }
        });

        btndos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc=calc+"2";
                pantallaUno();
            }
        });

        btntres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc=calc+"3";
                pantallaUno();
            }
        });

        btncuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc=calc+"4";
                pantallaUno();
            }
        });

        btncinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc=calc+"5";
                pantallaUno();
            }
        });

        btnseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc=calc+"6";
                pantallaUno();
            }
        });

        btnsiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc=calc+"7";
                pantallaUno();
            }
        });

        btnocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc=calc+"8";
                pantallaUno();
            }
        });

        btnnueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc= calc+"9";
                pantallaUno();
            }
        });

        btnpunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText("0");

                /*
                Si la pantalla de calculo esta vacia inseta "0." validando
                a true puntoInsert
                 */
                if(calc.isEmpty()){
                    calc= "0.";
                    puntoInsert = true;
                }
                /*
                Si no hay punto insertado siendo == a false se inserta en la
                pantalla de calculo  un "."
                 */
                if(!puntoInsert){
                    calc=calc+".";
                    puntoInsert = true;
                }
                pantallaUno();
            }
        });

        btnborrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                borrar();
                pantallaUno();
                pantallaDos();
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText("0");

                puntoInsert=false;
                if(!calc.isEmpty()){
                    if(!resultadoOper){
                        if(calc.equals("0.")){
                            return;
                        }else {
                            calc= calc + " / ";
                        }
                        resultadoOper=true;

                    }
                }
                pantallaUno();
            }
        });

        btnpor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText("0");

                puntoInsert=false;
                if(!calc.isEmpty()){
                    if(!resultadoOper){
                        if(calc.equals("0.")){
                            return;
                        }else
                            calc= calc + " * ";
                        resultadoOper=true;

                    }
                }
                pantallaUno();
            }
        });

        btnmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText("0");

                puntoInsert=false;


                if(!calc.isEmpty()){
                    if(!resultadoOper){
                        if(calc.equals("0.")){
                            return;
                        }else
                            calc= calc + " + ";
                        resultadoOper=true;

                    }
                }
                pantallaUno();

            }
        });

        btnmenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText("0");

                puntoInsert=false;



                if(!calc.isEmpty()){
                    if(!resultadoOper){
                        if(calc.equals("0.")){
                            return;
                        }else
                            calc= calc + " - ";
                        resultadoOper=true;

                    }
                }
                pantallaUno();
            }
        });

        btnalcuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!resultado.getText().equals("0")) {
                    if(res.equals("NaN")){
                        borrar();
                        pantallaUno();
                        pantallaDos();
                    }
                    if(res.equals("Infinity")){
                        borrar();
                        pantallaUno();
                        pantallaDos();
                    }
                    res = Double.toString(Double.parseDouble(res) * Double.parseDouble("2"));
                    calc = res;
                    resultadoOper=false;
                    puntoInsert = true;
                    pantallaDos();
                    pantallaUno();
                }
        }
});
        btninv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!resultado.getText().equals("0")) {


                    invertir(resultado.getText().toString());
                    if(resultado.getText().toString().substring(resultado.getText().toString().length() - 1).contains("-")){

                        calc = resultado.getText().toString().substring(0, resultado.getText().toString().length()-1);
                        pantallaUno();
                    }
                    if(!resultado.getText().toString().substring(resultado.getText().toString().length() - 1).contains("-")){
                        calc = resultado.getText().toString();
                        pantallaUno();
                    }

                }

            }
        });

        btnigual.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(resultadoOper && !calc.endsWith(" ")){


                    String [] numeros = calc.split(" ");

                    switch  (numeros[1].charAt(0)){
                        case '+':
                            if(calcular.getText().toString().substring(calcular.getText().toString().length() - 1).contains(".")){
                                return;
                            }
                            res = Double.toString(Double.parseDouble(numeros[0]) + Double.parseDouble(numeros[2]));

                            break;
                        case '-':
                            if(calcular.getText().toString().substring(calcular.getText().toString().length() - 1).contains(".")){
                                return;
                            }
                            res = Double.toString(Double.parseDouble(numeros[0]) - Double.parseDouble(numeros[2]));
                            break;
                        case '/':
                            if(calcular.getText().toString().substring(calcular.getText().toString().length() - 1).contains(".")){
                                return;
                            }
                            res = Double.toString(Double.parseDouble(numeros[0]) / Double.parseDouble(numeros[2]));
                            break;
                        case '*':
                            if(calcular.getText().toString().substring(calcular.getText().toString().length() - 1).contains(".")){
                                return;
                            }
                            res = Double.toString(Double.parseDouble(numeros[0]) * Double.parseDouble(numeros[2]));
                            break;
                    }

                    resultadoOper=false;

                    pantallaDos();
                    calc= res;
                    pantallaUno();
                    puntoInsert = true;
                    if(calc.equals("NaN")){
                        calcular.setText("");
                        resultado.setText("No valido");
                        calc="";
                        puntoInsert = false;
                        resultadoOper=false;

                    }
                    if(calc.equals("Infinity")){
                        calcular.setText("");
                        resultado.setText("Infinito");
                        calc="";
                        puntoInsert = false;
                        resultadoOper=false;

                    }
                }
            }
        });

    }
    public void pantallaUno(){
        calcular.setText(calc);


    }
    public void pantallaDos(){


        resultado.setText(res);
    }

    public void borrar(){
        calc="";
        res="0";
        puntoInsert=false;
        resultadoOper=false;
        resultado.setText("0");
    }
    /*
    Función para invertir el String del resultado.
     */
    public void invertir(String res){
        if(res.equals("NaN")){
            borrar();
            pantallaUno();
            pantallaDos();
        }
        if(res.equals("Infinity")){
            borrar();
            pantallaUno();
            pantallaDos();
        }
        String reverse = new StringBuffer(res).reverse().toString();
        resultado.setText(reverse);
    }
    /*
    Función para eliminar decimales del double.
     */
    /*private static String doubleSinDecimals(String valor){
        DecimalFormat df = new DecimalFormat("0");
        return df.format(Double.parseDouble(valor));
    }*/
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