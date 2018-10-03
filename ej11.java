/*Escribe un programa que dada una hora determinada (horas y minutos),
calcule los segundos que faltan para llegar a la medianoche.*/
public class ej11 {
	public static void main(String[] args) {
	int segundos;
	System.out.println("Yo te digo cuantas horas/minutos faltan hasta la medianoche");

    System.out.println("Introduce la hora:");
    int hora = Integer.parseInt(System.console().readLine());

	System.out.println("Ahora introduce los minutos:");
    int minutos = Integer.parseInt(System.console().readLine());

    int segundosMinutos = (60 - minutos) * 60;
    int segundosHoras = (23 - hora) * 3600;
    segundos = segundosHoras + segundosMinutos;
    
    System.out.printf("Si son las %d:%d, faltan %d segundos\n", hora, minutos, segundos);
    
	}
}
