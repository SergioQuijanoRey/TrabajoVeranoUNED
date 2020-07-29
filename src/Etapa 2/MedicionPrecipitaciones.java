import java.util.Date;

/**
 * Clase que representa un instrumento de medida de precipitaciones
 * */
public class MedicionPrecipitaciones{
    // Atributos
    //==========================================================================
    private int identificador;
    private static final String unidadMedida = "Litros_m2";
    private Date momentoMedicion;
    private double valorMedio;

    // Constructores
    //==========================================================================
    /**
     * Constructor de la clase
     * */
    MedicionPrecipitaciones(int identificador, double valorMedio, Date momentoMedicion){
        this.identificador = identificador;
        this.valorMedio = valorMedio;
        this.momentoMedicion = momentoMedicion;
    }

    // Getters
    //==========================================================================
    /**
     * Getter del identificador del medidor
     * */
    public int getIdentificador(){
        return this.identificador;
    }

    /**
     * Getter de la unidad de medida del instrumento de medida
     * Es un getter de un atributo de clase, asi que se invoca tal que:
     *
     * MedicionPrecipitaciones.getUnidadMedida()
     * */
    public static String getUnidadMedida(){
        return MedicionPrecipitaciones.unidadMedida;
    }

    /**
     * Getter del momento en el que se tomo la medida
     * */
    public Date getMomentoMedicion(){
        return this.momentoMedicion;
    }

    /**
     * Getter del valor medio
     * */
    public double getValorMedio(){
        return this.valorMedio;
    }

    // Setters
    //==========================================================================
    /**
     * Modifica el identificador del medidor
     * */
    public void setIdentificador(int identificador){
        this.identificador = identificador;
    }

    /**
     * Modifica el momento en el que se tomo la medida
     * */
    public void setMomentoMedicion(Date momentoMedicion){
        this.momentoMedicion = momentoMedicion;
    }

    /**
     * Modifica el valor medio
     * */
    public void setValorMedio(double valorMedio){
        this.valorMedio = valorMedio;
    }

    // Otros metodos
    //==========================================================================
    /**
     * Muestra informacion del instrumento de medida
     * @return un String multilinea con la informacion del instrumento
     * */
    public String print(){
        String data = "";
        data = data + "Valor medido de P: " + String.valueOf(this.valorMedio) + "\n";
        data = data + "Unidad de medida: " + MedicionPrecipitaciones.getUnidadMedida() + "\n";
        data = data + "\n";
        data = data + "Instante de la medicion: " + this.momentoMedicion.toString() + "\n";
        return data;
    }
}
