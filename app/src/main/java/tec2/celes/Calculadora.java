package tec2.celes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by USK on 23/03/14.
 */
public class Calculadora extends Activity {

    protected Button btn1;
    protected Button btn2;
    protected Button btn3;
    protected Button btn4;
    protected Button btn5;
    protected Button btn6;
    protected Button btn7;
    protected Button btn8;
    protected Button btn9;
    protected Button btn0;
    protected Button btnSuma;
    protected Button btnResta;
    protected Button btnDivision;
    protected Button btnMultiplicacion;
    protected Button btnIgual;
    protected TextView pantalla;
    protected String textoPantalla;
    protected int auxId;
    protected double unaOperacion;
    protected Button btnRegresar;
    protected View.OnClickListener listener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            Button b = (Button) v;
            switch(v.getId()) {
                case R.id.btnMultiplicar:
                    unaOperacion = Double.parseDouble(pantalla.getText().toString());
                    pantalla.setText("");
                    auxId = v.getId();

                    break;
                case R.id.btnSuma:
                    unaOperacion = Double.parseDouble(pantalla.getText().toString());
                    pantalla.setText("");
                    auxId = v.getId();
                    break;
                case R.id.btnResta:
                    unaOperacion = Double.parseDouble(pantalla.getText().toString());
                    pantalla.setText("");
                    auxId = v.getId();
                    break;
                case R.id.btnDivision:
                    unaOperacion = Double.parseDouble(pantalla.getText().toString());
                    pantalla.setText("");
                    auxId = v.getId();
                    break;

                case R.id.btnIgual:
                    switch(auxId) {
                        case R.id.btnMultiplicar:

                            pantalla.setText("" + (unaOperacion * (Double.parseDouble(pantalla.getText().toString()))));
                            unaOperacion = 0;
                            break;
                        case R.id.btnSuma:

                            pantalla.setText("" + (unaOperacion + (Double.parseDouble(pantalla.getText().toString()))));
                            unaOperacion = 0;
                            break;
                        case R.id.btnResta:

                            pantalla.setText("" + (unaOperacion - (Double.parseDouble(pantalla.getText().toString()))));
                            unaOperacion = 0;
                            break;
                        case R.id.btnDivision:

                            pantalla.setText("" + (unaOperacion / (Double.parseDouble(pantalla.getText().toString()))));
                            unaOperacion = 0;
                            break;
                        default:
                            recibirNumero(b.getText().toString());
                            break;
                    }
                    break;
                default:
                    recibirNumero(b.getText().toString());
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        initComponents();
    }

    public void initComponents() {

        pantalla = (TextView) findViewById(R.id.pantalla);

        btnRegresar = (Button) findViewById(R.id.btnRegresar);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5= (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btnSuma = (Button) findViewById(R.id.btnSuma);
        btnResta = (Button) findViewById(R.id.btnResta);
        btnMultiplicacion = (Button) findViewById(R.id.btnMultiplicar);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnIgual = (Button) findViewById(R.id.btnIgual);
        btn1.setOnClickListener(listener);
        btn2.setOnClickListener(listener);
        btn3.setOnClickListener(listener);
        btn4.setOnClickListener(listener);
        btn5.setOnClickListener(listener);
        btn6.setOnClickListener(listener);
        btn7.setOnClickListener(listener);
        btn8.setOnClickListener(listener);
        btn9.setOnClickListener(listener);
        btn0.setOnClickListener(listener);
        btnMultiplicacion.setOnClickListener(listener);
        btnDivision.setOnClickListener(listener);
        btnSuma.setOnClickListener(listener);
        btnResta.setOnClickListener(listener);
        btnIgual.setOnClickListener(listener);


        btnRegresar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
               Intent i = new Intent(Calculadora.this,principalActivity.class);
                startActivity(i);
            }
        });
    }

    public void realizarOperacion(){

    }


    public void recibirNumero(String numero) {
        textoPantalla = pantalla.getText().toString();
        textoPantalla += numero;
        pantalla.setText(textoPantalla);
    }
    public boolean onCrateOptionsMenu(Menu menu){ getMenuInflater().inflate(R.menu.principal, menu);
return true;}
}