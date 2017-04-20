public class RegularSubscription extends Subscription{
	
	private int tilauksen_kesto;
	
	public void set_lehti(String lehti){
		super.lehti = lehti;
	}
	public void set_tilaaja(String tilaaja){
		super.tilaaja = tilaaja;
	}
	public void set_osoite(String osoite){
		super.osoite = osoite;
	}
	public void set_kuukausihinta(double kuukausihinta){
		this.kuukausihinta = kuukausihinta;
	}
	public void set_kesto(int tilauksen_kesto){
		this.tilauksen_kesto = tilauksen_kesto;
	}
	public String get_lehti(){
		return super.lehti;
	}
	public String get_tilaaja(){
		return super.tilaaja;
	}
	public String get_osoite(){
		return super.osoite;
	}
	public double get_hinta(){
		return super.kuukausihinta;
	}
	public int get_kesto(){
		return this.tilauksen_kesto;
	}
	public void printInvoice(){
		System.out.println("---------------------------------");
		System.out.printf("Lehti:%s\nTilaaja:%s\nKuukausihinta:%f\nKesto:%dkk\n", super.lehti, super.tilaaja, super.kuukausihinta, this.tilauksen_kesto);
		System.out.println("---------------------------------");
	}
}
