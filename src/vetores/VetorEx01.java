package vetores;

import java.util.Scanner;

public class VetorEx01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] vetor = { 20, 6, 8, 17, 5, 18, 9, 4, 3, 10 };
		boolean found = false;
		

		System.out.println("Qual é o número que você quer encontrar? ");
		int num = scanner.nextInt();

		for (int i = 0; i < vetor.length; i++) {
          
			if(vetor[i] == num) {
				System.out.println("O número está na posição: "+ (i + 0));
				found = true;
				break;  
			} 
		}
			
			   if (!found){
				System.out.println("O número não foi encontrado! ");
			}	
		scanner.close();
	}

}
