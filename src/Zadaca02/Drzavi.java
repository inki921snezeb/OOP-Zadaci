package Zadaca02;

import java.util.ArrayList;
import java.util.List;

public class Drzavi {

	public static void main(String[] args) {
		List <String> lista = new ArrayList<> ();
		
		lista.add("Makedonija");
		lista.add("Hrvatska");
		lista.add("Tunis");
		
		System.out.println("Listata ima : " + lista.size() + " elementi.");

		lista.add("Austrija");
		lista.add("Egipet");
		
		System.out.println("Elementi na listata  se: " + lista + ".");
	}

}
