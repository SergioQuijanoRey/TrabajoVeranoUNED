import java.util.ArrayList;

/**
 * Clase que representa un pluviometro, instrumento de medicion de precipitaciones
 * */
public class DetectorN2O extends Sensor{
    // El unico atributo que modifico es el porcentajeMaximo
    private static final double porcentajeMaximo = 1.0;

    DetectorN2O(int id, double valorMaximo){
        super(id, valorMaximo);
    }
}
