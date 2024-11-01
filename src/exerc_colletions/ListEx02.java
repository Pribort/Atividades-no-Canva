package exerc_colletions;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx02 {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);

		num.add(10);
		num.add(15);
		num.add(22);
		num.add(16);
		num.add(2);
		num.add(17);
		num.add(23);
		num.add(30);
		num.add(75);
		num.add(58);

		System.out.println("Lista de números: " + num);

		for (Integer pesquisa : num) {

			System.out.println("Digite um número: ");
			pesquisa = scanner.nextInt();

			if (num.contains(pesquisa)) {
				int posicao = num.indexOf(pesquisa);
				System.out.println("O número " + num + " está localizado na posição: " + posicao);
			} else {
				System.out.println("O número " + num + " não foi encontrado!");

				break;
			}

		}

	}

}
