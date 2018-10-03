/*Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día.*/
public class ej1 {
	public static void main(String[] args) {
		
  String diaDeLaSemana;
  
	System.out.println("Escribe que día de la semana (En letras) es y te diré que asignatura tienes a 1ª hora:");
    diaDeLaSemana = (System.console().readLine());
    
    switch (diaDeLaSemana) {
    	case "lunes":
    		System.out.println("Los lunes empezamos con Sistemas informáticos");
    		break;
    	case "martes":
    		System.out.println("Los martes empezamos con Programación");
    		break;
    	case "miercoles":
    		System.out.println("Los miercoles empezamos con Entornos de desarrollo");
    		break;
    	case "jueves":
    		System.out.println("Los jueves empezamos con Entornos de desarrollo");
    		break;
    	case "viernes":
    		System.out.println("Los viernes empezamos con Sistemas informáticos");
    		break;
    	default:
    		System.out.println("Ese día no hay clase");
    	}
    
    
	}
}
