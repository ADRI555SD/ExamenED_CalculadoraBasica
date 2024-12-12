package calculadora;

import java.util.Scanner;

public class SumaNumeros {
		
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingresa el primer número: "); // Preguntamos al usuario que introduzca un numero
		int numero1 = scanner.nextInt();
		
		System.out.print("Ingresa el segundo número: "); // Preguntamos al usuario que introduzca otro un numero
		int numero2 = scanner.nextInt();
		
		int suma = numero1 + numero2; // Calculamos la suma de los dos numeros
		
		System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma); // Mostramos el resultado al usuario
	}
}