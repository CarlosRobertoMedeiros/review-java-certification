package oo.composicao.desafio;

public class Sistema {

	public static void main(String[] args) {

		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 1.0, 100);
		compra1.adicionarItem(new Produto("Notebook", 2000.00), 2);

		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10.0, 10);
		compra2.adicionarItem(new Produto("Impressora", 1000.00), 1);

		Cliente cliente = new Cliente("Maria Julia Moraes");
		cliente.adicionarCompra(compra1);
		cliente.adicionarCompra(compra2);

		Compra compra3 = new Compra();
		compra3.adicionarItem("Caneta", 1.0, 10);
		compra3.adicionarItem(new Produto("Notebook", 3000.00), 2);
		
		/*********************************************************/
		// CLIENTE 2
		/*********************************************************/
		
		Cliente cliente2 = new Cliente("Antonio Nunes");
		cliente2.adicionarCompra(compra3);
		
		System.out.println(cliente.obterValorTotal());
		System.out.println(cliente2.obterValorTotal());	
	}
}
