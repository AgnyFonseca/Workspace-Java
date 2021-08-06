package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] numeros = new double[10];
		double chave;
		int j;
		
		System.out.println("Vetor antes de ordenar: ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextDouble();
		}
		
		for (int i = 1; i < numeros.length; i++) {
			chave = numeros[i];
			j = i-1;
			while ((j >= 0) && (numeros[j] > chave)) {
				numeros[j+1] = numeros[j];
				j--;
			}
			numeros[j+1] = chave;
		}
		
		System.out.println("Vetor ordenado: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("%.2f ", numeros[i]);
		}
		sc.close();
	}

}
