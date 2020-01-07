package com.example.rjpgjson;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    EditText tnombre, tedad, tcorreo, tcurp;
    TextView lbljson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tnombre=findViewById(R.id.tnombre);
       tedad=findViewById(R.id.tedad);
        tcorreo=findViewById(R.id.tcorreo);
        tcurp=findViewById(R.id.tcurp);


        lbljson=findViewById(R.id.lbljson);


    }

    public void btncargamos(View v){
        Informacion datosobj = new Informacion (tnombre.getText().toString(),Integer.parseInt(tedad.getText().toString()), tcorreo.getText().toString(), tcurp.getText().toString());
        Gson gson = new Gson();
        String cJson = gson.toJson(datosobj);
        lbljson.setText(cJson);
        Informacion datosobj1= gson.fromJson(cJson,Informacion.class);

        Log.i("informacion de Json -->", "Nombre " + datosobj1.getNombre() + ",Edad " + datosobj1.getEdad() + ",Correo " + datosobj1.getCorreo() + ",Curp " + datosobj1.getCURP());

    }
}

