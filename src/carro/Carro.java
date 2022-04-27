package carro;

public class Carro {
	String cor;
	int portas;
	boolean ligado;
	String sentido; // poderia ser boolean
	int velocidade;
	
	Carro(){
		this.sentido = "Para frente";
	}

	public void acelerar() {
		this.velocidade = this.velocidade + 1; // poderia ser this.velocidade++;
	}

	public void frear() {
		this.velocidade = 0;
	}

	public void engatarRe() {
		if (this.velocidade == 0) {
			this.sentido = "Para trás";
		}else {
			System.out.println("Você não pode engatar a ré!");
		}
	}
}
