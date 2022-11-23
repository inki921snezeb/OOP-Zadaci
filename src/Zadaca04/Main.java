package Zadaca04;

public class Main {

	public static void main(String[] args) {
		
		Avtomobil a=new Avtomobil("Audi","A3","crna",18000);

		a.PomnoziKm(5);
		System.out.println(a.getMarka());
		System.out.println(a.getModel());
		System.out.println(a.getBoja());
		System.out.println(a.getKm());
	}

	}


