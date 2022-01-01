package oo.heranca.desafio;

public class Carro {
	
	Integer velocidadeAtual = 0;
	
	public void acelerar() {
		velocidadeAtual += 5;
	}
	
	public void frear() {
		if (velocidadeAtual >=5) {
			velocidadeAtual -= 5;
		}else {
			velocidadeAtual =0;
		}
	}
	
	public Integer getVelocidadeAtual() {
		return velocidadeAtual;
	}

	@Override
	public String toString() {
		return "Velocidade atual é de: " + velocidadeAtual + " Km/h";
	}
	
	

}
