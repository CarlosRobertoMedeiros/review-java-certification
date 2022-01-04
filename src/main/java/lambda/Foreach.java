package lambda;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana","Bia","Lia", "Gui");
		
		System.out.println("\nForma Tradicional");
		//Convencional
		for(String nomeDoAprovado: aprovados) {
			System.out.println(nomeDoAprovado);
		}
		
		System.out.println("\nLambda #01");
		//Com forEach
		aprovados.forEach(nome -> System.out.println(nome));
		
		System.out.println("\nMetodo Reference");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda #02");
		//Com forEach
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\nMetodo Reference 2");
		aprovados.forEach(Foreach::meuImprimir);
		
		
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome � "+nome);
	}

}
