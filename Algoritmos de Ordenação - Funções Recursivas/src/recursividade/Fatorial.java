package recursividade;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Obtenção do número para calcular o fatorial
		System.out.print("Insira o valor para calcular o fatorial: ");
		int n = sc.nextInt(); sc.close();
		
		// Exibindo o fatorial
		System.out.println("Fatorial de "+n+": "+fatorial(n));
	}
	
	// Método recursivo fatorial
	public static int fatorial(int n) {
		
		// Definição do valor final
		if(n == 0) return 1; 
		
		// Chama o próprio método se aproximando do valor final
		return n*fatorial(n-1);
	}
}