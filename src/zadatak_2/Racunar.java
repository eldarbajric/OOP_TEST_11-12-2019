package zadatak_2;

public class Racunar {
	
	private int RAM;
	private int HDD;
	private double brzinaCPU;
	private double screenSize;
	private double nabavnaCijena;
	
	public Racunar () {
		
	}
	
	public Racunar (int RAM, int HDD, double brzinaCPU, double screenSize, double nabavnaCijena) {
		this.RAM = RAM;
		this.HDD = HDD;
		this.brzinaCPU = brzinaCPU;
		this.screenSize = screenSize;
		this.nabavnaCijena = nabavnaCijena;
	}
	
	public int getRAM () {
		return this.RAM;
	}
	
	public void setRAM(int RAM) {
		this.RAM = RAM;
	}
	
	public int getHDD () {
		return this.HDD;
	}
	
	public void setHDD(int HDD) {
		this.HDD = HDD;
	}
	
	public double getBrzinaCPU () {
		return this.brzinaCPU;
	}
	
	public void setBrzinaCPU(double brzinaCPU) {
		this.brzinaCPU = brzinaCPU;
	}
	
	public double getScreenSize() {
		return this.screenSize;
	}
	
	public void setScreenSize(double screen) {
		this.screenSize = screen;
	}
	
	public double getNabavnaCijena () {
		return this.nabavnaCijena;
	}
	
	public void setNabavnaCijena(double cijena) {
		this.nabavnaCijena = cijena;
	}
	
	public double getCijena() {
		return this.nabavnaCijena;
	}
	
	public double izracunajCijenu(double nabavnaCijena) {
		double ten = nabavnaCijena * 0.10;
		double realPrice = nabavnaCijena + ten;
		
		return realPrice;
		
		
	}
	
	public String toString() {
		return ("Specifikacije racunara -> RAM: " + this.getRAM() + "GB" + ".HDD: " + this.getHDD() + 
				". Brzina CPU: " + this.getBrzinaCPU() + ". Screen Size: " + 
				this.getScreenSize() + ". Cijena: " + this.izracunajCijenu(this.getNabavnaCijena()));
	}
	
	
	
	
	
	
}
