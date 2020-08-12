/**
 * Clase que representa un detector de CO2, instrumento de medicion de concentraciones de N2O
 * */
public class DetectorCO2 extends Sensor{
    // El unico atributo que modifico es el porcentajeMaximo
    private static final double porcentajeMaximo = 0.75;

    DetectorCO2(int id, double valorMaximo){
        super(id, valorMaximo);
    }
}
