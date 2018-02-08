import java.util.Scanner;

public class Main {
	
	static int notas[];
	static Scanner sc;
	
	public static void pedirNotas(int Cantidad) {
		
		notas = new int[Cantidad];
		for (int i=0; i<Cantidad; i++) {
			System.out.println("Introduzca nota ");
			notas[i] = sc.nextInt();
		}
		
	}
	
	public static void calcularMedia() {
		System.out.println("La nota media de las notas es: ");
		int auxiliar = 0;
		for(int i=0;i<notas.length;i++) {
			auxiliar+=notas[i];
		}
		System.out.println((double)auxiliar/notas.length);
		
	}
	
	public static void main(String[] args) {
	// TODO Apéndice de método generado automáticamente
	
		System.out.println("Cuántas notas vas a introducir?? ");
		sc = new Scanner(System.in);
		int elementos = sc.nextInt();
		
		pedirNotas(elementos);
		calcularMedia();
	
	}
	
}