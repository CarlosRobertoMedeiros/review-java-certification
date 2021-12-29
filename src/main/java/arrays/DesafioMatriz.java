package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioMatriz {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a Quantidade de Aluno :");
		int qtdeAlunos = entrada.nextInt();

		System.out.println("Informe a Quantidade de Notas por Aluno :");
		int qtdeNotasPorAlunos = entrada.nextInt();
		
		double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotasPorAlunos];
		
		double total = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d", n + 1 , a + 1);
				notasDaTurma[a][n] = entrada.nextDouble();
				total += notasDaTurma[a][n];
			}
		}
		
		double mediaDaTurma = total / (qtdeAlunos * qtdeNotasPorAlunos);
		System.out.println("A Média da turma é: "+ mediaDaTurma);
		
		for(double[] notasDoAluno: notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));	
		}
		
		entrada.close();
	}
	
}
