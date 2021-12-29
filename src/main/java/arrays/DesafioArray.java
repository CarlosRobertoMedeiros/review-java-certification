package arrays;

import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade de notas do aluno ");
		
		int qtdeNotas = entrada.nextInt();
		
		double[] notasAluno = new double[qtdeNotas];
		
		for(int i = 0; i < notasAluno.length; i++ ) {
			System.out.println("Digite a " + ( i+1 )+ "ª nota ");
			notasAluno[i] = entrada.nextDouble();
		}
		
		double somaNotas =0; 
		for(double nota:notasAluno) {
			somaNotas+=nota;
		}
		
		double mediaDasNotas = somaNotas / (notasAluno.length);
		
		
		System.out.println("O valor da Soma das notas é de: "+somaNotas);
		System.out.println("O valor da Média das notas é de: "+mediaDasNotas);
		
		entrada.close();
		
	}

}
