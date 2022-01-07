package streams.f;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	
	public static void main(String[] args) {
		
		List<Produto> produtos = Arrays.asList(
					new Produto("Lapis", 1.99, 0.35, 0),
					new Produto("Notebook", 4899.89, 0.32, 0),
					new Produto("Caderno", 30, 0.45, 0),
					new Produto("Impressora", 1200.00, 0.40, 0),
					new Produto("IPad", 3100.00, 0.29, 0),
					new Produto("Relogio", 1900.00, 0.12, 0),
					new Produto("Monitor", 800.00, 0.31, 0)
				);
		
		Predicate<Produto> superPromocao = p -> p.getPercentualDesconto() >=0.30;
		Predicate<Produto> freteGratis = p -> p.getValorFrete() == 0;
		Predicate<Produto> precoRelevante = p -> p.getPreco() >= 500.00;
		Function<Produto, String> chamadaPromocional =
				p -> "Aproveite "+ p.getNome() + " por R$" + p.getPreco();
		
		produtos.stream()
			.filter(superPromocao)
			.filter(freteGratis)
			.filter(precoRelevante)
			.map(chamadaPromocional)
			.forEach(System.out::println);

	}
	

}
