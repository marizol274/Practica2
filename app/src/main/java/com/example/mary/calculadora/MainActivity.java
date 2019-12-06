package com.example.mary.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
 boolean decimal = false;
 boolean suma = false ;
 boolean resta = false ;
 boolean multiplicacion = false ;
 boolean division =false ;
 boolean asterisco =false ;
 boolean asterisco1 =false ;
 boolean raiz =false;
 boolean igual = false ;
 double[] num = new  double[20];
 double resultado ;
 double resultado1;
 double fin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bnc =(Button)findViewById(R.id.c);
        bnc.setOnClickListener(this);
        Button bnasterisco =(Button)findViewById(R.id.asterisco);
        bnasterisco.setOnClickListener(this);
        Button bnraiz =(Button)findViewById(R.id.raiz);
        bnraiz.setOnClickListener(this);
        Button bndividir =(Button)findViewById(R.id.dividir);
        bndividir.setOnClickListener(this);
        Button bnsiete =(Button)findViewById(R.id.siete);
        bnsiete.setOnClickListener(this);
        Button bnocho =(Button)findViewById(R.id.ocho);
        bnocho.setOnClickListener(this);
        Button bnnueve =(Button)findViewById(R.id.nueve);
        bnnueve.setOnClickListener(this);
        Button bnmultiplicacion =(Button)findViewById(R.id.multiplicacion);
        bnmultiplicacion.setOnClickListener(this);
        Button bncuatro =(Button)findViewById(R.id.cuatro);
        bncuatro.setOnClickListener(this);
        Button bncinco =(Button)findViewById(R.id.cinco);
        bncinco.setOnClickListener(this);
        Button bnseis =(Button)findViewById(R.id.seis);
        bnseis.setOnClickListener(this);
        Button bnresta =(Button)findViewById(R.id.resta);
        bnresta.setOnClickListener(this);
        Button bnuno =(Button)findViewById(R.id.uno);
        bnuno.setOnClickListener(this);
        Button bndos =(Button)findViewById(R.id.dos);
        bndos.setOnClickListener(this);
        Button bntres =(Button)findViewById(R.id.tres);
        bntres.setOnClickListener(this);
        Button bnsuma =(Button)findViewById(R.id.suma);
        bnsuma.setOnClickListener(this);
        Button bncero =(Button)findViewById(R.id.cero);
        bncero.setOnClickListener(this);
        Button bnguion =(Button)findViewById(R.id.guion);
        bnguion.setOnClickListener(this);
        Button bnasterisco1 =(Button)findViewById(R.id.asterisco1);
        bnasterisco1.setOnClickListener(this);
        Button bnigual =(Button)findViewById(R.id.igual);
        bnigual.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        TextView screen = (TextView)findViewById(R.id.resultado);//identifica la la vista por donde se mostrara el resultado
        int selector = v.getId();             //IDENTIFICA EL ID DE LA VISTA  DEL PARAMETRO QUE INGRESE Y LO ALMACENA EN selector
        String x = screen.getText().toString();
        try {
            switch (selector){
                case R.id.c:
                    screen.setText("");
                    break;
                case R.id.asterisco:
                    asterisco =true;
                    num[0] = Double.parseDouble(x);
                    screen.setText("");
                    decimal = false ;
                    break;
                case R.id.raiz:
                    raiz =true;
                    num[0] = Double.parseDouble(x);
                    screen.setText("");
                    decimal = false ;
                    break;
                case R.id.dividir:
                    division =true;
                    num[0] = Double.parseDouble(x);
                    screen.setText("");
                    decimal = false ;
                    break;
                case R.id.siete:
                        screen.setText(x+ "7");
                        break;
                case R.id.ocho:
                    screen.setText(x+ "8");
                    break;
                case R.id.nueve:
                    screen.setText(x+ "9");
                    break;
                case R.id.multiplicacion:
                   multiplicacion =true;
                    num[0] = Double.parseDouble(x);
                    screen.setText("");
                    decimal = false ;
                    break;
                case R.id.cuatro:
                    screen.setText(x+ "4");
                    break;
                case R.id.cinco:
                    screen.setText(x+ "5");
                    break;
                case R.id.seis:
                    screen.setText(x+ "6");
                    break;
                case R.id.resta:
                    resta =true;
                    num[0] = Double.parseDouble(x);
                    screen.setText("");
                    decimal = false ;
                    break;
                case R.id.uno:
                    screen.setText(x+ "1");
                    break;
                case R.id.dos:
                    screen.setText(x+ "2");
                    break;
                case R.id.tres:
                    screen.setText(x+ "3");
                    break;
                case R.id.suma:
                    suma =true;
                    num[0] = Double.parseDouble(x);
                    screen.setText("");
                    decimal = false ;
                    break;
                case R.id.cero:
                    screen.setText(x+ "0");
                    break;
                case R.id.asterisco1:
                    asterisco1 = true;
                    num[0] = Double.parseDouble(x);
                    screen.setText("");
                    decimal = false ;
                    break;
                case R.id.guion:
                    if (decimal == false){
                    screen.setText(x+ ".");
                    decimal = true;
                    }else{
                        return;
                    }
                    break;
                case R.id.igual:
                    if(raiz == true){
                        resultado=Math.sqrt(num[0]);
                        screen.setText(String.valueOf(resultado));

                    }else{
                        num[1]=Double.parseDouble(x);
                        if(suma == true){
                            resultado = num[0]+num[1];
                            screen.setText(String.valueOf(resultado));
                        }else
                        {
                            if(resta == true){
                                resultado = num[0]-num[1];
                                screen.setText(String.valueOf(resultado));

                            }else
                            {
                                if (multiplicacion == true){
                                    resultado = num[0] * num[1];
                                    screen.setText(String.valueOf(resultado));
                                }else
                                {
                                    if(division == true){
                                        resultado = num[0] / num[1];
                                        screen.setText(String.valueOf(resultado));
                                    }else
                                    {
                                        if(asterisco1 == true){
                                            resultado = num[0] * num[1];
                                            screen.setText(String.valueOf(resultado));
                                        }else
                                        {
                                            if(asterisco == true){
                                                resultado = num[0] * num[1];
                                                screen.setText(String.valueOf(resultado));
                                            }

                                        }

                    }

                                }
                            }
                        }
                    }
                    decimal = false ;
                    suma = false;
                    multiplicacion=false;
                    division=false;
                    resta = false;
                    raiz =false;

            }

        }catch (Exception e){
            screen.setText("error");

        }

    }
}
