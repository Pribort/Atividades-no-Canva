package lacorepeticoes;

import java.util.Scanner;

         public class DoWhile {
        	 
        	 
         public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		
		int soma = 0, num;
		
		do {
		System.out.print("Digite um número: ");
        num = scanner.nextInt();
       
        
        if (num > 0) {
            soma += num;  
        }
      
		
		} while (num != 0); 

		System.out.println("\n*************************************");
        System.out.println("  A soma dos números positivos é: " + soma);

		
		
}
}