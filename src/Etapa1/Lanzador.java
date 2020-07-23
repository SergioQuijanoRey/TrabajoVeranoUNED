import java.util.Date;

public class Lanzador {

	public static void main(String[] args) {
		
		// Creamos una localización en Madrid y otra en Barcelona
		Localizacion madrid = new Localizacion("Madrid",40.4165000,-3.7025600, 667.0);
		Localizacion barcelona = new Localizacion("Barcelona",41.3818,2.1685, 13.0);

		// Modificamos los campos de las localizaciones e imprimimos los nuevos valores
		madrid.setNombre("Madrid-Barajas");
		madrid.setLatitud(40.4918100);
		madrid.setLongitud(-3.5694800);
		System.out.println("La nueva localización de la estación meteorológica en Madrid se llama " + madrid.getNombre() + ", con latitud: " + madrid.getLatitud() + " , longitud: " + madrid.getLongitud() + " y altitud: " + madrid.getAltitud());

		barcelona.setNombre("Barcelona-Sans");
		barcelona.setLatitud(41.3726311);
		barcelona.setLongitud(2.1545999);
		System.out.println("La nueva localización de Barcelona es: " + "\n"+ barcelona.print());


		// Creamos mediciones en un momento actual e imprimimos los valores medidos en cada caso
		Date momentoActual = new Date();
		MedicionTemperatura temp1 = new MedicionTemperatura(1,18.34,momentoActual);
		System.out.println("La medición de temperatura tomada en este momento es " + temp1.print());

		MedicionPrecipitaciones prec1 = new MedicionPrecipitaciones (2,0.55,momentoActual);
		System.out.println("La medición de precipitaciones tomada en este momento es " + prec1.print());

		ConcentracionN2O concent1 = new ConcentracionN2O (3,0.67,momentoActual);
		System.out.println("La medición de concentración de N2O tomada en este momento es " + concent1.print());

	}	
}
