package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
		//Set<String> listaAprovados = new HashSet<>(); //Não Garante a ordem de Inserção no SET
		SortedSet<String> listaAprovados = new TreeSet<>(); //Garante a ordem de Inserção no SET
		
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Lucas");
		listaAprovados.add("Pedro");
		
		for (String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> numerosInteiros = new HashSet<>();
		numerosInteiros.add(1);
		numerosInteiros.add(2);
		numerosInteiros.add(120);
		numerosInteiros.add(6);
		
		for(int numero:numerosInteiros) {
			System.out.println(numero); 
		}
		
		numerosInteiros.forEach(System.out::println);
		
	}

}
