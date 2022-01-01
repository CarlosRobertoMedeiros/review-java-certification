package oo.composicao;

public class Item {
	
	String nome;
	Integer quantidade;
	double preco;
	
	Compra compra;
	
	Item(String nome, Integer quantidade, Double preco){
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
}
