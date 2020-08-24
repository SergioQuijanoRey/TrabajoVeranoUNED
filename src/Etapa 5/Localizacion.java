
/**
 * Clase que representa una localizacion geografica
 * */
public class Localizacion{
    // Atributos
    //==========================================================================
    private String nombre;
    private double latitud;
    private double longitud;
    private double altitud;

    // Constructores
    //==========================================================================
    /**
     * Constructor de la clase
     * */
    public Localizacion(String nombre, double latitud, double longitud, double altitud){
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
        this.altitud = altitud;
    }

    // Getters
    //==========================================================================
    /**
     * Getter del nombre de la localizacion
     * */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Getter de la latitud de la localizacion
     * */
    public double getLatitud(){
        return this.latitud;
    }

    /**
     * Getter de la longitud de la localizacion
     * */
    public double getLongitud(){
        return this.longitud;
    }

    /**
     * Getter de la altitud de la localizacion
     * */
    public double getAltitud(){
        return this.altitud;
    }

    // Setters
    //==========================================================================
    /**
     * Modifica el nombre de la localizacion
     * */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Modifica la latitud de la localizacion
     * */
    public void setLatitud(double latitud){
        this.latitud = latitud;
    }

    /**
     * Modifica la longitud de la localizacion
     * */
    public void setLongitud(double longitud){
        this.longitud = longitud;
    }

    /**
     * Modifica la altitud de la localizacion
     * */
    public void setAltidud(double altitud){
        this.altitud = altitud;
    }

    // Otros metodos
    //==========================================================================
    /**
     * Muestra informacion de la localizacion
     * @return un String multilinea con la informacion de la localizacion
     * */
    public String print(){
        String data = "";
        data = data + "Longitud: " + String.valueOf(this.longitud) + "\n";
        data = data + "Latitud: " + String.valueOf(this.latitud) + "\n";
        data = data + "Altitud: " + String.valueOf(this.altitud) + "\n";
        data = data + "\n";
        data = data + "Nombre del punto de localizacion: " + this.nombre + "\n";
        return data;
    }
}
