import java.util.ArrayList;

/**
 * Clase que representa un detector de N2O, instrumento de medicion de concentraciones
 * */
public class DetectorN2O extends Sensor{
    // El unico atributo que modifico es el porcentajeMaximo
    private static final double porcentajeMaximo = 1.0;

    public DetectorN2O(int id, double valorMaximo){
        super(id, valorMaximo);
    }
}
