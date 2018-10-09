/*Escribe un programa que calcule el precio final de un producto según su
base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
reducido o superreducido) y el código promocional. Los tipos de IVA general,
reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
respectivamente que no se aplica promoción, el precio se reduce a la mitad,
se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
muestran los valores correctos, aunque los números no estén tabulados.*/
public class ej23 {
	public static void main(String[] args) {

	String entrada;
	System.out.println("Introduzca la base imponible:");
    double baseImponible = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido):");
    entrada = (System.console().readLine());
    double IVA;

    switch (entrada) {
    	case "general":
    		IVA = 21;
    	break;

    	case "reducido":
    		IVA = 10;
    	break;

    	case "superreducido":
    		IVA = 4;
    	break;
    	default:
    		entrada = "general";
            IVA = 21;
    }

    System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc):");
    String codPromo = (System.console().readLine());

    System.out.printf("Base imponible: %.2f\n", baseImponible);
    System.out.printf("IVA (%.0f%%): %.2f\n", IVA, baseImponible*(IVA/100));
    double precioConIVA = baseImponible + (baseImponible*(IVA/100));
    System.out.printf("Precio con IVA: %.2f\n", precioConIVA);
    
    switch (codPromo) {
        case "nopro":
            System.out.printf("Cód. promo. (%s): -%.2f\n", codPromo, 0.00);
            System.out.printf("Total: %.2f\n", precioConIVA);
        break;

        case "mitad":
            System.out.printf("Cód. promo. (%s): -%.2f\n", codPromo, precioConIVA/2);
            System.out.printf("Total: %.2f\n", precioConIVA - (precioConIVA/2));
        break;

        case "meno5":
            System.out.printf("Cód. promo. (%s): -%.2f\n", codPromo, 5.00);
            System.out.printf("Total: %.2f\n", precioConIVA - 5.00);
        break;

        case "5porc":
            System.out.printf("Cód. promo. (%s): -%.2f\n", codPromo, precioConIVA*0.05);
            System.out.printf("Total: %.2f\n", precioConIVA - (precioConIVA*0.05));
        break;
        default:
            
    }
    
	}
}
