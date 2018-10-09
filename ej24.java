/*Escribe un programa que genere la nómina (bien desglosada) de un empleado
según las siguientes condiciones:
• Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3
- Jefe de proyecto), los días que ha estado de viaje visitando clientes
durante el mes y su estado civil (1 - Soltero, 2 - Casado).
• El sueldo base según el cargo es de 950, 1200 y 1600 euros según
si se trata de un prog. junior, un prog. senior o un jefe de proyecto
respectivamente.
• Por cada día de viaje visitando clientes se pagan 30 euros extra en
concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será
de un 25% en caso de estar soltero y un 20% en caso de estar casado.*/
public class ej24 {
	public static void main(String[] args) {
	System.out.println("Introduzca el cargo del empleado:");
    System.out.println("1 - Programador junior");
    System.out.println("2 - Prog. senior");
    System.out.println("3 - Jefe de proyecto");
    int cargo = Integer.parseInt(System.console().readLine());
	System.out.println("¿Cuántos días ha estado de viaje visitando clientes?:");
	int diasViaje = Integer.parseInt(System.console().readLine());
	System.out.println("Introduzca su estado civil (1 - Soltero, 2 - Casado):");
	int estadoCivil = Integer.parseInt(System.console().readLine());

	double sueldoBase;
	switch (cargo) {
		case 1:
			sueldoBase = 950;
		break;
		case 2:
			sueldoBase = 1200;
		break;
		case 3:
			sueldoBase = 1200;
		break;
		default:
			sueldoBase = 0;
	}

	double IRPF=0;
	switch (estadoCivil) {
		case 1:
			IRPF = 25;
		break;
		case 2:
			IRPF = 20;
		break;
		default:
			IRPF = 0;
	}

	System.out.printf("Sueldo base: %.2f\n", sueldoBase);
    System.out.printf("Dietas (%d viajes) %d\n\n", diasViaje, diasViaje*30);
    double sueldoBruto = sueldoBase + (diasViaje*30);
    System.out.printf("Sueldo bruto: %.2f\n", sueldoBruto);
    System.out.printf("Retención IRPF (%.0f%%): %.2f\n", IRPF, sueldoBruto*(IRPF/100));
    System.out.printf("Sueldo neto: %.2f\n", sueldoBruto-(sueldoBruto*(IRPF/100)));
	}
}
