import java.util.ArrayList;

/**
 * Clase que representa un pluviometro, instrumento de medicion de precipitaciones
 * */
public class Pluviometro{
    // Atributos
    //==========================================================================
    private int id;                                     // Identificador del instrumento
    private double valorMaximo;                         // Valor maximo de precipitaciones
    private ArrayList<MedicionPrecipitaciones> valores; // Valores medidos por el instrumento
    private static final double porcentajeMaximo = 0.8; // Porcentaje del valor maximo que al superarse lanza un aviso
    private double valorUltimo;                         // Ultimo valor registrado

    // Constructores
    //==========================================================================
    /**
     * Constructor de la clase
     * */
    public Pluviometro(int id, double valorMaximo){
        this.id = id;
        this.valorMaximo = valorMaximo;

        // Instancio la lista de mediciones del instrumento
        this.valores = new ArrayList<MedicionPrecipitaciones>();
    }

    // Getters
    //==========================================================================
    /**
     * Getter del id del instrumento
     * */
    public int getId(){
        return this.id;
    }

    /**
     * Getter del valor maximo del instrumento
     * */
    public double getValorMaximo(){
        return this.valorMaximo;
    }

    /**
     * Getter de los valores medidos del instrumento
     * */
    public ArrayList<MedicionPrecipitaciones> getValores(){
        return this.valores;
    }

    /**
     * Getter del ultimo valor registrado del instrumento
     * */
    public double getValorUltimo(){
        return this.valorUltimo;
    }

    /**
     * Getter del atributo de clase porcentajeMaximo
     * */
    public static double getPorcentajeMaximo(){
        return Pluviometro.porcentajeMaximo;
    }

    // Setters
    //==========================================================================
    /**
     * Se actualiza manualmente el ultimo valor medido
     *
     * En caso de que el valorUltimo este por encima del porcentaje permitido para el
     * valor maximo, se lanza un aviso
     *
     * @param valorUltimo el ultimo valor que insertamos manualmente
     * */
    public void setValorUltimo(double valorUltimo){
        this.valorUltimo = valorUltimo;

        if(this.valorUltimo > this.valorMaximo * Pluviometro.porcentajeMaximo){
            this.aviso(valorUltimo);
        }
    }

    /**
     * Se modifica el id del instrumento
     * */
    public void setId(int id){
        this.id = id;
    }

    /**
     * Se modifica el valor maximo del instrumento
     * */
    public void setValorMaximo(double valorMaximo){
        this.valorMaximo = valorMaximo;
    }

    /**
     * Se establecen manualmente el conjunto de valores medidos
     *
     * Tener en cuenta que hay que actualizar a mano el atributo valorUltimo para
     * que esta operacion tenga sentido y no deje el objeto en un estado incoherente
     *
     * Tener en cuenta que si se añaden valores a mano por encima del valor maximo
     * no se lanzaran avisos
     *
     * No es recomendable usar este metodo. Lo recomendable es ir añadiendo los valores
     * uno a uno con el metodo addMedicion()
     *
     * @param valores los valores nuevos que se quieren dejar registrados
     * */
    public void setValores(ArrayList<MedicionPrecipitaciones> valores){
        this.valores = valores;
    }

    // Otros metodos
    //==========================================================================
    /**
     * Se añade una medicion de precipitaciones al instrumento y se actualiza el ultimo valor medido
     *
     * Tener en cuenta que no se actualiza el valor del atributo valorUltimo
     * Esto debe hacerse a mano invocando al metodo setValorUltimo()
     * Por lo tanto, un mal uso de la clase puede dejarla en estado inconsistente
     * Ademas, la comprobacion de los valores maximos se hace en el metodo setValorUltimo()
     *
     * @param medicion la medicion que se añade
     * */
    public void addMedicion(MedicionPrecipitaciones medicion){
        // Añado el valor
        this.valores.add(medicion);
    }

    /**
     * Funcion que lanza el aviso pertinente si se añade una medicion con un valor
     * por encima del porcentaje maximo permitido
     *
     * @param valor el valor que ha hecho lanzar el aviso
     * */
    public void aviso(double valor){
        System.out.println("ALERTA! Se ha registrado un valor extremo");
        System.out.println("Informacion de la alerta:");
        System.out.println("\tIdentificacion: " + this.id);
        System.out.println("\tValor que lanza el aviso: " + valor);
        System.out.println("");
    }
}
