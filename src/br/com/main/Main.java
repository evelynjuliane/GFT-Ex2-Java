package br.com.main;

import br.com.model. *;

public class Main {
	
	public static void main(String[] args) {
		
		Carro carro = new Carro("Uno", 0, 5, 80, "Fiat", 5, "2014");
		
		carro.imprime();
		
		Aviao aviao = new Aviao("BB", 0, 5, 10, "comercial", "privado");
		
		aviao.imprime();
		
	}
}
