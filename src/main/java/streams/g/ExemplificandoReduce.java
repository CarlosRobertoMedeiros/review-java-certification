package streams.g;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ExemplificandoReduce {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		
		Integer total =  nums.stream().reduce(soma).get();
		System.out.println(total);
		
		Integer totalIniciandoCom100 = nums.stream().reduce(100, soma);
		System.out.println(totalIniciandoCom100);

		nums.stream()
			.filter(n -> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println);
		
	}

}
