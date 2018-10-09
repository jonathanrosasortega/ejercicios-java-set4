/*La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
máxima calidad y nos ha pedido hacer un configurador que calcule el precio
según el alto y el ancho. El precio base de una bandera es de un céntimo de
euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
son 3.25 €. El IVA ya está incluido en todas las tarifas.*/
public class ej25 {
	public static void main(String[] args) {
	String escudo;

	System.out.println("Introduzca la altura de la bandera en cm:");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.println("Ahora introduzca la anchura:");
    int anchura = Integer.parseInt(System.console().readLine());
    System.out.println("¿desea escudo? (s/n):");
    escudo = (System.console().readLine());

    
    System.out.println("Gracias. Aquí tiene el desglose de su compra:");
    System.out.printf("Bandera de %d cm2: %.2f €\n", altura*anchura, altura*anchura*0.01);
    System.out.println("Gastos de envío: 3,25 €");
    switch (escudo) {
    	case "s":
    		System.out.println("Con escudo: 2,50 €");
    		System.out.printf("Total: %.2f €\n", (altura*anchura*0.01) + 5.75);
    	break;
    	case "n":
    		System.out.println("Sin escudo: 0,00 €");
    		System.out.printf("Total: %.2f €\n", (altura*anchura*0.01) + 3.25);
    	break;
    	default:
    } //fin switch

	}
}
