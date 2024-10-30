package lacorepeticoes;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int maior = 0, menor = 0, idade = 0;
		boolean condicao = true;
		
		
		while(condicao) {
			System.out.println("Digite sua idade aqui: ");
			idade = scanner.nextInt();
			
			if (idade < 0) {	
				break;
			}
			
			if(idade <21) {
				menor++;
			}else {
				maior++;
				
			}	
		}
		
		System.out.println("\nTotal de pessoas menores de 21 anos: " + menor);
        System.out.println("Total de pessoas maiores de 50 anos: " + maior);
		

	}

}
