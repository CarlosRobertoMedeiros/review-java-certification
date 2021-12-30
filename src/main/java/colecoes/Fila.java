package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> Adicionam elementos na fila
		// Diferen�a � o comportamento pois ocorre quando a fila est� cheia
		//No caso do add ele retona false e no caso do offer ele retorna uma exce��o
		fila.add("Ana");
		fila.offer("Bia"); 
		fila.add("Carlos");
		fila.offer("Daniel"); 
		fila.add("Rafael");
		fila.offer("Gui");
		
		//Peek e Element -> Obter o pr�ximo elemento da fila sem remover
		// Diferen�a � o comportamento pois ocorre quando a fila est� vazia
		System.out.println(fila.peek()); //Retorna null em caso de fila vazia
		System.out.println(fila.element()); //Lan�a uma exce��o se a fila estiver vazia
		
		//Pool e Remove -> Obt�m o pr�ximo elemento da fila e remove
		// Diferen�a � o comportamento pois ocorre quando a fila est� vazia
		System.out.println(fila.poll()); //retorna null
		System.out.println(fila.remove()); // lan�a exce��o
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains(...);
		
		
	}

}

