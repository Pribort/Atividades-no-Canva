package atividades;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float salbruto, adc, hrex, desc, saliquido;
		
		System.out.println("Digite o valor do salário bruto: ");
		salbruto=ler.nextFloat();
        
		System.out.println("Digite o valor do adicional: ");
		adc=ler.nextFloat();
		
		System.out.println("Digite o valor da hora extra: ");
		hrex=ler.nextFloat();
		
		System.out.println("Digite o valor do desconto por falta: ");
		desc=ler.nextFloat();
		
		saliquido = salbruto + adc + (hrex*5)- desc;
		
		System.out.printf("Valor do salário líquido R$ "+ saliquido);

		ler.close();

}
	
}