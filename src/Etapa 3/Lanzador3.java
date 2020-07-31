import java.util.Date;

public class Lanzador3 {

    public static void main(String[] args) {

        // Creamos una localización en Madrid

        Localizacion madrid = new Localizacion("Madrid", 40.4165000, -3.7025600, 667);

        // Creamos una estación meteorológica en la localización creada anteriormente

        EstacionMeteorologica estacionMadrid = new EstacionMeteorologica(1, madrid);

        // Creamos tres instrumentos de medición, uno de cada tipo

        Termometro termometro1 = new Termometro(4, 25);

        Pluviometro pluviometro1 = new Pluviometro(5, 65);

        DetectorN2O detectorN2O1 = new DetectorN2O(6, 4.9);

        // Añadimos a la estación los tres instrumentos de medición creados
        // anteriormente

        estacionMadrid.setTermometro(termometro1);

        estacionMadrid.setPluviometro(pluviometro1);

        estacionMadrid.setDetectorN2O(detectorN2O1);

        // Tomamos mediciones en un momento t0

        Date momentoActual = new Date();

        Medicion temp1 = new Medicion(13, 20.24, momentoActual, UnidadMedida.C);

        Medicion prec1 = new Medicion(14, 50, momentoActual, UnidadMedida.LITROS_M2);

        Medicion concent1 = new Medicion(15, 4.79, momentoActual, UnidadMedida.MG_M3);

        // Tomamos mediciones en un momento t1, añadiendo 1 segundo (1000ms) al
        // momentoActual

        long momentoActualEnMilisegundos = momentoActual.getTime();

        Date momentoSig = new Date(momentoActualEnMilisegundos + 1000);

        Medicion temp2 = new Medicion(16, 22.74, momentoSig, UnidadMedida.C);

        Medicion prec2 = new Medicion(17, 60, momentoSig, UnidadMedida.LITROS_M2);

        Medicion concent2 = new Medicion(18, 4.90, momentoSig, UnidadMedida.MG_M3);

        // Creamos mediciones en un momento t2, añadiendo 2 segundos (2000ms) al
        // momentoActual

        Date momentoFinal = new Date(momentoActualEnMilisegundos + 2000);

        Medicion temp3 = new Medicion(19, 21.14, momentoFinal, UnidadMedida.C);

        Medicion prec3 = new Medicion(20, 70, momentoFinal, UnidadMedida.LITROS_M2);

        Medicion concent3 = new Medicion(21, 4.99, momentoFinal, UnidadMedida.MG_M3);

        // Añadimos a la estación el conjunto de mediciones que han sido tomadas,
        // actualizando las últimas mediciones en cada instrumento

        estacionMadrid.getTermometro().addMedicion(temp1);

        estacionMadrid.getTermometro().setValorUltimo(temp1.getValorMedido());

        estacionMadrid.addTemp(temp1);

        estacionMadrid.getTermometro().addMedicion(temp2);

        estacionMadrid.getTermometro().setValorUltimo(temp2.getValorMedido());

        estacionMadrid.addTemp(temp2);

        estacionMadrid.getTermometro().addMedicion(temp3);

        estacionMadrid.getTermometro().setValorUltimo(temp3.getValorMedido());

        estacionMadrid.addTemp(temp3);

        estacionMadrid.getPluviometro().addMedicion(prec1);

        estacionMadrid.getPluviometro().setValorUltimo(prec1.getValorMedido());

        estacionMadrid.addPrecip(prec1);

        estacionMadrid.getPluviometro().addMedicion(prec2);

        estacionMadrid.getPluviometro().setValorUltimo(prec2.getValorMedido());

        estacionMadrid.addPrecip(prec2);

        estacionMadrid.getPluviometro().addMedicion(prec3);

        estacionMadrid.getPluviometro().setValorUltimo(prec3.getValorMedido());

        estacionMadrid.addPrecip(prec3);

        estacionMadrid.getDetectorN2O().addMedicion(concent1);

        estacionMadrid.getDetectorN2O().setValorUltimo(concent1.getValorMedido());

        estacionMadrid.addConcentrN2O(concent1);

        estacionMadrid.getDetectorN2O().addMedicion(concent2);

        estacionMadrid.getDetectorN2O().setValorUltimo(concent2.getValorMedido());

        estacionMadrid.addConcentrN2O(concent2);

        estacionMadrid.getDetectorN2O().addMedicion(concent3);

        estacionMadrid.getDetectorN2O().setValorUltimo(concent3.getValorMedido());

        estacionMadrid.addConcentrN2O(concent3);

        // Presentamos por pantalla los valores más altos registrados para T, P y N2O

        System.out.println("Valor máx de T en la estación: " + estacionMadrid.valorMasAltoT());

        System.out.println("Valor máx de Precipitaciones: " + estacionMadrid.valorMasAltoP());

        System.out.println("Valor máx de N2O: " + estacionMadrid.valorMasAltoN2O());

    }
}
