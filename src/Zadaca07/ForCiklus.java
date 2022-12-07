package Zadaca07;

import java.util.ArrayList;
import java.util.List;

public class ForCiklus {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String> ();
        
		   for (int i=0;i<9;i++) {
			   lista.add("mail" + "0" + (i+1) + "@yahoo.com" );
		   }
		   
		   for (int i=9;i<20;i++) {
			   lista.add("mail" + (i+1) + "@yahoo.com");
		   }
		   
		   for (int i=0;i<20;i++) {
			   System.out.println(lista.get(i));
		   }
	}

}
