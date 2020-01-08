package br.com.model;

public class Carro extends Veiculo {
	public String marca;
	private int portas;
	private String ano;
	
	
	public Carro() {
	}

	public Carro(String marca, int portas, String ano) {
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
	
	public void imprimeCarro() {
		System.out.println(marca + "\n" + getModelo() +"\n"+ getPassageiros() + "\n" + portas + "\n" + ano);
	}
}
