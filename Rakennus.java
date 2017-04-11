import java.util.ArrayList;

public class Rakennus {
	
	private double ala_r;
	private int huoneet;
	private ArrayList<Asukkaat> asukkaat = new ArrayList<>();
	
	public void set_ala(double ala_r){
		this.ala_r = ala_r;
	}
	public void set_huoneet(int huoneet){
		this.huoneet = huoneet;
	}
	public void set_asukkaat(ArrayList<Asukkaat> asukkaat){
		this.asukkaat = asukkaat;
	}
	public double get_alar(){
		return ala_r;
	}
	public int get_huoneet(){
		return huoneet;
	}
	public ArrayList get_asukkaat(){
		return this.asukkaat;
	}
}
