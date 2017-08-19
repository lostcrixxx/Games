package Dado;


import java.util.Scanner;

public class Dado {

	public static void main(String[] args) {

		char opcao = 's';

		Scanner teclado = new Scanner(System.in);
		
		while(opcao == 's' || opcao == 'S') {
			System.out.println("Lançamento do DADO...........");
			int dado = (int) (Math.random()*6+1);
			System.out.println("Face: " + dado);
			System.out.println("Deseja lançar o dado novamente (s/n) ?");
			opcao = teclado.next().charAt(0);
			
		}
		

	}

}
