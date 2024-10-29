package at_ifelse_switch;

import java.util.Scanner;

public class AtSwitch {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	    float n1 = 10, n2 = 5;
	    float res;
	    int operacao;
	    
	    System.out.println("        Escolha sua Operação   ");
		System.out.println("   ============   Menu   ============   ");
        System.out.println("   Digite 1 para Soma: ");
        System.out.println("   Digite 2 para Subtração: ");
        System.out.println("   Digite 3 para Multiplicação: ");
        System.out.println("   Digite 4 para Divisão: ");
	    operacao = leia.nextInt();
	    
	    switch(operacao) {
	    
	    case 1:
	    	res = n1 + n2;
	    	 System.out.printf("   A soma de %.2f + %.2f = %.2f%n", n1, n2, res);
             break;
	    case 2:
	    	res = n1 - n2;
	    	System.out.printf("   A subtração de %.2f - %.2f = %.2f%n", n1, n2, res);
            break;
	    case 3:
	    	res = n1 * n2;
	    	System.out.printf("   A multiplicação de %.2f - %.2f = %.2f%n", n1, n2, res);
	    	break;
	    	
	    case 4:
	    	res = n1 / n2;
	    	System.out.printf("   A divisão de %.2f - %.2f = %.2f%n", n1, n2, res);
	    	break;
	    	
	    default:
	    	System.out.println("   ==========================================  ");
	    	System.out.printf("   !Pane no sistema, alguém me desconfigurou! ");
	    
	    	break;
	    }

	}

}
