package swing.observer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Porteiro extends Thread{
	
	private List<ChegadaAniversarianteObserver> observers = new ArrayList<>();
	
	public void addChegadaAniversarianteObserver(ChegadaAniversarianteObserver observer) {
		this.observers.add(observer);
	}
	
	@Override
	public void run() {
		Scanner entrada = new Scanner(System.in);
		
		try {
			while(true) {
				int valor = entrada.nextInt();
				
				if (valor ==1) {
					ChegadaAniversarianteEvent event = new ChegadaAniversarianteEvent(LocalDateTime.now());
					
					//Notifica os Observers
					for(ChegadaAniversarianteObserver observer : this.observers) {
						observer.chegou(event);
					}
					
				}else {
					System.out.println("Alarme Falso");
				}
			}
		}finally {
			entrada.close();
		}	
		
	}

}
