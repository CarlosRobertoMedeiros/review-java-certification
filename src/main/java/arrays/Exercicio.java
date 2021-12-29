package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]); //Primeira nota do aluno
		System.out.println(notasAlunoA[notasAlunoA.length -1]); //Ultima nota do aluno
//		System.out.println(notasAlunoA[5]); //ArrayIndexOutOfBoundException
		
		double totalAlunoA=0;
		for(int i=0; i< notasAlunoA.length; i++) {
			System.out.println(notasAlunoA[i]);
			totalAlunoA+=notasAlunoA[i];
		}
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		//Inicializando diretamente as notas com dados literais
		double[] notasAlunoB = {6.9, 8.9, 5.5, 10};
		
		double totalAlunoB=0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i]; 
		}
		System.out.println(totalAlunoB / notasAlunoB.length);
		
		
		
		
	}
	

}
