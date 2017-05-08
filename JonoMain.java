import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class JonoMain {
	
	static Random r = new Random();
	static private int tapahtuma;
	static KassaJono jono1 = new KassaJono();
	static int count1 = 1;
	
	public static void main(String[] args){
		int kerta = r.nextInt(100);
		boolean muuttuja = true;
		System.out.printf("Ohjelma toistaa itseaan %d kertaa\n", kerta);
		for(int k = 0; k <= kerta; k++){
			tapahtuma = r.nextInt(2);
			if(tapahtuma == 0){
				System.out.println("Lisataan uusi asiakas jonoon!");
				Asiakas asiakas = new Asiakas();
				int numero= ThreadLocalRandom.current().nextInt(1000000, 9999999 + 1);
				asiakas.set_asiakasnumero(numero);
				int tapa = r.nextInt(2); //fiksumpaa valita maksutapa tassa kuin myohemmin
				if(tapa == 0){
					int summa = r.nextInt(1000);
					KateisMaksu kate = new KateisMaksu();
					asiakas.set_maksu(summa);
					try{
						jono1.lisaaElementti(asiakas);
						count1++;
					}
					catch(ArrayIndexOutOfBoundsException exception){
						System.out.println("Jono on taynna lajennetaan sita!");
						jono1.laajenna();
						jono1.lisaaElementti(asiakas);
					}
				}
				else if(tapa == 1){
					LuottokorttiMaksu kortti = new LuottokorttiMaksu();
					double summa = ThreadLocalRandom.current().nextDouble(0.1, 1500);
					asiakas.set_maksu(summa);
					int kort = ThreadLocalRandom.current().nextInt(100000000, 999999999 + 1);
					asiakas.set_kortti(kort);
					try{		//metodi voisi siisteyttaa
						jono1.lisaaElementti(asiakas);
						count1++;
					}
					catch(ArrayIndexOutOfBoundsException exception){
						System.out.println("Jono on taynna lajennetaan sita!");
						jono1.laajenna();
						jono1.lisaaElementti(asiakas);
					}
				}
			}
			else if (tapahtuma == 1 && count1 > 1){
				System.out.println("Asiakas maksaa ja poistuu jonosta");
				try{
					Asiakas asiakas1 = jono1.palautaElementit();
					asiakas1.print1();
					jono1.odota();
					count1--;
				}
				catch(NullPointerException e){
					System.out.println("Jono on tyhja!");
				}
			}
		}
	}
	static void print(Asiakas asi){
		asi.print1();
	}
}