/*Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+
b = 0)*/
public class ej5 {
	public static void main(String[] args) {
	System.out.println("Este programa resuelve ecuaciones de 1º grado (ax + b = 0).");
    
    System.out.println("Introduce el valor de a:");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce el valor de b:");
    double b = Double.parseDouble(System.console().readLine());
    
    if ((a == 0) && (b == 0)) {
    	System.out.println("X = 0");
    } else if ((a == 0) && (b != 0)){
    	System.out.println("La operación no tiene solución");
    } else {
      System.out.printf("X = %.2f\n", (-b/a));
    }

   	}
}
