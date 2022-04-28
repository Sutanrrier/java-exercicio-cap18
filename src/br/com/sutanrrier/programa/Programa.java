package br.com.sutanrrier.programa;

public class Programa implements Runnable {
	private int id;

	public Programa(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println("Programa " + id + " valor: " + i);
		}

	}
}
