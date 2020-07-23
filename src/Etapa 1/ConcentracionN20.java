import java.util.Date;

public class ConcentracionN2O{
    // Atributos
    //==========================================================================
    private int identificador;
    private static final String unidadMedida = "mg_m3";
    private Date momentoMedicion;
    private double valorMedio;

    // Constructores
    //==========================================================================
    ConcentracionN2O(int identificador, double valorMedio, Date momentoMedicion){
        this.identificador = identificador;
        this.valorMedio = valorMedio;
        this.momentoMedicion = momentoMedicion;
    }

    // Getters
    //==========================================================================
    public int getIdentificador(){
        return this.identificador;
    }

    public static String getUnidadMedida(){
        return unidadMedida;
    }

    public Date getMomentoMedicion(){
        return this.momentoMedicion;
    }

    public double getValorMedio(){
        return this.valorMedio;
    }

    // Setters
    //==========================================================================
    public void setIdentificador(int identificador){
        this.identificador = identificador;
    }

    public void setMomentoMedicion(Date momentoMedicion){
        this.momentoMedicion = momentoMedicion;
    }

    public void setValorMedio(double valorMedio){
        this.valorMedio = valorMedio;
    }

    // Otros metodos
    //==========================================================================
    public String print(){
        String data = "";
        data = data + "Valor medido de N20: " + String.valueOf(this.valorMedio) + "\n";
        data = data + "Unidad de medida: " + ConcentracionN2O.getUnidadMedida() + "\n";
        data = data + "\n";
        data = data + "Instante de la medicion: " + this.momentoMedicion.toString() + "\n";
        return data;
    }
}

