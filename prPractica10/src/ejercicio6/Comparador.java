package ejercicio6;

import java.util.Comparator;

public class Comparador implements Comparator<Alumno>{

	

	@Override
	public int compare(Alumno o1, Alumno o2) {
		// TODO Auto-generated method stub
		int compara = o1.getApellido1().compareTo(o2.getApellido2());
		
		if(compara!=0) {
			return compara;
		}
		
		return o1.getDni().compareTo(o2.getDni());
	}

}
