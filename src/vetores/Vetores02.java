package vetores;

import java.util.Scanner;

public class Vetores02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int vetor[] = new int[10];
		int soma = 0;
		float media;

		System.out.println("Digite 10 números: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Número " + (i+1) + ": ");
			vetor[i] = scanner.nextInt();
			soma += vetor[i];
			

		}
		media = (float) soma / vetor.length;

		System.out.print("Números ímpares: ");

		for (int i = 1; i < vetor.length; i += 2) {
			System.out.print(vetor[i] + " ");
		}

		System.out.println();

		System.out.print("Números pares: ");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
			}
		}
	

		System.out.println("Soma dos números: " + soma);
		System.out.println("Soma dos números: " + media);
	}

}
