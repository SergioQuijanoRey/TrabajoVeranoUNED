import java.util.ArrayList;

/**
 * Clase que representa una estacion meteorologica
 *
 * Una estacion meteorologica se compone de los tres instrumentos y tres listas
 * de mediciones que se gestionan totalmente independientes de las listas de mediciones
 * que los instrumentos de la estacion gestionan
 *
 * Por ello es posible usar mal esta clase y añadir valores a instrumentos y no
 * añadirlos correctamente a la estacion meteorologica
 * */
public class EstacionMeteorologica{
    // Atributos
    //==========================================================================
    private int id;                                                     // Identificador de la estacion
    private Localizacion localizacion;                                  // Localizacion de la estacion
    private Termometro termometro;                                      // Termometro de la estacion
    private Pluviometro pluviometro;                                    // Pluviometro de la estacion
    private DetectorN2O detector;                                       // Detector de N2O de la estacion
    private ArrayList<Medicion> valoresTemperatura;                     // Valores de temperatura
    private ArrayList<Medicion> valoresPrecipitaciones;                 // Valores de precipitaciones
    private ArrayList<Medicion> valoresN2O;                             // Valores de concentraciones de gas

    // Constructores
    //==========================================================================
    /**
     * Constructor de la clase
     * */
    public EstacionMeteorologica(int id, Localizacion localizacion){
        // Datos que se aportan en el constructor
        this.id = id;
        this.localizacion = localizacion;

        // Instanciamos el resto de atributos
        // Instrumentos de medicion como null, y conjuntos de valores instanciados vacios
        this.termometro = null;
        this.pluviometro = null;
        this.detector = null;

        this.valoresTemperatura = new ArrayList<Medicion>();
        this.valoresPrecipitaciones = new ArrayList<Medicion>();
        this.valoresN2O = new ArrayList<Medicion>();
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
     * Getter del termometro de la estacion
     * */
    public Termometro getTermometro(){
        return this.termometro;
    }

    /**
     * Getter del pluviometro de la estacion
     * */
    public Pluviometro getPluviometro(){
        return this.pluviometro;
    }

    /**
     * Getter del detector de N2O de la estacion
     * */
    public DetectorN2O getDetectorN2O(){
        return this.detector;
    }

    /**
     * Getter de los valores medidos de temperatura
     * */
    public ArrayList<Medicion> getValoresTemperatura(){
        return this.valoresTemperatura;
    }

    /**
     * Getter de los valores medidos de temperatura
     * */
    public ArrayList<Medicion> getValoresPrecipitaciones(){
        return this.valoresPrecipitaciones;
    }

    /**
     * Getter de los valores medidos de concentracion de N2O
     * */
    public ArrayList<Medicion> getValoresN2O(){
        return this.valoresN2O;
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
     * Modifica el termometro de la estacion
     * */
    public void setTermometro(Termometro termometro){
        this.termometro = termometro;
    }

    /**
     * Modifica el pluviometro de la estacion
     * */
    public void setPluviometro(Pluviometro pluviometro){
        this.pluviometro = pluviometro;
    }

    /**
     * Modifica el detector de gases de la estacion
     * */
    public void setDetectorN2O(DetectorN2O detector){
        this.detector = detector;
    }

    /**
     * Modifica los valores de temperatura de la estacion
     * */
    public void setValoresTemperatura(ArrayList<Medicion> valoresTemperatura){
        this.valoresTemperatura = valoresTemperatura;
    }

    /**
     * Modifica los valores de precipitaciones de la estacion
     * */
    public void setValoresPrecipitaciones(ArrayList<Medicion> valoresPrecipitaciones){
        this.valoresPrecipitaciones = valoresPrecipitaciones;
    }

    /**
     * Modifica los valores de concentracion de N2O de la estacion
     * */
    public void setValoresN2O(ArrayList<Medicion> valoresN2O){
        this.valoresN2O = valoresN2O;
    }

    // Otros metodos
    //==========================================================================
    /**
     * Halla el valor mas alto registrado de temperatura, y devuelve su valor medido
     * Si no hay valores medidos, se devuelve por defecto un cero
     *
     * @return el valor mas alto medido de temperatura
     * */
    public double valorMasAltoT(){
        // Comprobacion de seguridad
        if(this.valoresTemperatura == null || this.valoresTemperatura.size() == 0){
            return 0.0;
        }

        // Iteramos buscando el maximo
        double max = this.valoresTemperatura.get(0).getValorMedido();
        for(int i = 0; i < this.valoresTemperatura.size(); i++){
            if(this.valoresTemperatura.get(i).getValorMedido() > max){
                max = valoresTemperatura.get(i).getValorMedido();
            }
        }

        return max;
    }

    /**
     * Halla el valor mas alto registrado de precipitaciones, y devuelve su valor medido
     * Si no hay valores medidos, se devuelve por defecto un cero
     *
     * @return el valor mas alto medido de precipitaciones
     * */
    public double valorMasAltoP(){
        // Comprobacion de seguridad
        if(this.valoresPrecipitaciones == null || this.valoresPrecipitaciones.size() == 0){
            return 0.0;
        }

        // Iteramos buscando el maximo
        double max = this.valoresPrecipitaciones.get(0).getValorMedido();
        for(int i = 0; i < this.valoresPrecipitaciones.size(); i++){
            if(this.valoresPrecipitaciones.get(i).getValorMedido() > max){
                max = valoresPrecipitaciones.get(i).getValorMedido();
            }
        }

        return max;

    }

    /**
     * Halla el valor mas alto registrado de concentracion de gas, y devuelve su valor medido
     * Si no hay valores medidos, se devuelve por defecto un cero
     *
     * @return el valor mas alto medido de concentracion de gas
     * */
    public double valorMasAltoN2O(){
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
     * Añade una medicion de temperaturas a la estacion
     *
     * Tener en cuenta que hay que añadir la medicion al termometro de la estacion
     * con sus metodos pertinentes y despues añadir la medicion a la estacion con
     * este metodo
     *
     * @param temperatura medicion de temperatura que se añade
     * */
    public void addTemp(Medicion temperatura){
        this.valoresTemperatura.add(temperatura);
    }

    /**
     * Añade una medicion de precipitaciones a la estacion
     *
     * Tener en cuenta que hay que añadir la medicion al pluviometro de la estacion
     * con sus metodos pertinentes y despues añadir la medicion a la estacion con
     * este metodo
     *
     * @param precipitacion medicion de precipitaciones que se añade
     * */
    public void addPrecip(Medicion precipitacion){
        this.valoresPrecipitaciones.add(precipitacion);

    }

    /**
     * Añade una medicion de concentraciones a la estacion
     *
     * Tener en cuenta que hay que añadir la medicion al MedidorN2O de la estacion
     * con sus metodos pertinentes y despues añadir la medicion a la estacion con
     * este metodo
     *
     * @param concentracion medicion de concentraciones que se añade
     * */
    public void addConcentrN2O(Medicion concentracion){
        this.valoresN2O.add(concentracion);
    }
}
