package controles;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		String texto = "";

		do {
			System.out.println("Digite um valor aqui ou 'S' para Sair:");
			texto = entrada.nextLine();

		}while(!texto.equalsIgnoreCase("S"));
		
		System.out.println("Obrigado por ter usado o programa !");
		entrada.close();
		
	}

}
