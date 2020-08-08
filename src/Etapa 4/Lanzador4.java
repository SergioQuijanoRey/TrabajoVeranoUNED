import java.util.Date;

public class Lanzador4 {

    public static void main(String[] args) {

        // Tomamos mediciones en un momento t0
        Date momentoActual = new Date();
        Medicion temp1 = new Medicion(22, 20.14, momentoActual, UnidadMedida.C);
        Medicion prec1 = new Medicion(23, 1.61, momentoActual, UnidadMedida.LITROS_M2);
        Medicion concent1 = new Medicion(24, 4.34, momentoActual, UnidadMedida.MG_M3);

        // Tomamos mediciones en un momento t1, añadiendo 1 segundo (1000ms) al
        // momentoActual
        long momentoActualEnMilisegundos = momentoActual.getTime();
        Date momentoSig = new Date(momentoActualEnMilisegundos + 1000);
        Medicion temp2 = new Medicion(25, 22.74, momentoSig, UnidadMedida.C);
        Medicion prec2 = new Medicion(26, 1.43, momentoSig, UnidadMedida.LITROS_M2);
        Medicion concent2 = new Medicion(27, 4.50, momentoSig, UnidadMedida.MG_M3);

        // Creamos mediciones en un momento t2, añadiendo 2 segundos (2000ms) al
        // momentoActual
        Date momentoFinal = new Date(momentoActualEnMilisegundos + 2000);
        Medicion temp3 = new Medicion(28, 21.41, momentoFinal, UnidadMedida.C);
        Medicion prec3 = new Medicion(29, 1.13, momentoFinal, UnidadMedida.LITROS_M2);
        Medicion concent3 = new Medicion(30, 4.99, momentoFinal, UnidadMedida.MG_M3);

        // Creamos tres instrumentos de medición, uno de cada tipo
        Sensor termometro1 = new Termometro(4, 25);
        Sensor pluviometro1 = new Pluviometro(5, 65);
        Sensor detectorN2O1 = new DetectorN2O(6, 4.9);

        // Simulamos las mediciones en los sensores, añadiéndolas a los instrumentos
        termometro1.addMedicion(temp1);
        termometro1.addMedicion(temp2);
        termometro1.addMedicion(temp3);
        pluviometro1.addMedicion(prec1);
        pluviometro1.addMedicion(prec2);
        pluviometro1.addMedicion(prec3);
        detectorN2O1.addMedicion(concent1);
        detectorN2O1.addMedicion(concent2);
        detectorN2O1.addMedicion(concent3);

        // Creamos una localización en Madrid
        Localizacion madrid = new Localizacion("Madrid", 40.4165000, -3.7025600, 667);

        // Creamos una estación meteorológica en la localización creada anteriormente
        EstacionMeteorologica estacionMadrid = new EstacionMeteorologica(1, madrid);

        // Añadimos a la estación los tres instrumentos de medición creados
        // anteriormente
        estacionMadrid.addSensor(termometro1);
        estacionMadrid.addSensor(pluviometro1);
        estacionMadrid.addSensor(detectorN2O1);

        // Añadimos a la estación el conjunto de mediciones que han sido tomadas
        estacionMadrid.addMedicion(temp1);
        estacionMadrid.addMedicion(temp2);
        estacionMadrid.addMedicion(temp3);
        estacionMadrid.addMedicion(prec1);
        estacionMadrid.addMedicion(prec2);
        estacionMadrid.addMedicion(prec3);
        estacionMadrid.addMedicion(concent1);
        estacionMadrid.addMedicion(concent2);
        estacionMadrid.addMedicion(concent3);

        // Creamos un nuevo termómetro y lo añadimos a la estación
        Termometro termometro2 = new Termometro(4, 24);
        estacionMadrid.addSensor(termometro2);

        // Tomamos mediciones en dos nuevos momentos
        Date momentoUltimo = new Date(momentoActualEnMilisegundos + 5000);
        Medicion temp4 = new Medicion(31, 20.51, momentoUltimo, UnidadMedida.C);
        Date momentoPostUltimo = new Date(momentoActualEnMilisegundos + 5500);
        Medicion temp5 = new Medicion(32, 20.57, momentoPostUltimo, UnidadMedida.C);

        // Simulamos las mediciones en el termometro, añadiéndolas
        termometro2.addMedicion(temp4);
        termometro2.addMedicion(temp5);

        // Añadimos a la estación las nuevas mediciones realizadas con el nuevo
        // termómetro
        estacionMadrid.addMedicion(temp4);
        estacionMadrid.addMedicion(temp5);

        // Presentamos por pantalla los valores más altos y los valores medios
        // registrados para todos los sensores de las 3 unidades de medida
        System.out.println("Valor máx de T en la estación de " + estacionMadrid.getLocalizacion().getNombre() + ": "
                + estacionMadrid.valorMasAlto(UnidadMedida.C));
        System.out.println("Valor medio de T en la estación de " + estacionMadrid.getLocalizacion().getNombre() + ": "
                + estacionMadrid.valorMedio(UnidadMedida.C));
        System.out.println(
                "Valor máx de Precipitaciones en la estación de " + estacionMadrid.getLocalizacion().getNombre() + ": "
                        + estacionMadrid.valorMasAlto(UnidadMedida.LITROS_M2));
        System.out.println(
                "Valor medio de Precipitaciones en la estación de " + estacionMadrid.getLocalizacion().getNombre()
                        + ": " + estacionMadrid.valorMedio(UnidadMedida.LITROS_M2));

        System.out.println("Valor máx de N2O en la estación de " + estacionMadrid.getLocalizacion().getNombre() + ": "
                + estacionMadrid.valorMasAlto(UnidadMedida.MG_M3));

        System.out.println("Valor medio de N2O en la estación de " + estacionMadrid.getLocalizacion().getNombre() + ": "
                + estacionMadrid.valorMedio(UnidadMedida.MG_M3));

        // Creamos una nueva localización correspondiente a la ciudad de Barcelona
        Localizacion barcelona = new Localizacion("Barcelona", 41.3818, 2.1685, 13);

        // Creamos una estación meteorológica en la localización correspondiente a
        // Barcelona
        EstacionMeteorologica estacionBarcelona = new EstacionMeteorologica(2, barcelona);

        // Creamos un instrumento de medición de tipo termómetro
        Termometro termometro3 = new Termometro(7, 21.1);

        // Añadimos a la estación de Barcelona el termómetro creado anteriormente
        estacionBarcelona.addSensor(termometro3);

        // Tomamos una medición en este nuevo momento actual 21 segundos después del
        // momento actual
        Date nuevoMomentoActual = new Date(momentoActualEnMilisegundos + 21000);
        Medicion temp6 = new Medicion(33, 20.71, nuevoMomentoActual, UnidadMedida.C);

        // Simulamos las mediciones en el termometro, añadiéndolas
        termometro3.addMedicion(temp6);

        // Añadimos a la estación la medición que ha sido tomada

        estacionBarcelona.addMedicion(temp6);

        // Presentamos por pantalla el valor más alto registrado para T en Barcelona

        System.out.println("Valor máx de T en la estación de " + estacionBarcelona.getLocalizacion().getNombre() + ": "
                + estacionBarcelona.valorMasAlto(UnidadMedida.C));

        // Presentamos por pantalla el valor medio de T registrado por todos los
        // sensores en Barcelona

        System.out.println("Valor medio de T en la estación de " + estacionBarcelona.getLocalizacion().getNombre()
                + ": " + estacionBarcelona.valorMedio(UnidadMedida.C));

        // Creamos un objeto de la clase GestorMediambiental

        GestorMedioambiental gestor = new GestorMedioambiental();

        // Añadimos las dos estaciones meteorológicas (Madrid y Barcelona) al gestor

        gestor.addEstacion(estacionMadrid);

        gestor.addEstacion(estacionBarcelona);

        // Presentamos por pantalla el valor medio y el valor más alto registrado por
        // todas las estaciones que gestiona el gestor medioambiental para las distintas
        // medidas

        System.out.println("Valor medio de T registrado en las estaciones gestionadas por el gestor medioambiental: "
                + gestor.valorMedio(UnidadMedida.C));

        System.out.println(
                "Valor medio de Precipitaciones registrado en las estaciones gestionadas por el gestor medioambiental: "
                        + gestor.valorMedio(UnidadMedida.LITROS_M2));

        System.out.println("Valor medio de N2O registrado en las estaciones gestionadas por el gestor medioambiental: "
                + gestor.valorMedio(UnidadMedida.MG_M3));

        System.out.println("Valor máximo de T registrado en las estaciones gestionadas por el gestor medioambiental: "
                + gestor.valorMasAlto(UnidadMedida.C));

        System.out.println(
                "Valor máximo de Precipitaciones registrado en las estaciones gestionadas por el gestor medioambiental: "
                        + gestor.valorMasAlto(UnidadMedida.LITROS_M2));

        System.out.println("Valor máximo de N2O registrado en las estaciones gestionadas por el gestor medioambiental: "
                + gestor.valorMasAlto(UnidadMedida.MG_M3));

    }
}
