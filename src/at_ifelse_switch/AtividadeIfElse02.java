package at_ifelse_switch;

import java.util.Scanner;

public class AtividadeIfElse02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num;
		String comp;
		String pn;
		
		System.out.println("Digite um número: ");
        num = leia.nextInt();

        if(num % 2 == 0) {
        	
        	comp = "Par";
        	
        } else { 
        	
        	comp = "Ímpar";
        }
        
        if (num >= 0) {
        	pn = "Positivo";
        }else {
        	pn = "Negativo";
        }
        
        System.out.println("O número "+ num + " é " + comp+ " "+ pn+ "!");
        
	}

}
