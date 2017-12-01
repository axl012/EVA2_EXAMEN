package hipo.prop.app.axel.com.eva2_examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RatingBar;

public class List extends AppCompatActivity implements ListView.OnItemClickListener{
    ListView listRest;
    Arreglo data = new Arreglo();
    Reviews[] rDatosR = new Reviews[data.datalist.size()];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        data.datalist.toArray(rDatosR); //PARA OBTENER LO DATOS
        listRest =  findViewById(R.id.listrest);
        listRest.setAdapter(new CustomAdapter(this,R.layout.listview,rDatosR));
        listRest.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        int Index = i;
        Intent inDetRest = new Intent(this, Review.class);
        int Imag = rDatosR[i].Imagen;
        String NomR = rDatosR[i].Nombre;
        String Descrip = rDatosR[i].Descripcion;
        String Direcc = rDatosR[i].Direccion;
        int rate = rDatosR[i].Rating;
        listRest.invalidateViews();
        inDetRest.putExtra("IMAGEN",Imag);
        inDetRest.putExtra("NOMBRER", NomR);
        inDetRest.putExtra("DESCRIP",Descrip);
        inDetRest.putExtra("DIRECC",Direcc);
        inDetRest.putExtra("CALIFA",rate);
        inDetRest.putExtra("INDICE", Index);
        startActivity(inDetRest);
    }

    @Override
    protected void onResume() {
        super.onResume();
        listRest.invalidateViews(); //PARA ACTUALIZAR LA LISTA EN CASI DE CAMBAIR EVALUACIÓN
    }

}
