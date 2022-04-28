package br.com.sutanrrier.main;

import br.com.sutanrrier.programa.Programa;

public class Teste {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new Programa(1));
		thread1.start();
		
		Thread thread2 = new Thread(new Programa(2));
		thread2.start();
	}

}
