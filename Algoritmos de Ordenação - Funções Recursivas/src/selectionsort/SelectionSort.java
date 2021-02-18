package selectionsort;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

	public static void main(String[] args) {
		// Define o array
		int v[] = gerarVetor(10);
		
		// Mostra o array com elementos aleatórios
		System.out.println("Antes: "+Arrays.toString(v));
		
		// Organiza o array e o mostra
		selSort(v);
		System.out.println("Depois: "+Arrays.toString(v));
	}
	
	// Método que organiza o array
	private static void selSort(int[] v) {
		// Loop que percorre todo o array
		for(int i=0;i<v.length;++i) {
			int menor = i;
			
			// Procura um elemento menor por todo o array 
			for(int j=i+1;j<v.length;++j) {
				if(v[j]<v[menor]) menor = j;
			}
			
			// Troca o elemento menor pelo maior
			int aux = v[i];
			v[i] = v[menor];
			v[menor] = aux;
			
		}
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