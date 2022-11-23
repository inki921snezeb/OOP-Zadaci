package Zadaca04;

public class Avtomobil {
	private String marka,model,boja;
	 private int km;
	 
	 public Avtomobil (String marka, String model, String boja, int km) {
		 this.marka=marka;
		 this.model=model;
		 this.boja=boja;
		 this.km=km;
	 }
	 
	 public void PomnoziKm(int pomnoziKm) {
		this.km = km * pomnoziKm;
		
	 }
	 
	 public String getMarka () {
			return this.marka;
		}
		public String getModel () {
			return this.model;
		}
		public String getBoja () {
			return this.boja;
		}
		public int getKm () {
			return this.km;
		}
}
