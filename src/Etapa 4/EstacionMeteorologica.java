import java.util.ArrayList;

/**
 * Clase que representa una estacion meteorologica
 *
 * Una estacion meteorologica se compone de sensores y una lista de mediciones que
 * se gestionan totalmente independientes de las listas de mediciones que los
 * instrumentos de la estacion gestionan
 *
 * Por ello es posible usar mal esta clase y añadir valores a instrumentos y no
 * añadirlos correctamente a la estacion meteorologica
 * */
public class EstacionMeteorologica{
    // Atributos
    //==========================================================================
    private int id;                                                     // Identificador de la estacion
    private Localizacion localizacion;                                  // Localizacion de la estacion
    private ArrayList<Sensor> sensores;                                 // Sensores disponibles
    private ArrayList<Medicion> valores;                                // Valores de las mediciones realizadas

    // Constructores
    //==========================================================================
    /**
     * Constructor de la clase
     * */
    EstacionMeteorologica(int id, Localizacion localizacion){
        // Datos que se aportan en el constructor
        this.id = id;
        this.localizacion = localizacion;

        // Inicializamos el resto de atributos
        this.sensores = new ArrayList<Sensor>();
        this.valores = new ArrayList<Medicion>();
    }

    // Getters
    //==========================================================================
    /**
     * Getter del id de la estacion
     * */
    public int getId(){
        return this.id;
    }

    /**
     * Getter de la localizacion de la estacion
     * */
    public Localizacion getLocalizacion(){
        return this.localizacion;
    }

    /**
     * Getter de los sensores de la estacion
     * */
    public ArrayList<Sensores> getSensores(){
        return this.sensores;
    }

    /**
     * Getter de las mediciones registradas en la estacion
     * */
    public ArrayList<Medicion> getValores(){
        return this.valores;
    }

    // Setters
    //==========================================================================
    /**
     * Modifica del id de la estacion
     * */
    public void setId(int id){
        this.id = id;
    }

    /**
     * Modifica la localizacion de la estacion
     * */
    public void setLocalizacion(Localizacion localizacion){
        this.localizacion = localizacion;
    }

    /**
     * Modifica manualmente el array de sensores de la estacion
     * */
    public void setSensores(ArrayList<Sensor> sensores){
        this.sensores = sensores;
    }

    /**
     * Modifica manualemnte el array de mediciones de la estacion
     * Se desaconseja el uso de este metodo
     * Es mejor idea usar el metodo addMedicion para modificar la lista de mediciones
     * */
    public void setValores(ArrayList<Medicion> valores){
        this.valores = valores;
    }


    // Otros metodos
    //==========================================================================

    /**
     * Halla el valor mas alto registrado de una unidad dada, y devuelve su valor
     * medido
     * Si no hay valores medidos, se devuelve por defecto un cero
     *
     * @param unidadMedida la unidad de medida que se quiere comprobar
     * @return el valor mas alto medido de dicha medida
     *
     * TODO -- Falta por implementar
     * */
    public double valorMasAlto(UnidadMedida unidadMedida){
        // Comprobacion de seguridad
        if(this.valoresN2O == null || this.valoresN2O.size() == 0){
            return 0.0;
        }

        // Iteramos buscando el maximo
        double max = this.valoresN2O.get(0).getValorMedido();
        for(int i = 0; i < this.valoresN2O.size(); i++){
            if(this.valoresN2O.get(i).getValorMedido() > max){
                max = valoresN2O.get(i).getValorMedido();
            }
        }

        return max;
    }

    /**
     * Añade una medicion a la estacion
     *
     * Tener en cuenta que hay que añadir la medicion al sensor de la estacion
     * con sus metodos pertinentes y despues añadir la medicion a la estacion con
     * este metodo
     *
     * @param medicion la medicion que se añade a la estacion
     * */
    public void addMedicion(Medicion medicion){
        this.valores.add(medicion);
    }

    /**
     * Se añade un sensor a la estacion metereologica
     *
     * @param sensor el sensor que se añade a la estacion
     * */
    public void addSensor(Sensor sensor){
        this.sensores.add(sensor);
    }
}
