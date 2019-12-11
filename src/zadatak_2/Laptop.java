package zadatak_2;

public class Laptop extends Racunar{
		private int batteryLife;
		
		public Laptop (int RAM, int HDD, double brzinaCPU, double screenSize, double nabavnaCijena) {
			this.setRAM(RAM);
			this.setHDD(HDD);
			this.setBrzinaCPU(brzinaCPU);
			this.setScreenSize(screenSize);
			this.setNabavnaCijena(nabavnaCijena);
		}
		
		@Override
		public double izracunajCijenu(double nabavnaCijena) {
			double ten = nabavnaCijena * 0.15;
			double realPrice = nabavnaCijena + ten;
			
			return realPrice;
 }
		
		public String toString() {
			return ("Specifikacije Laptopa -> RAM" + this.getRAM() + "GB" + ".HDD: " + this.getHDD() + 
					". Brzina CPU: " + this.getBrzinaCPU() + ". Screen Size: " + 
					this.getScreenSize() + ". Cijena: " + this.izracunajCijenu(this.getNabavnaCijena()));
		}
		
		
}