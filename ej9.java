/*Realiza un programa que resuelva una ecuación de segundo grado (del tipo
ax2 + bx + c = 0).*/

public class ej9 {
	public static void main(String[] args) {
	
	System.out.println("Calcula el resultado de una ecuación de 2º grado (ax2 + bx + c = 0)");
    System.out.println("Introduce el valor de a:");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce el valor de b:");
    double b = Double.parseDouble(System.console().readLine());

    System.out.println("Introduce el valor de c:");
    double c = Double.parseDouble(System.console().readLine());
    
    double discriminante = ((b*b) - (4*a*c));
    
    if (discriminante == 0) {
    	System.out.printf("X solo tiene 1 posible valor, que es %.2f\n", (-b)/(2*a));
    } else if (discriminante < 0) {
    	System.out.println("La operación no tiene soluciones reales.");
    } else if (discriminante > 0) {
    	System.out.println("X tiene 2 posibles soluciones:");
    	System.out.printf("X puede valer %.2f\n", ((-b) + Math.sqrt(discriminante))/(2*a));
    	System.out.printf("Aunque también puede valer %.2f\n", ((-b) - Math.sqrt(discriminante))/(2*a));
    }
    
	}
}
