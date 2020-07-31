/**
 * Enumerado que representa las unidades de medida disponibles en el sistema
 *
 * Una unidad de medida viene representado por dos string:
 *  - name: el nombre de la variable que mide (ie Temperatura)
 *  - unit: la unidad en la que se mide (ie grados centigrados)
 * */
public enum UnidadMedida {

    // Valores que toma el enumerado
    Temperatura("T", "Cº"),
    Precipitaciones("P", "l_m2"),
    ConcentracionN2O("N2O", "mg_m3"),
    Undefined("Sin definir", "Sin definir");   // Unidad para cuando no se especifica unidades

    // Logica basica del enumerado
    private final String unit;
    private final String name;

    UnidadMedida(String name, String unit) {
        this.name = name;
        this.unit = unit;
    }

    public String getUnit() {
        return this.unit;
    }

    public String getName(){
        return this.name;
    }
}
