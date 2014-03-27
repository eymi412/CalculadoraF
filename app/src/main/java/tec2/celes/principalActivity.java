package tec2.celes;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class principalActivity extends Activity {
    protected Button btncalculadora;
    protected Button btnConverGrad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_principal);

        btncalculadora = (Button) findViewById(R.id.btncalculadora);
        btnConverGrad = (Button) findViewById(R.id.btnConverGrad);

        btncalculadora.setOnClickListener (new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                cambiaracalculadora();
            }

        });
        btnConverGrad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cambiaraconvertidor();

            }
        });

    }

     private void cambiaracalculadora(){
         Intent i = new Intent(this,Calculadora.class);
         startActivity(i);
     }
    private void cambiaraconvertidor(){
        Intent i = new Intent(this,Convertidor.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.principal, menu);
        return true;
    }

}
