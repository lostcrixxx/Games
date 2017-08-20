package Jokenpo;

import java.util.Scanner;

/**
 * @author Cristiano Morais da Cruz
 */

public class Jokenpo {

	public static void main(String[] args) {

		int jogador;
		int computador;

		Scanner escolha = new Scanner(System.in);

		// Menu
		System.out.println("----- JoKenPô ----- \n\n" 
							+ "1 - Pedra		\n" 
							+ "2 - Papel		\n"
							+ "3 - Tesoura		\n" 
							+ "Digite a opção desejada: ");

		// Opção do jogador
		jogador = escolha.nextInt();
		escolha.close();

		switch (jogador) {
		case 1:
			System.out.println("Você escolheu PEDRA");
			break;
		case 2:
			System.out.println("Você escolheu PAPEL");
			break;
		case 3:
			System.out.println("Você escolheu TESOURA");
			break;
		default:
			System.out.println("Você digitou errado !");

		}

		// Lógica do computador
		computador = (int) (Math.random()*3  + 1);

		// Escolha do computador conforme a lógica
		switch (computador) {
		case 1:
			System.out.println("Computador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Computador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Computador escolheu TESOURA");
			break;
		default:
			System.out.println("Computador escolheu errado");
		}

		// Lógica para o resultado
		if (jogador != computador) {
			if (jogador == 1 && computador == 3 || jogador == 2 && computador == 1 || jogador == 3 && computador == 2) {
				System.out.println("Você VENCEU !!!");
			} else {
				System.out.println("Você PERDEU !!!");
			}
		} else {
			System.out.println("Deu EMPATE !");
		}

	}

}
