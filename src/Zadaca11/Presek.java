package Zadaca11;

import java.util.ArrayList;
import java.util.List;

public class Presek {

	public static void main(String[] args) {
		List<String> lista1 =  new ArrayList<String>();
        lista1.add("I");
        lista1.add("M");
        lista1.add("N");
        lista1.add("K");
        lista1.add("I");
        List<String> lista2 = new ArrayList<String>();
        lista2.add("N");
        lista2.add("K");
        lista2.add("I");
        lista2.add("I");
        lista1.add("L");
        lista1.retainAll(lista2);

        System.out.println(lista1);

	}

}
