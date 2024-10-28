package atividades;

import java.util.Scanner;

public class Atividade02 {
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	float n1, n2, n3, n4, media;
	
	System.out.println("Digite a primeira nota aqui: ");
	n1=ler.nextFloat();	
	
	System.out.println("Digite a segunda nota aqui: ");
	n2=ler.nextFloat();	
	
	System.out.println("Digite a terceira nota aqui: ");
	n3=ler.nextFloat();	
	
	System.out.println("Digite a quarta nota aqui: ");
	n4=ler.nextFloat();	
	
	media = (n1 + n2 + n3 + n4) / 4;
	
	System.out.printf("Sua média final é: "+media);
	 
	ler.close();
	
	}
	
}
