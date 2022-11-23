package Zadaca02;

public class Main {

	public static void main(String[] args) {
		
Restoran r= new Restoran();
		
		r.setIme("Aurum");
		r.setLokacija("Todor Skalovski 8");
		r.setTelefon("078556742");
		r.setBrSedista(120);
		
		System.out.println(r.getIme());
		System.out.println(r.getLokacija());
		System.out.println(r.getTelefon());
		System.out.println(r.getBrSedista());

	}

}
