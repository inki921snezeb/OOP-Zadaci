package Zadaca09;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<Fakultet> lista = new ArrayList <Fakultet> ();
		
		Fakultet f = new Fakultet ("Fikt",2,850);
		
		  lista.add(f);
		  lista.add(new Fakultet("TFB",6,780));
		  lista.add(new Fakultet("PMF",4,650));
		  lista.add(new Fakultet("FINKI",3,584));
		  lista.add(new Fakultet("UGD",5,920));
		  
		  for (int i=0;i<lista.size();i++){
			  System.out.println(lista.get(i).getimeFax());
			  System.out.println(lista.get(i).getbrSmerovi());
			  System.out.println(lista.get(i).getvkStudenti());
		  }

	}

}
