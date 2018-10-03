/*Escribe un programa que ordene tres números enteros introducidos por
teclado.*/
public class ej13 {
	public static void main(String[] args) {
	int intermediario = 0;

	System.out.println("Yo te ordeno 3 números de menor a mayor");
    System.out.println("Introduce el 1º número");
    int numero1 = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce el 2º número");
    int numero2 = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce el 3º número");
    int numero3 = Integer.parseInt(System.console().readLine());

    if (numero2 > numero3) {
    	intermediario = numero2;
    	numero2 = numero3;
    	numero3 = intermediario;
    }

    if (numero1 > numero2) {
    	intermediario = numero1;
    	numero1 = numero2;
    	numero2 = intermediario;
    }

    System.out.printf("Ordenados de menor a mayor: %d %d %d \n", numero1, numero2, numero3);
    
	}
}
