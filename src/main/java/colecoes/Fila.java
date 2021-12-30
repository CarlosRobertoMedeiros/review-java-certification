package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> Adicionam elementos na fila
		// Diferença é o comportamento pois ocorre quando a fila está cheia
		//No caso do add ele retona false e no caso do offer ele retorna uma exceção
		fila.add("Ana");
		fila.offer("Bia"); 
		fila.add("Carlos");
		fila.offer("Daniel"); 
		fila.add("Rafael");
		fila.offer("Gui");
		
		//Peek e Element -> Obter o próximo elemento da fila sem remover
		// Diferença é o comportamento pois ocorre quando a fila está vazia
		System.out.println(fila.peek()); //Retorna null em caso de fila vazia
		System.out.println(fila.element()); //Lança uma exceção se a fila estiver vazia
		
		//Pool e Remove -> Obtém o próximo elemento da fila e remove
		// Diferença é o comportamento pois ocorre quando a fila está vazia
		System.out.println(fila.poll()); //retorna null
		System.out.println(fila.remove()); // lança exceção
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains(...);
		
		
	}

}

