/*Pedir un número de 0 a 99 y mostrarlo escrito.
Ej.: 56 mostraría "Cincuenta y seis"*/
public class ej20 {
	public static void main(String[] args) {
	System.out.println("Escribe un número entre 0 y 99 y te lo mostraré escrito:");
	int numero = Integer.parseInt(System.console().readLine());
	int decenas;
    int unidades;
    String stringUnidades;
    String stringDecenas

    if ((numero < 0) || (numero > 99)) {
    	System.out.printf("El número introducido no se encuentra entre 0 y 99\n");
    } else if (numero >= 0) || (numero < 10) {
        unidades = numero;
    } else {
        unidades = numero%10;    	
        decenas = numero/10;  
    } /*fin if-else*/

    
    switch (unidades) {
        case 1:
            stringUnidades = "uno";
        break;

        case 2:
            stringUnidades = "dos";
        break;

        case 3:
            stringUnidades = "tres";
        break;

        case 4:
            stringUnidades = "cuatro";
        break;

        case 5:
            stringUnidades = "cinco";
        break;

        case 6:
            stringUnidades = "seis";
        break;

        case 7:
            stringUnidades = "siete";
        break;

        case 8:
            stringUnidades = "ocho";
        break;

        case 9:
            stringUnidades = "nueve";
        break;

        default:
    } /* fin switch unidades*/
    
    switch (decenas) {
        case 1:
            stringUnidades = "uno";
        break;

        case 2:
            stringUnidades = "dos";
        break;

        case 3:
            stringUnidades = "tres";
        break;

        case 4:
            stringUnidades = "cuatro";
        break;

        case 5:
            stringUnidades = "cinco";
        break;

        case 6:
            stringUnidades = "seis";
        break;

        case 7:
            stringUnidades = "siete";
        break;

        case 8:
            stringUnidades = "ocho";
        break;

        case 9:
            stringUnidades = "nueve";
        break;

        default:
    } /*fin switch decenas*/

	}
}