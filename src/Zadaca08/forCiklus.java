package Zadaca08;

import java.util.ArrayList;
import java.util.List;

public class forCiklus {

	public static void main(String[] args) {
		List <String> lista = new ArrayList<String>();
		
		   for (int i =5;i<=20;i+=5) {
			lista.add("mail" + i + "@yahoo.com");
		}
		   
		   for (int i=0;i<lista.size();i++){
			   System.out.println(lista.get(i));
		   }

	}

}
