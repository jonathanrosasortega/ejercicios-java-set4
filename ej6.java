/*Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h. Aplica la fórmula t = √2gh siendo g = 9:81m/s2.*/
public class ej6 {
	public static void main(String[] args) {
	
	double g = 9.81;
	System.out.println("Para calcular el tiempo que tardará en caer un objeto desde cierta altura, primero introduzca la altura:");
    double altura = Double.parseDouble(System.console().readLine());
    
    double segundos = Math.sqrt((2*altura)/g);

    System.out.printf("El objeto tardará %.2f segundos en caer desde %.2f metros\n", segundos, altura);
    
	}
}
