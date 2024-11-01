package exerc_colletions;

import java.util.ArrayList;

import java.util.Scanner;

public class CoresEx01 {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i <= 5; i++) {

			System.out.println("Digite as cores desejadas: ");
			cores.add(scanner.next());

		}

		System.out.println(cores);

		cores.sort(null);

		for (String ordem : cores) {

			System.out.println(ordem);

		}
		
		scanner.close();
	}

}
