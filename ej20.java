/*Realiza un programa que diga si un número entero positivo introducido por
teclado es capicúa. Se permiten números de hasta 5 cifras.*/
public class ej20 {
	public static void main(String[] args) {
	System.out.println("Escribe un número y te diré si es capicúa");
	int numero = Integer.parseInt(System.console().readLine());
	int intermediario = numero;
	int capicua = 0;

    if ((numero >= 0) && (numero < 10)) {
    	System.out.printf("El número %d solo tiene un dígito, así que SI es capicúa\n", numero);
    } else if ((numero >= 10) && (numero < 100)) {
    	capicua += intermediario%10;
    	intermediario = intermediario/10;
    	capicua = (capicua*10)+intermediario;
    	
    	if (capicua == numero) {
    		System.out.printf("El número %d sería %d. Así que sería capicua\n", numero, capicua);
    	} else {
    		System.out.printf("El número %d sería %d. Así que NO sería capicua\n", numero, capicua);
    	}
    } else if ((numero >= 100) && (numero < 1000)) {
    	capicua += intermediario%10;
    	intermediario = intermediario/10;
    	capicua = capicua*10;
    	capicua += intermediario%10;
    	intermediario = intermediario/10;
    	capicua = (capicua*10)+intermediario;
    	
    	if (capicua == numero) {
    		System.out.printf("El número %d sería %d. Así que sería capicua\n", numero, capicua);
    	} else {
    		System.out.printf("El número %d sería %d. Así que NO sería capicua\n", numero, capicua);
    	}
    } else if ((numero >= 1000) && (numero < 10000)) {
    	capicua += intermediario%10;
    	intermediario = intermediario/10;
    	capicua = capicua*10;
    	capicua += intermediario%10;
    	intermediario = intermediario/10;
    	capicua = capicua*10;
    	capicua += intermediario%10;
    	intermediario = intermediario/10;
    	capicua = (capicua*10)+intermediario;

    	if (capicua == numero) {
    		System.out.printf("El número %d sería %d. Así que sería capicua\n", numero, capicua);
    	} else {
    		System.out.printf("El número %d sería %d. Así que NO sería capicua\n", numero, capicua);
    	}
    } else if ((numero >= 10000) && (numero < 100000)) {
    	capicua += intermediario%10;
    	intermediario = intermediario/10;
    	capicua = capicua*10;
    	capicua += intermediario%10;
    	intermediario = intermediario/10;
    	capicua = capicua*10;
    	capicua += intermediario%10;
    	intermediario = intermediario/10;
    	capicua = capicua*10;
    	capicua += intermediario%10;
    	intermediario = intermediario/10;
    	capicua = (capicua*10)+intermediario;
    	
    	if (capicua == numero) {
    		System.out.printf("El número %d sería %d. Así que sería capicua\n", numero, capicua);
    	} else {
    		System.out.printf("El número %d sería %d. Así que NO sería capicua\n", numero, capicua);
    	}
    }

	}
}
