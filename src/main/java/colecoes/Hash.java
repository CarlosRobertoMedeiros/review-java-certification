package colecoes;

import java.util.HashSet;
import java.util.Set;

public class Hash {
	
	public static void main(String[] args) {
		
		//Se na classe Usuario n�o estiver implementado  o hashcode vamos ter problemas
		// devido a utiliza��o do HashSet
		Set<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Guilherme"));
		
		boolean resultado = usuarios.contains(new Usuario("Guilherme"));
		System.out.println(resultado);
		
	}

}
