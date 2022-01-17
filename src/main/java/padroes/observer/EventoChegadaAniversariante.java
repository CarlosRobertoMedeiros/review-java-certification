package padroes.observer;

import java.util.Date;

/*
 * Exemplo KeyEvent e MouseEvent
 * */

public class EventoChegadaAniversariante {
	
	private final Date momento;
	
	public EventoChegadaAniversariante(Date momento) {
		this.momento = momento;
	}
	
	public Date getMomento() {
		return momento;
	}

}
