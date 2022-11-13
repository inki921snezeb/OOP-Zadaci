package Zadaca01;

public class Main {

	public static void main(String[] args) {
		
		Avtomobil av = new Avtomobil ("Audi", "A3", "crna",186.252 ,2022, "BT-5522-AC");
		
		av.prvMetod();
		System.out.println( av.vtorMetod() );

	}

}
