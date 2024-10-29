package at_ifelse_switch;

import java.util.Scanner;

public class AtividadeIfElse01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome;
		int idade;
		boolean resposta;
		boolean apto = false;
		
        System.out.println("Digite o nome do doador: ");
        nome = leia.nextLine();

        System.out.println("Digite a idade: ");
        idade = leia.nextInt();
        
        System.out.println("Já doou sangue?: ");
        resposta = leia.nextBoolean();
        
        if (idade >= 18 && idade <= 69) {
        	
        if(idade <60) {
        	apto = true;
        	} else if  (resposta) {
        		apto = true;	
        	}
        }
		if (apto) {
			System.out.println("Está apto a doar sangue! Obrigadx! ");
		} else {
			System.out.println("Não está apto para doar sangue, agradecemos o interesse. ");
		}

	}

}
