package hipo.prop.app.axel.com.eva2_examen;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ImageList extends AppCompatActivity {
    ImageView imgSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_list);
        imgSelect = findViewById(R.id.image1);
    }

    public void onClickImage1(View v){
        int iImagenR = R.drawable.bourkestreetbakery;
        Intent inDatos = new Intent();
        inDatos.putExtra("IMAGEN",iImagenR);
        setResult(Activity.RESULT_OK,inDatos);
        finish();
    }

    public void onClickImage2(View v){
        int iImagenR = R.drawable.barrafina;
        Intent inDatos = new Intent();
        inDatos.putExtra("IMAGEN",iImagenR);
        setResult(Activity.RESULT_OK,inDatos);
        finish();
    }

    public void onClickImage3(View v){
        int iImagenR = R.drawable.cafedeadend;
        Intent inDatos = new Intent();
        inDatos.putExtra("IMAGEN",iImagenR);
        setResult(Activity.RESULT_OK,inDatos);
        finish();
    }

    public void onClickImage4(View v){
        int iImagenR = R.drawable.cafeloisl;
        Intent inDatos = new Intent();
        inDatos.putExtra("IMAGEN",iImagenR);
        setResult(Activity.RESULT_OK,inDatos);
        finish();
    }

    public void onClickImage5(View v){
        int iImagenR = R.drawable.cafelore;
        Intent inDatos = new Intent();
        inDatos.putExtra("IMAGEN",iImagenR);
        setResult(Activity.RESULT_OK,inDatos);
        finish();
    }

    public void onClickImage6(View v){
        int iImagenR = R.drawable.confessional;
        Intent inDatos = new Intent();
        inDatos.putExtra("IMAGEN",iImagenR);
        setResult(Activity.RESULT_OK,inDatos);
        finish();
    }

    public void onClickImage7(View v){
        int iImagenR = R.drawable.donostia;
        Intent inDatos = new Intent();
        inDatos.putExtra("IMAGEN",iImagenR);
        setResult(Activity.RESULT_OK,inDatos);
        finish();
    }

    public void onClickImage8(View v){
        int iImagenR = R.drawable.fiveleaves;
        Intent inDatos = new Intent();
        inDatos.putExtra("IMAGEN",iImagenR);
        setResult(Activity.RESULT_OK,inDatos);
        finish();
    }

    public void onClickImage9(View v){
        int iImagenR = R.drawable.forkeerestaurant;
        Intent inDatos = new Intent();
        inDatos.putExtra("IMAGEN",iImagenR);
        setResult(Activity.RESULT_OK,inDatos);
        finish();
    }

    public void onClickImage10(View v){
        int iImagenR = R.drawable.grahamavenuemeats;
        Intent inDatos = new Intent();
        inDatos.putExtra("IMAGEN",iImagenR);
        setResult(Activity.RESULT_OK,inDatos);
        finish();
    }

    public void onClickImage11(View v){
        int iImagenR = R.drawable.haighschocolate;
        Intent inDatos = new Intent();
        inDatos.putExtra("IMAGEN",iImagenR);
        setResult(Activity.RESULT_OK,inDatos);
        finish();
    }

}
