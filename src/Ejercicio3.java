import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuantos elementos vas a introducir?? ");
		int elementos = sc.nextInt();
		
		Integer[] arrElementos = new Integer[elementos];
		
		//arrElementos.lenght == elementos
		for(int i=0;i<elementos;i++) {
			System.out.println("Introduce elemento ");
			sc = new Scanner(System.in);
			arrElementos[i] = sc.nextInt();
		}
		
		Arrays.sort(arrElementos,Collections.reverseOrder());
		System.out.println(Arrays.toString(arrElementos));
	}
}
