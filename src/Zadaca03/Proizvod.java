package Zadaca03;

public class Proizvod {
	private String ime,proizvoditel;
	private int cena,tezina;
	
	public Proizvod () {
		this.ime="Eurokrem";
		this.proizvoditel="Evropa";
		this.cena=135;
		this.tezina=500;
	}
	
	public String getIme() {
		return this.ime;
	}
	
	public String getProizvoditel() {
		return this.proizvoditel;
	}
	
	public int getCena() {
		return this.cena;
	}
	
	public int getTezina() {
		return this.tezina;
	}

}
