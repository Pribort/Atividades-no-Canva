package exerc_colletions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetEx02 {

	public static void main(String[] args) {
		Set<Integer> num = new HashSet<>();
		Scanner scann = new Scanner(System.in);
		
		num.add(5);
		num.add(6);
		num.add(9);
		num.add(11);
		num.add(8);
		num.add(1);
		num.add(4);
		num.add(3);
		num.add(2);
		num.add(7);
		
		//System.out.println("Lista de números: " + num);
		
		
		for ( Integer digito : num) {
		System.out.println("\nDigite o número que deseja procurar: ");
        digito =scann.nextInt();
        
        
        if (num.contains(digito)) {
            System.out.println("\nNúmero " + num + " foi encontrado!");
        } else {
            System.out.println("O número " + num + " não foi encontrado!");
            break;
        }
	}
	}
}
