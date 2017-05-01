package com.example.gaby.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public double numero1,numero2,resultado;
    public String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void PrimerNumero(View v){
        TextView tv = (TextView) findViewById(R.id.tvResultado) ;
        numero1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }
    public void igual(View v){
        TextView tv = (TextView) findViewById(R.id.tvResultado) ;
        numero2 = Double.parseDouble(tv.getText().toString());

        if(operador.equals("+"))
        {
            resultado= numero1+numero2;
        }
        else if(operador.equals("-"))
        {
            resultado= numero1-numero2;
        }
        else if(operador.equals("*"))
        {
            resultado= numero1*numero2;
        }
        else if(operador.equals("/"))
        {
            resultado= numero1/numero2;
        }
        tv.setText(String.valueOf(resultado));
    }
    public void suma(View v)
    {
        operador="+";
        PrimerNumero(v);
    }
    public void resta(View v)
    {
        operador="-";
        PrimerNumero(v);
    }
    public void multiplicacion(View v)
    {
        operador="*";
        PrimerNumero(v);
    }
    public void division(View v)
    {
        operador="/";
        PrimerNumero(v);
    }
    public void CE(View v)
    {
        numero1=0.0;
        numero2=0.0;
        TextView tv = (TextView) findViewById(R.id.tvResultado) ;
        tv.setText("");
    }

    public void uno(View v)
    {
        TextView tv = (TextView) findViewById(R.id.tvResultado) ;
        tv.setText(tv.getText() + "1");
    }
    public void dos(View v)
    {
        TextView tv = (TextView) findViewById(R.id.tvResultado) ;
        tv.setText(tv.getText() + "2");
    }
    public void tres(View v)
    {
        TextView tv = (TextView) findViewById(R.id.tvResultado) ;
        tv.setText(tv.getText() + "3");
    }
    public void cuatro(View v)
    {
        TextView tv = (TextView) findViewById(R.id.tvResultado) ;
        tv.setText(tv.getText() + "4");
    }
    public void cinco(View v)
    {
        TextView tv = (TextView) findViewById(R.id.tvResultado) ;
        tv.setText(tv.getText() + "5");
    }
    public void seis(View v)
    {
        TextView tv = (TextView) findViewById(R.id.tvResultado) ;
        tv.setText(tv.getText() + "6");
    }
    public void siete(View v)
    {
        TextView tv = (TextView) findViewById(R.id.tvResultado) ;
        tv.setText(tv.getText() + "7");
    }
    public void ocho(View v)
    {
        TextView tv = (TextView) findViewById(R.id.tvResultado) ;
        tv.setText(tv.getText() + "8");
    }
    public void nueve(View v)
    {
        TextView tv = (TextView) findViewById(R.id.tvResultado) ;
        tv.setText(tv.getText() + "9");
    }
    public void cero(View v)
    {
        TextView tv = (TextView) findViewById(R.id.tvResultado) ;
        tv.setText(tv.getText() + "0");
    }
    public void coma(View v)
    {
        TextView tv = (TextView) findViewById(R.id.tvResultado);
        tv.setText(tv.getText() + ".");
    }

}
