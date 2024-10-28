package atividades;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float n1, n2, n3, n4, dir;
		System.out.println("Digite o primeiro número: ");
		n1=ler.nextFloat();	
		
		System.out.println("Digite o segundo número: ");
		n2=ler.nextFloat();	
		
		System.out.println("Digite o terceiro número: ");
		n3=ler.nextFloat();	
		
		System.out.println("Digite o quarto número: ");
		n4=ler.nextFloat();	
		
		dir = (n1*n2)-(n3*n4);
		
		System.out.printf("A diferença é: "+ dir);
		
		ler.close();
	
	}
}
