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
		System.out.println("----- JoKenP� ----- \n\n" 
							+ "1 - Pedra		\n" 
							+ "2 - Papel		\n"
							+ "3 - Tesoura		\n" 
							+ "Digite a op��o desejada: ");

		// Op��o do jogador
		jogador = escolha.nextInt();
		escolha.close();

		switch (jogador) {
		case 1:
			System.out.println("Voc� escolheu PEDRA");
			break;
		case 2:
			System.out.println("Voc� escolheu PAPEL");
			break;
		case 3:
			System.out.println("Voc� escolheu TESOURA");
			break;
		default:
			System.out.println("Voc� digitou errado !");

		}

		// L�gica do computador
		computador = (int) (Math.random()*3  + 1);

		// Escolha do computador conforme a l�gica
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

		// L�gica para o resultado
		if (jogador != computador) {
			if (jogador == 1 && computador == 3 || jogador == 2 && computador == 1 || jogador == 3 && computador == 2) {
				System.out.println("Voc� VENCEU !!!");
			} else {
				System.out.println("Voc� PERDEU !!!");
			}
		} else {
			System.out.println("Deu EMPATE !");
		}

	}

}
