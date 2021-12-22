package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o 1º Salário: ");
		String primeiroSalario = teclado.next().replace(",", ".");

		System.out.println("Digite o 2º Salário: ");
		String segundoSalario = teclado.next().replace(",", ".");;

		System.out.println("Digite o 3º Salário: ");
		String terceiroSalario = teclado.next().replace(",", ".");
		
		
		double salario1 = Double.parseDouble(primeiroSalario);
		double salario2 = Double.parseDouble(segundoSalario);
		double salario3 = Double.parseDouble(terceiroSalario);
		
		double somaSalarios =  salario1+salario2+salario3;
		double mediaUltimos3Salarios = somaSalarios / 3;
		
		System.out.printf("A soma do 1º salario: R$%.2f com o 2º salario: R$%.2f com o 3º salario R$%.2f é de R$%.2f",
				salario1, salario2, salario3, somaSalarios);
		
		System.out.printf("\nA media entre o 1º salario: R$%.2f ,  2º salario: R$%.2f e 3º salario R$%.2f é de R$%.2f",
				salario1, salario2, salario3, mediaUltimos3Salarios);
		
		
		
		
		
		
		teclado.close();
		
		
		
	}

}
