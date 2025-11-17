package ejemploPersona;

public class TestAlumno {

	public static void main(String[] args) {
		
		//Crear varios alumnos
		
		Alumno a1 = new Alumno ("BocadillosExtravagantes", (byte)18, "1º DAW");
		Alumno a2 = new Alumno ("PacoLaParrina", (byte)16, "4º ESO B");
		Alumno a3 = new Alumno ("TarzanDeMaceta", (byte)22, "2º DAW");
		
		System.out.println("Alumno 1: " + a1);
		System.out.println("Alumno 2: " + a2);
		System.out.println("Alumno 3: " + a3);

		a2.setNombre("Ana María");
		
		System.out.println("\nEl alumno 2 se llama: " + a2.getNombre());
		
		System.out.println(a2.esMayorDeEdad()? "Es mayor de edad " : "Es menor de edad");
		
		System.out.println("El coste de la matrícula junto al seguro escolar es de: " + a3.costeMatricula() + " €");
		
	}

}
