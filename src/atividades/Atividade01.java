package atividades;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float salario;
		float abono;
		float novoSal;
		
		System.out.println("Digite o valor do salário: ");
		salario=ler.nextFloat();		
        
		System.out.println("Digite o valor do abono: ");
		abono=ler.nextFloat();
		
		novoSal = salario + abono;
		
		System.out.printf("Parabéns! O seu novo salário é de R$ "+ novoSal);
		
		ler.close();
		
	}

}
