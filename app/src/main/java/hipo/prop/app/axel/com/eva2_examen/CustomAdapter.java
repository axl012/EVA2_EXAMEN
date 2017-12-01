package hipo.prop.app.axel.com.eva2_examen;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<Reviews> {
    Context cntApp;
    int iLayout;
    Reviews[] rDatos;

    public CustomAdapter(Context context, int resource, Reviews[] objects) {
        super(context, resource, objects);
        cntApp = context;
        iLayout = resource;
        rDatos = objects;
    }

    @NonNull
    @Override
    //OBTENER LA VISTA
    public View getView(int position, View convertView, ViewGroup parent) {
        View vFila = convertView;
        ImageView ivRestau;
        TextView txtVwNombre, txtVrDescrip;
        RatingBar rtBrCalifa;

        if (vFila == null){
            LayoutInflater liCrearLayout = ((Activity)cntApp).getLayoutInflater();
            vFila = liCrearLayout.inflate(iLayout,parent,false);
        }
        ivRestau =  vFila.findViewById(R.id.imgVwRestau);
        txtVwNombre = vFila.findViewById(R.id.txtVwNombre);
        txtVrDescrip =  vFila.findViewById(R.id.txtVwDescrip);
        rtBrCalifa =  vFila.findViewById(R.id.rtBrCalifa);

        Reviews dcOb = rDatos[position];

        ivRestau.setImageResource(dcOb.Imagen);
        txtVwNombre.setText(dcOb.Nombre);
        txtVrDescrip.setText(dcOb.Descripcion);
        rtBrCalifa.setRating(dcOb.Rating);

        //REGRESAR LA FILA
        return vFila;
    }

}
