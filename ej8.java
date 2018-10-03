/*Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente).*/

public class ej8 {
	public static void main(String[] args) {
	
	System.out.println("Calcula la media de 3 notas.");
    System.out.println("Introduce la 1ª nota:");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce la 2ª nota:");
    double nota2 = Double.parseDouble(System.console().readLine());

    System.out.println("Introduce la 3ª nota:");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    double media = (nota1 + nota2 + nota3)/3;
   
    if (media < 5) {
    	System.out.printf("La media te da %.2f\n", media);
    	System.out.println("Pues lo siento, pero has suspendido");
    } else if ((media >= 5) && (media < 6)){
    	System.out.printf("La media te da %.2f\n", media);
    	System.out.println("Has aprobado por los pelos...");
    } else if ((media >= 6) && (media < 7)){
    	System.out.printf("La media te da %.2f\n", media);
    	System.out.println("Has sacado un bien. Seguro que puedes mejorar");
    } else if ((media >= 7) && (media < 9)){
    	System.out.printf("La media te da %.2f\n", media);
    	System.out.println("Bien has sacado un notable. Buena nota");
    } else if ((media >= 9) && (media <= 10)){
    	System.out.printf("La media te da %.2f\n", media);
    	System.out.println("¡Has sacado un sobresaliente!");
    } else if (media > 10) {
    	System.out.println("¡Repasa las cuentas que creo que te has hecho un lío colega!");
    }
    
	}
}