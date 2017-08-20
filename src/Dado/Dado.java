package Dado;

import java.util.Scanner;

/**
 * @author Cristiano Morais da Cruz
 */

public class Dado {

	public static void main(String[] args) {

		char opcao = 's';

		Scanner teclado = new Scanner(System.in);

		// Loop caso usu�rio deseja
		while (opcao == 's' || opcao == 'S') {
			System.out.println("Lan�amento do DADO...........");

			// L�gica do dado
			int dado = (int) (Math.random() * 6 + 1);
			System.out.println("Face: " + dado);

			// Esperando op��o do usu�rio
			System.out.println("Deseja lan�ar o dado novamente (s/n) ?");
			opcao = teclado.next().charAt(0);

		}

		teclado.close();

	}

}
