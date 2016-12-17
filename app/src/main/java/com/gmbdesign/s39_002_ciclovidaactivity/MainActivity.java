package com.gmbdesign.s39_002_ciclovidaactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    /*
     * Para comprobar y estudiar el ciclo de vida de un activity, vamos a sobreescribir
     * todos los metodos de la clase activity incluyendo una linea de Log para demostrar
     * los pasos que va dando.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Vamos a comprobar si hay datos en el Bundle
        if (savedInstanceState == null) {
            //el Bundle está vacio
            Log.v("S39_002_CicloVida", "El Bundle esta vacio");

        } else {
            //hay datos almacenados en el Bundle
            Log.v("S39_002_CicloVida", "El Bundle tiene contenido almacenado");
            String datoAlmacenado = (String) savedInstanceState.get("nombre");
            Log.v("S39_002_CicloVida", "El contenido almacenado es: "+datoAlmacenado);
        }

        setContentView(R.layout.activity_main);
        Log.v("S39_002_CicloVida", "Paso por onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("S39_002_CicloVida", "Paso por onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("S39_002_CicloVida", "Paso por onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("S39_002_CicloVida", "Paso por onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("S39_002_CicloVida", "Paso por onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("S39_002_CicloVida", "Paso por onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("S39_002_CicloVida", "Paso por onDestroy");
    }

    /*
     * Este Metodo es para salvar pequeñas cosas en memoria y no perderlo siempre que se reconstruye
     * la actividad. Es como un saco (analogia con el contexto en JAVA EE). PERSISTENCIA DE DATOS.
     */

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putCharSequence("nombre","Gustavo");
    }
}
