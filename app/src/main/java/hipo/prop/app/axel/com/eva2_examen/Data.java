package hipo.prop.app.axel.com.eva2_examen;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Data extends AppCompatActivity {
    ImageView imgImage;
    Intent inImagen;
    final static int RETURN_IMAGE = 1000;
    Arreglo data = new Arreglo();
    EditText txtNombre, txtDescripcion, txtDireccion;
    int imgImagen = R.drawable.cafelore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        inImagen = new Intent(this,ImageList.class);
        imgImage = findViewById(R.id.imgImage);
        txtNombre = findViewById(R.id.edtxtNombre);
        txtDescripcion = findViewById(R.id.edtxtDescripcion);
        txtDireccion = findViewById(R.id.edtxtDireccion);
    }

    public void onClickImage(View v) {
        startActivityForResult(inImagen, RETURN_IMAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==RETURN_IMAGE){
            if (resultCode== Activity.RESULT_OK){
                imgImagen = data.getIntExtra("IMAGEN", R.drawable.cafelore);
                imgImage.setImageResource(imgImagen);
            } else {
                Toast.makeText(this, "EL USUARIO CANCELOOOOOO", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void onClickGuardar(View view){
        String nombre, descripcion, direccion;
        nombre = txtNombre.getText().toString();
        descripcion = txtDescripcion.getText().toString();
        direccion = txtDireccion.getText().toString();
        data.datalist.add(new Reviews(nombre, descripcion, direccion, imgImagen, 2));
        finish();
    }
}
