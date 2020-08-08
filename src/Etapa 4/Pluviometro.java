import java.util.ArrayList;

/**
 * Clase que representa un pluviometro, instrumento de medicion de precipitaciones
 * */
public class Pluviometro extends Sensor{
    // El unico atributo que modifico es el porcentajeMaximo
    private static final double porcentajeMaximo = 0.8;

    Pluviometro(int id, double valorMaximo){
        super(id, valorMaximo);
    }
}
