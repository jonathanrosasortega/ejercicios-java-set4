/*Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
a las 15:00h.*/
public class ej22 {
	public static void main(String[] args) {
	int horasMinutos;
	int minutosHastaViernes;
  
  System.out.println("Yo te digo cuantos minutos faltan hasta el fin de semana (Viernes a las 15:00)");
	System.out.println("Qué día es hoy (Lunes, martes, miercoles, jueves, viernes");
	String diaSemana = (System.console().readLine());
	int horas;
	int minutos;
    System.out.println("Introduce la hora:");
    horas = Integer.parseInt(System.console().readLine());

    System.out.println("Ahora introduce los minutos:");
    minutos = Integer.parseInt(System.console().readLine());
    int totalMinutos = 0;
    
    switch (diaSemana) {
    	case "lunes":
    		horasMinutos = (23 - horas)*60;
		    minutosHastaViernes = 60-minutos;
		    totalMinutos = horasMinutos + minutosHastaViernes + 5220;
		    System.out.printf("Faltan %d minutos\n", totalMinutos);
    	break;

    	case "martes":
    		horasMinutos = (23 - horas)*60;
		    minutosHastaViernes = 60-minutos;
		    totalMinutos = horasMinutos + minutosHastaViernes + 3780;
		    System.out.printf("Faltan %d minutos\n", totalMinutos);
    	break;

    	case "miercoles":
    		horasMinutos = (23 - horas)*60;
		    minutosHastaViernes = 60-minutos;
		    totalMinutos = horasMinutos + minutosHastaViernes + 2340;
		    System.out.printf("Faltan %d minutos\n", totalMinutos);
    	break;

    	case "jueves":
    		horasMinutos = (23 - horas)*60;
		    minutosHastaViernes = 60-minutos;
		    totalMinutos = horasMinutos + minutosHastaViernes + 900;
		    System.out.printf("Faltan %d minutos\n", totalMinutos);
    	break;

    	case "viernes":
    		horasMinutos = (14 - horas)*60;
		    minutosHastaViernes = 60-minutos;
		    totalMinutos = horasMinutos + minutosHastaViernes;
		    System.out.printf("Faltan %d minutos\n", totalMinutos);
    	break;

    	default:
    		System.out.println("Datos incorrectos");
    }
    
   
	}
}
