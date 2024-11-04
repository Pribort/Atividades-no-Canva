package collection02;

import java.util.Scanner;
import java.util.Stack;

/*Escreva um programa contendo uma Collection Stack (Pilha) de Objetos string, 
 * para organizar a retirada de livros de uma pilha. 
 *O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.

2: Listar todos os livros da Pilha

3: Retirar um livro da pilha 

0: O programa deve ser finalizado. 

Caso a pilha esteja vazia, ao tentar retirar um livro da pilha, o programa deverá informar que a pilha está vazia.



* Para resolver este exercício, não se esqueça de criar a Classe Stack*/
public class Pilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		Scanner scanner = new Scanner(System.in);
		int opcao;
		
		
		do {
			
			System.out.println("\n******** Escolha a opção desejada: ********");
			System.out.println("\n      Digite 1 para Adicionar um novo livro");
			System.out.println("      Digite 2 para Lista de de livros");
			System.out.println("      Digite 3 para retirar um livro");
			System.out.println("      Digite 0 para Sair");
			opcao = scanner.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do livro: ");
                String nome = scanner.next();
                pilha.push(nome);
                System.out.println("Livro adicionado à pilha!");
                break;
			
			case 2:
			
                if (pilha.isEmpty()) {
                    System.out.println("A pilha está vazia.");
                } else {
                    System.out.println("Livros na pilha:");
                    for (String livro : pilha) {
                        System.out.println(livro);
                    }
                }
                break;
                
            case 3:
                if (pilha.isEmpty()) {
                    System.out.println("A pilha está vazia.");
                } else {
                    String remove = pilha.pop();
                    System.out.println("\nLivro " + remove + " removido da pilha.");
                }
                break;
            case 0:
                System.out.println("       Até logo!");
                break;
            default:
                System.out.println("Opção inválida!");
        }
               
					
		}while(opcao!=0);

}

}
