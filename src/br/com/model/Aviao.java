package br.com.model;

public class Aviao extends Veiculo {
	
	private String tipo;
	private String uso;
	
	//CONSTRUTORES
	
	public Aviao() {
	}
	public Aviao(String tipo, String uso) {
		this.tipo = tipo;
		this.uso = uso;
	}
	
	//GETTERS AND SETTERS
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getUso() {
		return uso;
	}
	public void setUso(String uso) {
		this.uso = uso;
	}
	
	public void imprimeAviao() {
		System.out.println(tipo
				+"\n"
				+ getModelo() 
				+"\n"
				+ getPassageiros()
				+"\n"
				+ uso);
	}
	
}
