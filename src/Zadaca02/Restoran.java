package Zadaca02;

public class Restoran {
	private String ime,lokacija,telefon;
	 private  int brSedista;
	 
	 public void setIme(String ime) {
		 this.ime=ime;
	 }
	 
	 public void setLokacija(String lokacija) {
		 this.lokacija=lokacija;
	 }
	 
	 public void setTelefon(String telefon) {
		 this.telefon=telefon;
	 }
	 
	 public void setBrSedista(int brSedista) {
		 this.brSedista=brSedista;
	 }
	 
	 
	 
	 public String getIme () {
			return this.ime;
		}
		public String getLokacija () {
			return this.lokacija;
		}
		public String getTelefon () {
			return this.telefon;
		}
		public int getBrSedista () {
			return this.brSedista;
		}
	 
	 
}
