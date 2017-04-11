import java.util.Arrays;

public class Tontti {
	
	private double ala;
	private String sijainti;
	private String nimi;
	private int rakennus_count = 1;
	private Rakennus rakennus = new Rakennus();

	public void set_name(String nimi){
		this.nimi = nimi;
	}
	
	public void set_sijainti(String sijainti){
		this.sijainti = sijainti;
	}
	
	public void set_ala(double ala){
		this.ala = ala;
	}
	public void set_rakennus(Rakennus rakennus){
		this.rakennus = rakennus;
	}
	public double get_ala(){
		return ala;
	}
	public String get_nimi(){
		return nimi;
	}
	public String get_sijainti(){
		return sijainti;
	}
	public Rakennus get_rakennus(){
		return this.rakennus;
	}
	public void print_rakennus(){
		System.out.println(rakennus);
	}
}
