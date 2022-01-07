package streams.e;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class UsandoFilter {

	public static void main(String[] args) {
	
		List<Aluno> alunos = Arrays.asList(
				new Aluno("Ana",7.8),
				new Aluno("Bia",5.8),
				new Aluno("Daniel",9.8),
				new Aluno("Gui",6.8),
				new Aluno("Rebeca",7.1),
				new Aluno("Pedro",8.8)
				);
		
		for(Aluno aluno : alunos) {
			if (aluno.getNota() > 7) {
				System.out.println(aluno.getNome());
			}
		}
		
		Predicate<Aluno> alunosAprovado = a -> a.nota >= 7.0;
		Function<Aluno,String> saudacaoAprovacao = a -> "Parabéns "+ a.nome +" ! você foi aprovado(a)!";
		Consumer<String> imprimir = System.out::println;
		
		alunos.stream()
			.filter(alunosAprovado)
			.map(saudacaoAprovacao)
			.forEach(imprimir);
			
		
		
		
		
	}
	
}
