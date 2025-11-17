package prPractica01;

public class Ejercicio09 { 
	 public static void main(String[] args) { 
	   
	  byte edadJuan = 20; 
	  byte edadPedro = 42; 
	  
	  short sueldoBase = 1980; 
	  short complementos = 400; 
	  
	  int sueldoTotalJuan =sueldoBase+complementos+30;
	  int sueldoTotalPedro = sueldoBase+complementos+100;
	  
	  double porcJ = sueldoTotalJuan*0.15 + sueldoTotalJuan*0.09;
	  double porcP = sueldoTotalPedro*0.15 + sueldoTotalPedro*0.09;
	  
	  double totalconporcJ = sueldoTotalJuan - porcJ;
	  double totalconporcP= sueldoTotalPedro - porcP;
	 
	  
	  
	  System.out.println("El sueldo real del empleado de " + edadJuan + " años es: " + totalconporcJ + " euros");
	  System.out.println("El sueldo real del empleado de " + edadPedro + " años es: " + totalconporcP + " euros");
	  
	  
	  
	  /**
	   * Sabiendo que el sueldo real se obtiene de sumar al sueldo base los complementos, y 30 euros si su 
edad es inferior a 25, 60 euros si su edad es inferior a 35, y 100 euros si su edad es inferior o igual a 
65, y después deducirle un 15% de IRPF y un 9% de Seguridad Social.
	   */
	 } 
	} 
