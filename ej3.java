/*Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.*/
public class ej3 {
	public static void main(String[] args) {

	System.out.println("Escribe que día de la semana (En número del 1 al 7) y te diré que día es:");
    int diaDeLaSemana = Integer.parseInt(System.console().readLine());
    
    switch (diaDeLaSemana) {
    	case 1:
    		System.out.println("Hoy es Lunes");
    		break;
    	case 2:
    		System.out.println("Hoy es Martes");
    		break;
    	case 3:
    		System.out.println("Hoy es Miércoles");
    		break;
    	case 4:
    		System.out.println("Hoy es Jueves");
    		break;
    	case 5:
    		System.out.println("Hoy es Viernes");
    		break;
    	default:
    		System.out.println("¿Qué diá de la semana es ese?");
    	} /*fin switch*/
    
	}
}
