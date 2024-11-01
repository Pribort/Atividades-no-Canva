package exerc_colletions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetEx01 {
	public static void main(String[] args) {

		Set<Integer> num = new HashSet<>();
		Scanner scann = new Scanner(System.in);
		System.out.println("Digite APENAS 10 números e NÃO podem ser repetidos: ");

		while (num.size() < 10) {
            System.out.print(" " + (num.size() + 1) + "º Número: ");
            int digito = scann.nextInt();

            if (num.contains(digito)) {
                System.out.println("ERROR! Número repetido, digite novamente!");
            } else {
                num.add(digito);
            }
		}
		System.out.println("\nNúmeros: ");
		Iterator <Integer> iterator = num.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		scann.close();
	}
}
