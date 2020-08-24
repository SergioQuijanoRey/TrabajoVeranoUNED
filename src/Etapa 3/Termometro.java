import java.util.ArrayList;

/**
 * Clase que representa un termometro, instrumento de medicion de temperatura
 * */
public class Termometro extends Sensor{
    // El unico atributo que modifico es el porcentaje maximo del valor maximo
    private static final double porcentajeMaximo = 0.9;

    public Termometro(int id, double valorMaximo){
        super(id, valorMaximo);
    }
}
