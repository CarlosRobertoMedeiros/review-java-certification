package streams.a;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");

		System.out.println("\nUsando o For tradicional ...");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}

		System.out.println("\nUsando o Foreach ...");
		for (String aprovado : aprovados) {
			System.out.println(aprovado);
		}

		System.out.println("\nUsando o Iterator ...");
		Iterator<String> iterator = aprovados.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("\nUsando Stream ...");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println); // M�todo reference La�o Interno

	}

}
