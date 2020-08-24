import java.util.Date;

/**
 * Clase que representa una medicion
 * */
public class Medicion{

    // Atributos
    //==========================================================================
    private int identificador;
    private Date momentoMedicion;
    private double valorMedido;
    private UnidadMedida unidadMedida;

    // Constructores
    //==========================================================================
    /**
     * Constructor de la clase
     * */
    public Medicion(int identificador, double valorMedido, Date momentoMedicion, UnidadMedida unidadMedida){
        this.identificador = identificador;
        this.valorMedido = valorMedido;
        this.momentoMedicion = momentoMedicion;
        this.unidadMedida = unidadMedida;
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
     *
     * Tener en cuenta que unidadMedida es un atributo de clase
     * */
    public UnidadMedida getUnidadMedida(){
        return this.unidadMedida;
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
    public void setValorMedido(double valorMedido){
        this.valorMedido = valorMedido;
    }

    /**
     * Modifica la unidad de medida del instrumento
     * */
    public void setUnidadMedida(UnidadMedida unidadMedida){
        this.unidadMedida = unidadMedida;
    }

    // Otros metodos
    //==========================================================================
    /**
     * Muestra informacion del instrumento de medida
     * @return un String multilinea con la informacion del instrumento
     * */
    public String print(){
        String data = "";
        data = data + "Valor medido de " + this.unidadMedida.getName() + ": " + String.valueOf(this.valorMedido) + "\n";
        data = data + "Unidad de medida: " + this.unidadMedida.getUnit() + "\n";
        data = data + "\n";
        data = data + "Instante de la medicion: " + this.momentoMedicion.toString() + "\n";
        return data;
    }
}
