import java.util.ArrayList;

/**
 * Clase que representa un gestor ambiental
 * Un gestor ambiental se compone de un conjunto de estaciones meteorologicas
 * */
public class GestorMedioambiental{
    // Atributos
    //==========================================================================
    private ArrayList<EstacionMeteorologica> estaciones;

    // Constructor
    //==========================================================================
    /**
     * Constructor de la clase
     * */
    GestorMedioambiental(){
        this.estaciones = new ArrayList<EstacionMeteorologica>();
    }

    // Getters
    //==========================================================================
    /***
     * Devuelve todos los valores medidos de una determinada unidad de medida
     * de todas las estaciones meteorologicas
     * @param unidadMedida la unidad de medida con la que se trabaja
     * @return la lista de mediciones correspondiente a la unidad de medida
     * */
    public ArrayList<Medicion> getValoresUnidad(UnidadMedida unidadMedida){
        ArrayList<Medicion> mediciones = new ArrayList<Medicion>();

        for(EstacionMeteorologica estacion : this.estaciones){
            for(Medicion medicion : estacion.getValoresUnidad(unidadMedida)){
                mediciones.add(medicion);
            }
        }

        return mediciones;
    }

    // Setters
    //==========================================================================
    // Otros metodos
    //==========================================================================
    /**
     * Añade una estacion metereologica a la lista de estaciones del GestorMediambiental
     * */
    public void addEstacion(EstacionMeteorologica estacion){
        this.estaciones.add(estacion);
    }

    /**
     * Calcula el valor medio de las mediciones de una unidad concreta
     * El valor medio se hace contando con todas las mediciones de todas las estaciones disponibles
     *
     * @param unidadMedida la unidad de medida con la que se trabaja
     * @return el valor medio como se ha descrito
     * */
    public double valorMedio(UnidadMedida unidadMedida){
        // Tomo todas las mediciones de la unidad de medida
        ArrayList<Medicion> mediciones = this.getValoresUnidad(unidadMedida);

        // Comprobacion de seguridad
        if(mediciones.size() == 0 || mediciones == null){
            System.err.println("ERROR! No se han encontrado medidas registradas del tipo" + unidadMedida.getUnit());
            System.err.println("Se devuelve el valor 0.0 por defecto");
            return 0.0;
        }

        // Calculo la suma total
        double sum = 0.0;
        for(Medicion medicion : mediciones){
            sum = sum + medicion.getValorMedido();
        }

        // Calculo la media
        double media = sum / Double.valueOf(mediciones.size());
        return media;
    }

    /**
     * Calcula el valor mas alto de las mediciones de una unidad concreta
     * El valor mas alto se hace contando con todas las mediciones de todas las estaciones disponibles
     *
     * @param unidadMedida la unidad de medida con la que se trabaja
     * @return el valor mas alto, como se ha descrito
     * */
    public double valorMasAlto(UnidadMedida unidadMedida){
        // Tomo todas las mediciones de la unidad de medida
        ArrayList<Medicion> mediciones = this.getValoresUnidad(unidadMedida);

        // Comprobacion de seguridad
        if(mediciones.size() == 0 || mediciones == null){
            System.err.println("ERROR! No se han encontrado medidas registradas del tipo" + unidadMedida.getUnit());
            System.err.println("Se devuelve el valor 0.0 por defecto");
            return 0.0;
        }

        // Calculo el valor maximo
        double max = mediciones.get(0).getValorMedido();
        for(Medicion medicion : mediciones){
            if(medicion.getValorMedido() > max){
                max = medicion.getValorMedido();
            }
        }

        return max;

    }
}
