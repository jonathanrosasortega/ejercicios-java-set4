/*Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
euros la hora.*/
public class ej4 {
	public static void main(String[] args) {
	int horas=0;
    /*int precioHoras=12;*/
    System.out.println("Esta app calcula el salario:");
    System.out.println("¿Cuantas horas has trabajado esta semana?");
    horas = Integer.parseInt(System.console().readLine());
    
    if (horas > 40) {
    	System.out.printf("Si has trabajado %d horas esta semana, te corresponden %d euros\n", horas, (40*12) + ((horas-40)*16));
    }/*IF*/ else {
    	System.out.printf("Si has trabajado %d horas esta semana, te corresponden %d euros\n", horas, horas*12);
    } /*else*/
    
	}
}
