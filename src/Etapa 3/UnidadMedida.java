/**
 * Enumerado que representa las unidades de medida disponibles en el sistema
 * */
public enum UnidadMedida {

    // Valores que toma el enumerado
    Temperatura("Cº"),
    Precipitaciones("l_m2"),
    ConcentracionN2O("mg_m3");

    // Logica basica del enumerado
    private final String type;

    UnidadMedida(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
