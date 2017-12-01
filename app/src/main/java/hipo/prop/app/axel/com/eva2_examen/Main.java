package hipo.prop.app.axel.com.eva2_examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main extends AppCompatActivity {
    Intent inCaptura, inMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inCaptura  = new Intent(this,Data.class);
        inMostrar  = new Intent(this,List.class);
    }

    public void onClick(View v){
        if(v.getId() == R.id.btnCapturar){
            startActivity(inCaptura);
        }else if(v.getId() == R.id.btnMostrar){
            startActivity(inMostrar);
        }else if(v.getId() == R.id.btnSalir){
            finish();
        }
    }

}
