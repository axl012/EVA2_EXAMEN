package hipo.prop.app.axel.com.eva2_examen;

/**
 * Created by axel012 on 11/27/2017.
 */

public class Reviews {
    String Nombre, Direccion, Descripcion;
    int Imagen, Rating;

    public Reviews(String Nombre, String Descripcion, String Direccion,
                             int Imagen, int Rating) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Direccion = Direccion;
        this.Imagen = Imagen;
        this.Rating = Rating;
    }


    public String getNombre() {

        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int Imagen) {
        this.Imagen = Imagen;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int Rating) {
        this.Rating = Rating;
    }
}
