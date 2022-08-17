package Revisao;

public class Carro {
	String modelo, cor, fabricante, ano;
	int velocidade = 5;

	public int Acelera(int i) {
		return velocidade = velocidade + i;
	}

	public int Freia(int i) {
		return velocidade = velocidade - i;
	}
}
