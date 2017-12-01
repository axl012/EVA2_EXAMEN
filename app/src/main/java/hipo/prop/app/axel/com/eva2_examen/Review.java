package hipo.prop.app.axel.com.eva2_examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Review extends AppCompatActivity {
    ImageView imgIm;
    TextView txtnom, txtdes, txtdir;
    RatingBar ratei;
    int indice;
    String Nom;
    String Des;
    String Dir;
    int Img;
    Arreglo data = new Arreglo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
        imgIm =  findViewById(R.id.imgImagen);
        txtnom =  findViewById(R.id.txtNombre);
        txtdes =  findViewById(R.id.txtDescripcion);
        txtdir =  findViewById(R.id.txtDireccion);
        ratei =  findViewById(R.id.ratingBar);

        Intent inDatosRShow = getIntent();//SE OBTIENE EL INTENTO
        Img = inDatosRShow.getIntExtra("IMAGEN",R.drawable.cafelore);
        Nom = inDatosRShow.getStringExtra("NOMBRER");
        Des = inDatosRShow.getStringExtra("DESCRIP");
        Dir = inDatosRShow.getStringExtra("DIRECC");
        int rat = inDatosRShow.getIntExtra("CALIFA",R.id.ratingBar);
        indice = inDatosRShow.getIntExtra("INDICE", 0);
        imgIm.setImageResource(Img);
        txtnom.setText(Nom);
        txtdes.setText(Des);
        txtdir.setText(Dir);
        ratei.setRating(rat);
    }

    @Override
    protected void onResume() {
        super.onResume();
        data.datalist.get(indice).setRating((int)ratei.getRating());    }

    //PARA CUADO SE CAMBIA LA CALIFICACIÓN
    public void onClickRating(View v){
        data.datalist.get(indice).setRating((int)ratei.getRating());
        finish();
    }


}
