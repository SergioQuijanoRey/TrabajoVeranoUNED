
/**
 * Clase que representa una localizacion geografica
 * */
public class Localizacion{
    // Atributos
    //==========================================================================
    private String Nombre;
    private double Latitud;
    private double Longitud;
    private double Altitud;

    // Constructores
    //==========================================================================
    /**
     * Constructor de la clase
     * */
    Localizacion(String Nombre, double Latitud, double Longitud, double Altitud){
        this.Nombre = Nombre;
        this.Latitud = Latitud;
        this.Longitud = Longitud;
        this.Altitud = Altitud;
    }

    // Getters
    //==========================================================================
    /**
     * Getter del nombre de la localizacion
     * */
    public String getNombre(){
        return this.Nombre;
    }

    /**
     * Getter de la latitud de la localizacion
     * */
    public double getLatitud(){
        return this.Latitud;
    }

    /**
     * Getter de la longitud de la localizacion
     * */
    public double getLongitud(){
        return this.Longitud;
    }

    /**
     * Getter de la altitud de la localizacion
     * */
    public double getAltitud(){
        return this.Altitud;
    }

    // Setters
    //==========================================================================
    /**
     * Modifica el nombre de la localizacion
     * */
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    /**
     * Modifica la latitud de la localizacion
     * */
    public void setLatitud(double Latitud){
        this.Latitud = Latitud;
    }

    /**
     * Modifica la longitud de la localizacion
     * */
    public void setLongitud(double Longitud){
        this.Longitud = Longitud;
    }

    /**
     * Modifica la altitud de la localizacion
     * */
    public void setAltitud(double Altitud){
        this.Altitud = Altitud;
    }

    // Otros metodos
    //==========================================================================
    /**
     * Muestra informacion de la localizacion
     * @return un String multilinea con la informacion de la localizacion
     * */
    public String print(){
        String data = "";
        data = data + "Longitud: " + String.valueOf(this.Longitud) + "\n";
        data = data + "Latitud: " + String.valueOf(this.Latitud) + "\n";
        data = data + "Altitud: " + String.valueOf(this.Altitud) + "\n";
        data = data + "\n";
        data = data + "Nombre del punto de localizacion: " + this.Nombre + "\n";
        return data;
    }
}
