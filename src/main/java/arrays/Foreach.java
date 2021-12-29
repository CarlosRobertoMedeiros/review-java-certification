package arrays;

public class Foreach {
	
	public static void main(String[] args) {
		
		//Primeira maneira de associar os tipos
//		double[] notasX = new double[4];
//		notasX[0] = 10;
//		notasX[1] = 9;
//		notasX[2] = 8;
//		notasX[3] = 7;

		double[] notas = {9.9, 8.7, 7.2 ,9.4};
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i]+ " ");
		}
		
		//Usando foreach
		System.out.println();
		for(double nota: notas) {
			System.out.print(nota+ " ");
		}
		
		
	}

}

