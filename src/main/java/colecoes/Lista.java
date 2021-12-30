package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	
	public static void main(String[] args) {

		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Carlos"));
		usuarios.add(new Usuario("Lia"));
		usuarios.add(new Usuario("Bia"));
		usuarios.add(new Usuario("Manu"));
		
		for(Usuario usuario : usuarios) {
			System.out.println(usuario);
		}
		
		usuarios.forEach(System.out::println);
		
		System.out.println(usuarios.get(3).nome);
		System.out.println(">>>>" + usuarios.remove(1)); //Remove por Índice
		System.out.println(usuarios.remove(new Usuario("Manu"))); //Remove por Objeto
		System.out.println("Tem? " + usuarios.contains(new Usuario("Manu")) );
		
	}

}
