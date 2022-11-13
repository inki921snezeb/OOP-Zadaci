package Zadaca02;

public class Main {

	public static void main(String[] args) {
		
		Fakultet f1 = new Fakultet ();
		f1.nazivNaFakultet = "Fikt";
		f1.brojNaSmerovi = 5;
		f1.brojNaStudenti = 260;
		f1.dekan = "Pece Mitrevski";
		f1.sediste = "Bitola";
		
		f1.prvMetod ();
		System.out.println("Namalen broj na studenti: " + f1.vtorMetod(50));
		f1.tretMetod();
		
		Fakultet f2 = new Fakultet();
		f2.nazivNaFakultet = "Pedagoski fakultet";
		f2.brojNaSmerovi = 4;
		f2.brojNaStudenti = 230;
		f2.dekan = "Dance Sivakova-Neskovski";
		f2.sediste = "Bitola";
		
		f2.prvMetod ();
		System.out.println("Namalen broj na studenti: " + f2.vtorMetod(50));
		f2.tretMetod();

	}

}
