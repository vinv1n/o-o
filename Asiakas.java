import java.util.ArrayList;

public class Asiakas {
	
	protected int asiakasnumero;
	protected double maksu;
	private String tyyppi;
	protected int luottokortti;
	
	public void set_asiakasnumero(int asiakasnumero){
		this.asiakasnumero = asiakasnumero;
	}
	public int get_asiakasnumero(){
		return this.asiakasnumero;
	}
	public void set_maksu(double maksu){
		this.maksu = maksu;
	}
	public double get_maksu(){
		return maksu;
	}
	public void set_kortti(int luottokortti){
		this.luottokortti = luottokortti;
	}
	public void print1(){
		if(luottokortti != 0){
			System.out.printf("Asiakasnumero: %d\nMaksutyyppi: Luottokortti\nLuottokortinnumero: %d\nSumma: %f$\n", this.asiakasnumero, this.luottokortti, this.maksu);
		}
		else if(luottokortti == 0){
			System.out.printf("Asiakasnumero: %d\nMaksutyyppi: Kateinen\nSumma: %f$\n", this.asiakasnumero, this.maksu);
		}
	}
}