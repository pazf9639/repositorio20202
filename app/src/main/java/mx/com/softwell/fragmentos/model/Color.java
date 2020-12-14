package mx.com.softwell.fragmentos.model;

public class Color {
    private int idjuego;
    private String nombre;
    private String apellido;
    private int clasificacion;
    private String imagen;

    public Color() {

    }
    public Color(int idjuego,String imagen,String nombre,int clasificacion, String apellido) {
        this.idjuego=idjuego;
        this.imagen = imagen;
this.nombre=nombre;
this.clasificacion=clasificacion;
this.apellido=apellido;
    }

    public int getIdjuego() {
        return idjuego;
    }

    public void setIdjuego(int idjuego) {
        this.idjuego = idjuego;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImagen(){return imagen; }

    public void setImagen(String imagen){this.imagen=imagen;}


}
