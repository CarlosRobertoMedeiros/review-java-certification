package generics.gimplementandocomparable;

import java.util.TreeSet;

public class ParesComLnkedHashSetTest {
	
	public static void main(String[] args) {
		
		
		
		TreeSet<Integer> nums = new TreeSet<>();
		
		nums.add(10);
		nums.add(1);
		nums.add(3);
		nums.add(6);
		nums.add(8);
		nums.add(9);
		nums.add(123);
		nums.add(-13);
		
		/**
		 * TODO: Aqui se implementa um Comparable através do TreeSet
		 *       Em questões muito genéricas não é possível a comparação
		 */
		
		for (Integer n : nums) {
			System.out.println(n);
		}
	}
}
