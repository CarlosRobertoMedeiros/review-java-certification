package swing.observer;

import java.time.LocalDateTime;

public class ChegadaAniversarianteEvent {
	
	private final LocalDateTime horaDaChegada;
	
	public ChegadaAniversarianteEvent(LocalDateTime horaDaChegada) {
		this.horaDaChegada = horaDaChegada;
	}
	
	
	public LocalDateTime getHoraDaChegada() {
		return horaDaChegada;
	}

}
