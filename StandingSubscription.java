public class StandingSubscription extends Subscription{
		
	private int alennus;
	private double alennettu_hinta;
	
	public void set_lehden_nimi(String lehden_nimi){
		super.lehti = lehden_nimi;
	}
	public void set_tilaajan_nimi(String tilaajan_nimi){
		super.tilaaja = tilaajan_nimi;
	}
	public void set_toimitusosoite(String toimitusosoite){
		super.osoite = toimitusosoite;
	}
	public void set_kuukausihinta(double kuukausihinta){
		super.kuukausihinta = kuukausihinta;
	}
	public void set_alennus(int alennus){
		this.alennus = alennus;
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
	public int get_alennus(){
		return this.alennus;
	}
	public void printInvoice(){
		System.out.println("---------------------------------");
		System.out.printf("Lehti:%s\nTilaaja:%s\nKuukausihinta:%f$\nAlennus:%d%%\n", super.lehti, super.tilaaja, super.kuukausihinta, this.alennus);
		System.out.println("---------------------------------");
	}
}
