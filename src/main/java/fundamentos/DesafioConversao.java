package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o 1� Sal�rio: ");
		String primeiroSalario = teclado.next().replace(",", ".");

		System.out.println("Digite o 2� Sal�rio: ");
		String segundoSalario = teclado.next().replace(",", ".");;

		System.out.println("Digite o 3� Sal�rio: ");
		String terceiroSalario = teclado.next().replace(",", ".");
		
		
		double salario1 = Double.parseDouble(primeiroSalario);
		double salario2 = Double.parseDouble(segundoSalario);
		double salario3 = Double.parseDouble(terceiroSalario);
		
		double somaSalarios =  salario1+salario2+salario3;
		double mediaUltimos3Salarios = somaSalarios / 3;
		
		System.out.printf("A soma do 1� salario: R$%.2f com o 2� salario: R$%.2f com o 3� salario R$%.2f � de R$%.2f",
				salario1, salario2, salario3, somaSalarios);
		
		System.out.printf("\nA media entre o 1� salario: R$%.2f ,  2� salario: R$%.2f e 3� salario R$%.2f � de R$%.2f",
				salario1, salario2, salario3, mediaUltimos3Salarios);
		
		
		
		
		
		
		teclado.close();
		
		
		
	}

}
