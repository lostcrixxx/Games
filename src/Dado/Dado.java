package Dado;

import java.util.Scanner;

/**
 * @author Cristiano Morais da Cruz
 */

public class Dado {

	public static void main(String[] args) {

		char opcao = 's';

		Scanner teclado = new Scanner(System.in);

		// Loop caso usuário deseja
		while (opcao == 's' || opcao == 'S') {
			System.out.println("Lançamento do DADO...........");

			// Lógica do dado
			int dado = (int) (Math.random() * 6 + 1);
			System.out.println("Face: " + dado);

			// Esperando opção do usuário
			System.out.println("Deseja lançar o dado novamente (s/n) ?");
			opcao = teclado.next().charAt(0);

		}

		teclado.close();

	}

}
