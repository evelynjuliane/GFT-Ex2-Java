package br.com.model;

public class Carro extends Veiculo {
	public String marca;
	private int portas;
	private String ano;
	
	
	public Carro() {
	}



	public Carro(String modelo, int velocidade, int passageiros, int combustivel, String marca, int portas, String ano) {
		super(modelo, velocidade, passageiros, combustivel);
		this.marca = marca;
		this.portas = portas;
		this.ano = ano;
	}



	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public void imprime() {
		super.imprime();
		System.out.println("Marca: " + marca +"\nPortas:" + portas + "\nAno" + ano);
	}
}
