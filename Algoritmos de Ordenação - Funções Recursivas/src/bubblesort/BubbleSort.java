package bubblesort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		// Variaveis auxiliares
		int aux;
		boolean controle;
		
		// Definição do array
		int v[] = gerarVetor(10);
		
		// Mostrando o array
		System.out.println("Antes:"+Arrays.toString(v));
		
		// Organizando a ordem do array
		for(int i = 0;i < v.length;++i) {
			controle = true;
			for(int j = 0;j < v.length-1;++j) {
				
				// Troca os valores caso um elemento for maior do que o próximo
				if(v[j] > v[j+1]) {
					aux = v[j];
					v[j] = v[j+1];
					v[j+1] = aux;
					controle = false;
				}
			}
			if(controle) break; // Se o um elemento não for maior que o próximo, o loop é quebrado
		}
		
		// Mostrando o array
		System.out.println("Depois:"+Arrays.toString(v));
	}
	
	// Método que gera vetores
	public static int[] gerarVetor(int a) {
		// Definição do array gerado
		int v[] = new int[a];
		
		// Criação da classe responsável por atribuir valores aleatórios
		Random gerador = new Random();
		
		// Definição dos valores dos elementos do array
		for(int i=0; i<a; ++i) {
			v[i] = gerador.nextInt(100);
		}
		
		return v;
	}
}