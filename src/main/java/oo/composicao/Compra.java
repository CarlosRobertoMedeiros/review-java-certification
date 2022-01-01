package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	String cliente;
	List<Item> itens = new ArrayList<>();
	
	void adicionarItem(String nome, Integer quantidade, Double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
	}
	
	void adicionarItem(Item item) {
		this.itens.add(item);
		item.compra = this;
	}
	
	

	Double obterValorTotal() {
		Double total = 0.0;

		for (Item item : itens) {
			total += item.quantidade * item.preco;
		}
		return total;
	}

}
