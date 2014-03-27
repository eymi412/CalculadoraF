package tec2.celes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Eymi on 22/03/14.
 */
public class Convertidor extends Activity {
    protected Button btnC;
    protected Button btnF;
    protected EditText numero;
    protected TextView resultado;
    protected Button btnAtras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertidor);
        initComponents();
    }

    public void initComponents() {
        btnC = (Button) findViewById(R.id.btnC);
        btnF = (Button) findViewById(R.id.btnF);
        numero = (EditText) findViewById(R.id.txtNum);
        resultado = (TextView) findViewById(R.id.lblRes);
        btnAtras = (Button) findViewById(R.id.btnAtras);

        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Convertidor.this, principalActivity.class);
                startActivity(i);
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                convertirGradosCentigrados();
            }
        });
        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertirGradosFahrenheit();
            }
        });

    }
    public void convertirGradosCentigrados() {
        double valor = Double.parseDouble(this.numero.getText().toString());
        double resul = ((valor-32) * 5)/9;
        this.resultado.setText(resul + "  Grados Centigrados");
    }

    public void convertirGradosFahrenheit() {
        double valor = Double.parseDouble(this.numero.getText().toString());
        double resul = ((valor * 9)/5) + 32;
        this.resultado.setText(resul + "  Grados Fahrenheit");
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.principal, menu);
        return true;
    }

}
