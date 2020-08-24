import java.util.Date;

/**
 * Clase que representa un instrumento de medida de temperatura
 * */
public class MedicionTemperatura{
    // Atributos
    //==========================================================================
    private int identificador;
    private static final String unidadMedida = "ºC";
    private Date momentoMedicion;
    private double valorMedido;

    // Constructores
    //==========================================================================
    /**
     * Constructor de la clase
     * */
    public MedicionTemperatura(int identificador, double valorMedido, Date momentoMedicion){
        this.identificador = identificador;
        this.valorMedido = valorMedido;
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
     * MedicionTemperatura.getUnidadMedida()
     * */
    public static String getUnidadMedida(){
        return MedicionTemperatura.unidadMedida;
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
    public double getValorMedido(){
        return this.valorMedido;
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
    public void setValorMedio(double valorMedido){
        this.valorMedido = valorMedido;
    }

    // Otros metodos
    //==========================================================================
    /**
     * Muestra informacion del instrumento de medida
     * @return un String multilinea con la informacion del instrumento
     * */
    public String print(){
        String data = "";
        data = data + "Valor medido de T: " + String.valueOf(this.valorMedido) + "\n";
        data = data + "Unidad de medida: " + MedicionTemperatura.getUnidadMedida() + "\n";
        data = data + "\n";
        data = data + "Instante de la medicion: " + this.momentoMedicion.toString() + "\n";
        return data;
    }
}
