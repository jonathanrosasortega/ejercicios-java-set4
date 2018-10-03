/*Escribe un programa que pinte una pirámide rellena con un carácter introducido por teclado que podrá ser una letra, un número o un símbolo como *, +,
-, $, &, etc. El programa debe permitir al usuario mediante un menú elegir si
el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la
izquierda o hacia la derecha.*/
public class ej15 {
	public static void main(String[] args) {

	System.out.println("Yo te pinto una pirámide con el caracter que quieras.");
    System.out.println("Introduce el carácter de relleno:");
    String caracter = (System.console().readLine());
    System.out.println("Introduce ahora como quieres la pirámide:");
    System.out.println("1) Apuntando hacia arriba");
    System.out.println("2) Apuntando hacia abajo");
    System.out.println("3) Apuntando hacia la izquierda");
    System.out.println("4) Apuntando hacia la derecha");
    int opcion = Integer.parseInt(System.console().readLine());

    System.out.printf("\n"); /*salto de linea*/
    switch (opcion) {
    	case 1:
    		System.out.printf("  %s  \n", caracter);
    		System.out.printf(" %s%s%s \n", caracter, caracter, caracter);
    		System.out.printf("%s%s%s%s%s\n", caracter, caracter, caracter, caracter, caracter);
    	break;

    	case 2:
    		System.out.println(caracter + caracter + caracter + caracter + caracter);
    		System.out.println(" " + caracter + caracter + caracter + " ");
    		System.out.println("  " + caracter + "  ");
    	break;

    	case 3:
    		System.out.println(caracter + "  ");
    		System.out.println(caracter + caracter + " ");
    		System.out.println(caracter + caracter + caracter);
    		System.out.println(caracter + caracter + " ");
    		System.out.println(caracter + "  ");
    	break;

    	case 4:
    		System.out.println("  " + caracter);
    		System.out.println(" " + caracter + caracter);
    		System.out.println(caracter + caracter + caracter);
    		System.out.println(" " + caracter + caracter);
    		System.out.println("  " + caracter);
    	break;

    	default:
    		System.out.println("Opción no permitida");
    } /*fin switch*/

	}
}
