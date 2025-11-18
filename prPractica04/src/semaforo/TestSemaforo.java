package semaforo;

class TestSemaforo  
{ 
	public static void main(String[] args)  
	{ 
		Semaforo miSemaforo = new Semaforo("Rojo"); 
		Semaforo semaforoDeMiCalle = new Semaforo("Verde"); 
		Semaforo otroSemaforo = new Semaforo("Amarillo"); 
		
		miSemaforo.setColor("Rojo"); 
		otroSemaforo.setColor("Verde"); 
		
		System.out.println(otroSemaforo.getColor()); 
		System.out.println(semaforoDeMiCalle.getColor()); 
		
		if (miSemaforo.getColor().equals("Rojo")) 
			System.out.println("No pasar");  
		if (miSemaforo.puedoPasar() == true) 
			System.out.println("Puedes pasar"); 
		else 
			System.out.println("No puedes pasar"); 
		
		System.out.println("\n" +miSemaforo.toString()); 
		System.out.println("\n"+otroSemaforo.toString()); 
		System.out.println("\n"+semaforoDeMiCalle.toString()); 
	} 
} 