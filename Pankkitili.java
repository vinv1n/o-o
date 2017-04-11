public class Pankkitili {
	
	private String nimi;
	private String tilinumero;
	private double saldo;
	
	public String get_name() {
		return nimi;
	}
	public String get_numero() {
		return tilinumero;
	}
	public double get_saldo() {
		return saldo;
	}
	public void set_name(String nimi){
		this.nimi = nimi;
	}
	public void set_tili(String tilinumero){
		this.tilinumero = tilinumero;
	}
	public void set_saldo(double saldo){
		this.saldo = saldo;
	}
	public void print() {
		System.out.printf("%s, %s, %f\n", nimi, tilinumero, saldo);
		System.out.printf("");
	}
}
