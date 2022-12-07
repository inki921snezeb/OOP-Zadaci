package Zadaca09;

public class Fakultet {

	private String imeFax;
	private int brSmerovi,vkStudenti;
	
	public Fakultet (String imeFax,int brSmerovi,int vkStudenti) {
		this.imeFax = imeFax;
		this.brSmerovi = brSmerovi;
		this.vkStudenti = vkStudenti;
	}
	
	public String getimeFax () {
		     return imeFax;
	}
	
	public int getbrSmerovi () {
		     return brSmerovi;
	}
	
	public int getvkStudenti () {
		     return vkStudenti;
	}
	
	public void setimeFax (String imeFax){
		     this.imeFax = imeFax;
	}
	
	public void setbrSmerovi (int brSmerovi) {
		     this.brSmerovi = brSmerovi;
	}
	
	public void setvkStudenti (int vkStudenti) {
		      this.vkStudenti = vkStudenti;
	}
	
}
