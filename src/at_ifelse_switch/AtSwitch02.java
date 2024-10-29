package at_ifelse_switch;

import java.util.Scanner;

public class AtSwitch02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float saldo = 1000;
		float saque = 0;
		float deposito = 0;
		int opcao;
		System.out.println("      Bem-vindx ao Banco Sarjeta   ");
		System.out.println("   ============   Menu   ============   ");
        System.out.println("   Digite 1 para Saldo: ");
        System.out.println("   Digite 2 para Saque: ");
        System.out.println("   Digite 3 para Depósito: ");
	    opcao = leia.nextInt();
		
	    switch (opcao) {
	     
	    case 1: 	
	    	 System.out.println("   Operação  Saldo  ");
	    	 System.out.println("   ===============  ");
             System.out.printf("   Saldo: R$ %.2f%n", saldo);
             break;
             
	    case 2:
	    	System.out.println("   Operação  Saque  ");
	    	System.out.println("   ===============  ");
	    	System.out.printf("   Valor do Saque R$ ");
	    	saque = leia.nextFloat();
	    	System.out.println("   ===============  ");
            
             
             if (saque > saldo)
                 {
                     System.out.println("   Operação  Saque  ");
                     System.out.println("   ===============  ");
                     System.out.println("  Saldo Insuficiente!");
                 } else {
                	 saldo -= saque;
                	 System.out.println("  Operação - Saque");
                	 System.out.println("   ===============  ");
                     System.out.printf("   Novo Saldo: R$ %.2f%n", saldo);
                	 
                 }
             break;
             
	    case 3:
	    	System.out.println("   Operação  Depósito  ");
	    	System.out.println("   ===============  ");
	    	System.out.printf("   Valor do Depósito R$ ");
	    	deposito = leia.nextFloat();
	        
             saldo += deposito;
             System.out.println("   ===============  ");
             System.out.printf("   Novo Saldo: R$  " + saldo);
             break;
             
         default:  
        	 System.out.println("           ===============  ");
        	 System.out.println("          Operação Inválida!  ");
        	 System.out.println("           ===============  ");
             break;
   
	    }
	}

}
