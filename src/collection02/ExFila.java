package collection02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/*Escreva um programa contendo uma Collection Queue (Fila) de Objetos do tipo string, 
 * para organizar uma fila por ordem de chegada dos Clientes de um Banco. 
 * O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
2: Listar todos os Clientes na fila
3: Chamar (retirar) uma pessoa da fila 
0: O programa deve ser finalizado. 
Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila.
 
 * */

public class ExFila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();

		Scanner scanner = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("******** Escolha a opção desejada: ********");
			System.out.println("\n      Digite 1 para Adicionar um novo Cliente");
			System.out.println("      Digite 2 para Lista de Clientes na Fila");
			System.out.println("      Digite 3 para Chamar o Cliente");
			System.out.println("      Digite 0 para Sair");
			opcao = scanner.nextInt();

			switch (opcao) {

			case 1:
				System.out.print("Digite o nome do cliente: ");
				String nome = scanner.next();
				fila.add(nome);
				System.out.println("\nCliente Adicionado!");
				break;
			case 2:
				System.out.println("Lista de Clientes na fila de espera:");
				for (String cliente : fila) {
					System.out.println(cliente);
				}
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("A Fila está vazia!");
				} else {
					String chamado = fila.poll();
					System.out.println("Fila:");
					for (String cliente : fila) {
						System.out.println(cliente);
					}
					System.out.println("O Cliente " + chamado + " foi Chamado!");
				}
				break;
			case 0:
				System.out.println("     *****************************************");
				System.out.println("      Você está saindo do sistema, até logo!");
				break;
			default:
				System.out.println("      Opção inválida!");
			}

		} while (opcao != 0);
		
		scanner.close();
	}

}
