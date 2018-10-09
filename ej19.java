/*Realiza un programa que nos diga cuántos dígitos tiene un número entero que
puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.*/
public class ej19 {
	public static void main(String[] args) {
	System.out.println("Escribe un número y te diré cuantos dígitos tiene (solo si tiene 5 o menos cifras):");
    int numero = Integer.parseInt(System.console().readLine());
    int digitos = 0;

    if ((numero >= 0) && (numero < 10)) {
    	digitos = 1;
    } else if ((numero >= 10) && (numero < 100)) {
    	digitos = 2;
    } else if ((numero >= 100) && (numero < 1000)) {
    	digitos = 3;
    } else if ((numero >= 1000) && (numero < 10000)) {
    	digitos = 4;
    } else if ((numero >= 10000) && (numero < 100000)) {
    	digitos = 5;
    }
    
    System.out.printf("%d tiene %d dígitos\n", numero, digitos);

	}
}
