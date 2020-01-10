package br.com.model;

public class Aviao extends Veiculo {
	
	private String tipo;
	private String uso;
	
	//CONSTRUTORES
	
	public Aviao() {
	}
	public Aviao(String modelo, int velocidade, int passageiros, int combustivel, String tipo, String uso) {
		super(modelo, velocidade, passageiros, combustivel);
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
	
	public void imprime() {
		super.imprime();
		System.out.println("Tipo: " + tipo +"\nUso:" + uso);
	}
	
}
