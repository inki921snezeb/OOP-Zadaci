package Zadaca03;

public class PC {

	public int memorija;
	public String tipNaMemorija;
	public int SSD;
	public String golemina="GB";

	public PC () {
		this.memorija = 2;
		this.tipNaMemorija = "DDR4";
		this.SSD= 256;
	}

	public void prvMetod(int zgolemiMemorija,int novSSD){
		System.out.println("Memorijata beshe " + this.memorija + golemina + ", sega iznesuva " + (zgolemiMemorija + memorija) + golemina + ".");
		System.out.println("Tipot na memorijata e " + this.tipNaMemorija + ".");
		System.out.println("SSD ima golemina od " + novSSD + golemina + ". Prethodno iznesuvashe " + this.SSD + golemina + ".");
		
	}
	
}
