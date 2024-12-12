package calculadora;

import java.util.Scanner;

/**
 * Realizamos una suma y una resta entre dos numeros.
 * Los numeros son introducidos por un usuario.
 * 
 * @author Adrià Rocha Coll
 * @version 1.0
 */

public class SumaNumeros {
		
	public static void main(String[] args) {
		
		// Cambio realizado desde rama feature-suma
		// Comentario después de realizar fusión entre ramass
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingresa el primer número: "); // Preguntamos al usuario que introduzca un numero
		int numero1 = scanner.nextInt();
		
		System.out.print("Ingresa el segundo número: "); // Preguntamos al usuario que introduzca otro un numero
		int numero2 = scanner.nextInt();
		
		int suma = numero1 + numero2; // Calculamos la suma de los dos numeros
		
		System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma); // Mostramos el resultado al usuario
	}
}