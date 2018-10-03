/*Realiza un programa que calcule la media de tres notas.*/

public class ej7 {
	public static void main(String[] args) {
	
	System.out.println("Calcula la media de 3 notas.");
    System.out.println("Introduce la 1ª nota:");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce la 2ª nota:");
    double nota2 = Double.parseDouble(System.console().readLine());

    System.out.println("Introduce la 3ª nota:");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    double media = (nota1 + nota2 + nota3)/3;
    System.out.printf("La media te da %.2f\n", media);
    
	}
}
