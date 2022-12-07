package Zadaca10;

import java.util.ArrayList;
import java.util.List;

public class Unija {

	public static void main(String[] args) {
		List<String> lista1= new ArrayList<String> ();
        lista1.add("I");
        lista1.add("N");
        lista1.add("K");
        lista1.add("I");
        
        List<String> lista2 = new ArrayList<String> ();
        lista2.add("9");
        lista2.add("2");
        lista2.add("1");
        
        lista1.addAll(lista2);
        
        System.out.println(lista1);
	}

}
