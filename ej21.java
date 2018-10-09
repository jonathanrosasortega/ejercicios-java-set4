/*Calcula la nota de un trimestre de la asignatura Programación. El programa
pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
Si la media de los dos controles da un número mayor o igual a 5, el alumno
está aprobado y se mostrará la media. En caso de que la media sea un número
menor que 5, el alumno habrá tenido que hacer el examen de recuperación
que se califica como apto o no apto, por tanto se debe preguntar al usuario
¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el
resultado de la recuperación es apto, la nota será un 5; en caso contrario, se
mantiene la nota media anterior.*/
public class ej21 {
	public static void main(String[] args) {
	System.out.println("Nota del 1º examen:");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.println("Nota del 2º examen:");
    double nota2 = Double.parseDouble(System.console().readLine());
    double media = (nota1 + nota2)/2;
    
    if (media < 5) {
    	System.out.println("Tu media es insuficiente. ¿Cuanto sacaste en la recuperación? (Apto/no apto):");
    	String recuperacion = (System.console().readLine());
    	if (recuperacion.equals ("apto")) {media = 5;}
    }
    System.out.printf("Tu nota media en programación es %.2f\n", media);
	}
}
