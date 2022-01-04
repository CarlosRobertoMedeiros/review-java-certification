package lambda;

import java.util.function.UnaryOperator;



public class OperadorUnario {
	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int resultado1 = maisDois
					.andThen(vezesDois)  //12*2 = 24  
					.andThen(aoQuadrado) // 24 * 24 = 576
					.apply(10); //12
				
		System.out.println(resultado1);
		
		//compose é usado para ordem inversa
		int resultado2 = aoQuadrado // 24 * 24 = 576
				.compose(vezesDois) // 12 * 2 = 24
				.compose(maisDois) // 10 + 2 = 12
				.apply(10); // 
		System.out.println(resultado2);
		
		
	}

}
