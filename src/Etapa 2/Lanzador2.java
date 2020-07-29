import java.util.Date;

public class Lanzador2 {

	public static void main(String[] args){

        // Creamos una localización en Madrid
        Localizacion madrid = new Localizacion("Madrid",40.4165000,-3.7025600, 667);

        // Creamos una estación meteorológica en la localización creada anteriormente
        EstacionMeteorologica estacionMadrid = new EstacionMeteorologica(1,madrid);

        // Creamos tres instrumentos de medición, uno de cada tipo
        Termometro termometro1 = new Termometro(1,40);
        Pluviometro pluvimetro1 = new Pluviometro(2,70);
        DetectorN2O detectorN2O1 = new DetectorN2O (3,5);

        // Añadimos a la estación los tres instrumentos de medición creados anteriormente
        estacionMadrid.setTermometro(termometro1);
        estacionMadrid.setPluviometro(pluvimetro1);
        estacionMadrid.setDetectorN2O(detectorN2O1);

        // Tomamos mediciones en un momento t0
        Date momentoActual = new Date();
        MedicionTemperatura temp1 = new MedicionTemperatura(4,19.14,momentoActual);
        MedicionPrecipitaciones prec1 = new MedicionPrecipitaciones (5,56,momentoActual);
        ConcentracionN2O concent1 = new ConcentracionN2O (6,4.79,momentoActual);

        // Tomamos mediciones en un momento t1, añadiendo 1 segundo (1000ms) al momentoActual
        long momentoActualEnMilisegundos = momentoActual.getTime();
        Date momentoSig = new Date(momentoActualEnMilisegundos+1000);

        MedicionTemperatura temp2 = new MedicionTemperatura(7,19.44,momentoSig);
        MedicionPrecipitaciones prec2 = new MedicionPrecipitaciones (8,60,momentoSig);
        ConcentracionN2O concent2 = new ConcentracionN2O (9,4.90,momentoSig);

        // Creamos mediciones en un momento t2, añadiendo 2 segundos (2000ms) al momentoActual
        Date momentoFinal = new Date(momentoActualEnMilisegundos+2000);
        MedicionTemperatura temp3 = new MedicionTemperatura(10,38.54,momentoFinal);
        MedicionPrecipitaciones prec3 = new MedicionPrecipitaciones (11,72,momentoFinal);
        ConcentracionN2O concent3 = new ConcentracionN2O (12,5.82,momentoFinal);


        // Añadimos a la estación el conjunto de mediciones que han sido tomadas, actualizando las últimas mediciones en cada instrumento
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
