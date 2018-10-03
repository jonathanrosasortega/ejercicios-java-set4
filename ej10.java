/*Escribe un programa que nos diga el horóscopo a partir del día y el mes de
nacimiento.*/

public class ej10 {
	public static void main(String[] args) {
	
	String mes;

	System.out.println("Voy a decirte tu horóscopo según tu dia y mes de nacimiento");
    System.out.println("Introduce tu dia de nacimiento:");
    int dia = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce ahora tu mes de nacimiento:");
    mes = (System.console().readLine());
    
    switch (mes) {
    	case "enero":
    		if ((dia >= 1) && (dia < 21)) {
    			System.out.println("Tu horóscopo es Capricornio");
    		} else if ((dia >= 22) && (dia <= 31)) {
    			System.out.println("Tu horóscopo es Acuario");
    		} else if ((dia < 1) || (dia > 31)) {
    			System.out.println("Has introducido un día incorrecto");
    		}
    		break;
    	case "febrero":
    		if ((dia >= 1) && (dia < 20)) {
    			System.out.println("Tu horóscopo es Acuario");
    		} else if ((dia >= 20) && (dia <= 31)) {
    			System.out.println("Tu horóscopo es Piscis");
    		} else if ((dia < 1) || (dia > 31)) {
    			System.out.println("Has introducido un día incorrecto");
    		}
    		break;
    	case "marzo":
    		if ((dia >= 1) && (dia < 21)) {
    			System.out.println("Tu horóscopo es Piscis");
    		} else if ((dia >= 21) && (dia <= 31)) {
    			System.out.println("Tu horóscopo es Aries");
    		} else if ((dia < 1) || (dia > 31)) {
    			System.out.println("Has introducido un día incorrecto");
    		}
    		break;
    	case "abril":
    		if ((dia >= 1) && (dia < 21)) {
    			System.out.println("Tu horóscopo es Aries");
    		} else if ((dia >= 21) && (dia <= 31)) {
    			System.out.println("Tu horóscopo es Tauro");
    		} else if ((dia < 1) || (dia > 31)) {
    			System.out.println("Has introducido un día incorrecto");
    		}
    		break;
    	case "mayo":
    		if ((dia >= 1) && (dia < 22)) {
    			System.out.println("Tu horóscopo es Tauro");
    		} else if ((dia >= 22) && (dia <= 31)) {
    			System.out.println("Tu horóscopo es Géminis");
    		} else if ((dia < 1) || (dia > 31)) {
    			System.out.println("Has introducido un día incorrecto");
    		}
    		break;
    	case "junio":
    		if ((dia >= 1) && (dia < 22)) {
    			System.out.println("Tu horóscopo es Géminis");
    		} else if ((dia >= 22) && (dia <= 31)) {
    			System.out.println("Tu horóscopo es Cáncer");
    		} else if ((dia < 1) || (dia > 31)) {
    			System.out.println("Has introducido un día incorrecto");
    		}
    		break;
    	case "julio":
    		if ((dia >= 1) && (dia < 24)) {
    			System.out.println("Tu horóscopo es Cáncer");
    		} else if ((dia >= 24) && (dia <= 31)) {
    			System.out.println("Tu horóscopo es Leo");
    		} else if ((dia < 1) || (dia > 31)) {
    			System.out.println("Has introducido un día incorrecto");
    		}
    		break;
    	case "agosto":
    		if ((dia >= 1) && (dia < 24)) {
    			System.out.println("Tu horóscopo es Leo");
    		} else if ((dia >= 24) && (dia <= 31)) {
    			System.out.println("Tu horóscopo es Virgo");
    		} else if ((dia < 1) || (dia > 31)) {
    			System.out.println("Has introducido un día incorrecto");
    		}
    		break;
    	case "septiembre":
    		if ((dia >= 1) && (dia < 24)) {
    			System.out.println("Tu horóscopo es Virgo");
    		} else if ((dia >= 24) && (dia <= 31)) {
    			System.out.println("Tu horóscopo es Libra");
    		} else if ((dia < 1) || (dia > 31)) {
    			System.out.println("Has introducido un día incorrecto");
    		}
    		break;
    	case "octubre":
    		if ((dia >= 1) && (dia < 24)) {
    			System.out.println("Tu horóscopo es Libra");
    		} else if ((dia >= 24) && (dia <= 31)) {
    			System.out.println("Tu horóscopo es Escorpio");
    		} else if ((dia < 1) || (dia > 31)) {
    			System.out.println("Has introducido un día incorrecto");
    		}
    		break;
    	case "noviembre":
    		if ((dia >= 1) && (dia < 23)) {
    			System.out.println("Tu horóscopo es Escorpio");
    		} else if ((dia >= 23) && (dia <= 31)) {
    			System.out.println("Tu horóscopo es Sagitario");
    		} else if ((dia < 1) || (dia > 31)) {
    			System.out.println("Has introducido un día incorrecto");
    		}
    		break;
    	case "diciembre":
    		if ((dia >= 1) && (dia < 22)) {
    			System.out.println("Tu horóscopo es Sagitario");
    		} else if ((dia >= 22) && (dia <= 31)) {
    			System.out.println("Tu horóscopo es Capricornio");
    		} else if ((dia < 1) || (dia > 31)) {
    			System.out.println("Has introducido un día incorrecto");
    		}
    		break;
    	default:
    		System.out.println("No existe ese mes");
    	}
	}
}
