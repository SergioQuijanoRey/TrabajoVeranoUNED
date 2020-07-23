
public class Localizacion{
    // Atributos
    //==========================================================================
    private String Nombre;
    private double Latitud;
    private double Longitud;
    private double Altitud;

    // Constructores
    //==========================================================================
    Localizacion(String Nombre, double Latitud, double Longitud, double Altitud){
        this.Nombre = Nombre;
        this.Latitud = Latitud;
        this.Longitud = Longitud;
        this.Altitud = Altitud;
    }

    // Getters
    //==========================================================================
    public String getNombre(){
        return this.Nombre;
    }

    public double getLatitud(){
        return this.Latitud;
    }

    public double getLongitud(){
        return this.Longitud;
    }

    public double getAltitud(){
        return this.Altitud;
    }

    // Setters
    //==========================================================================
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public void setLatitud(double Latitud){
        this.Latitud = Latitud;
    }

    public void setLongitud(double Longitud){
        this.Longitud = Longitud;
    }

    public void setAltitud(double Altitud){
        this.Altitud = Altitud;
    }

    // Otros metodos
    //==========================================================================
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
