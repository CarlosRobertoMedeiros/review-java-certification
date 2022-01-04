package oo.heranca.desafio;

public class Carro {

	public final Integer VELOCIDADE_MAXIMA;
	protected Integer velocidadeAtual = 0;
	private Integer delta = 5;

	protected Carro(Integer velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void acelerar() {
		if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += getDelta();
		}
	}

	public void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}

	public Integer getVelocidadeAtual() {
		return velocidadeAtual;
	}

	@Override
	public String toString() {
		return "Velocidade atual é de: " + velocidadeAtual + " Km/h";
	}

	public Integer getDelta() {
		return delta;
	}

	public void setDelta(Integer delta) {
		this.delta = delta;
	}

}
