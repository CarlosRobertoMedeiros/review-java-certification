package lambda;

import java.util.function.BinaryOperator;

public class CalculoTest3 {
	
	public static void main(String[] args) {
		
		// Não Converte int -> Double
		//Double a = 1;
		// double -> Double
		
		BinaryOperator<Double> calculo = (x , y) ->{return x + y; };
		System.out.println(calculo.apply(2.0, 3.0));
		
		calculo = (x , y) -> x + y;
		System.out.println(calculo.apply(2.0, 3.0));
		
		
	}

}
