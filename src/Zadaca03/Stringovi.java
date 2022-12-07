package Zadaca03;

import java.util.ArrayList;
import java.util.List;

public class Stringovi {

	public static void main(String[] args) {
		List <String> lista = new ArrayList<> ();
		
		lista.add("INKI");
		lista.add("IKT");
		lista.add("INKI.1");
		System.out.println("Smerovi vo FIKT: " + lista);
		
		lista.add(3,"INKI.2");
		
		System.out.println("Dodaden smer vo FIKT: " + lista );

	}

}
