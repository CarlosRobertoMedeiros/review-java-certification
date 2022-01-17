package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/*
 * É o subject
 * */
public class Porteiro {
	
	private List<ObservadorChegadaAniversariante> observadores = new ArrayList<>();
	
	public void registrarObservador(ObservadorChegadaAniversariante observador) {
		observadores.add(observador);
	}
	
	public void monitorar() {
		Scanner entrada = new Scanner(System.in);
		String valor = "";
		
		while(!"sair".equalsIgnoreCase(valor)) {
			System.out.println("Aniversariante chegou? ");
			valor = entrada.nextLine();
			
			if ("sim".equalsIgnoreCase(valor)) {
				//Cria o evento
				EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());
				
				//Notificar os Observadores
				observadores.stream().forEach(o -> o.chegou(evento));
				valor = "sair";
			}else {
				System.out.println("Alarme Falso");
			}
			
		}
		
		entrada.close();
				
		
	}

}