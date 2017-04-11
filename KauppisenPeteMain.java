import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;


class KauppisenPeteMain {
	
	static Scanner reader = new Scanner(System.in);
	static Rakennus talo = new Rakennus();
	static Tontti tontti = new Tontti();
	static ArrayList<Asukkaat> asukkaat = new ArrayList<>();

	
	public static void main(String[] args){
		
		while(true){
			if(tontti.get_ala() == 0) {
				System.out.printf("Tontti tarvitsee seuraavat tiedot nimi, sijainti, pinta-ala\n");
				System.out.printf("Syota tontin nimi: ");
				String nimi = reader.nextLine();
				tontti.set_name(nimi);
				System.out.printf("Syota sijainti koordinaatteina:");
				String sijainti = reader.nextLine();
				try{
					System.out.printf("Syota pinta-ala:");
					double pinta_ala = reader.nextDouble();
					tontti.set_ala(pinta_ala);
				}
				catch(Exception exception){
					System.out.println("Luvun tulee olla liukuluku!");
					String syy = reader.nextLine();
				}
				tontti.set_name(nimi);
				tontti.set_sijainti(sijainti);
				System.out.printf("Luodun tontin tiedot: nimi:%s, sijainti: %s, ala: %f, rakennus: ", tontti.get_nimi(), tontti.get_sijainti(), tontti.get_ala());
				tontti.print_rakennus();
			}
			else if(talo.get_alar() == 0){
				System.out.printf("Syota talon ala:");
				double alar = reader.nextDouble();
				if (alar <= tontti.get_ala()){
					try{	
						System.out.printf("Talossa olevien huoneiden lukumaara:");
						int huoneet = reader.nextInt();
						talo.set_huoneet(huoneet);
					}
					catch(Exception exception){
						System.out.println("Luvun tulee olla kokonaisluku!");
					}
					System.out.printf("Montako asukasta talossa on:");
					int luku = reader.nextInt();
					talo.set_ala(alar);
					tontti.set_rakennus(talo);
					for(int i = 1; i <= luku; i++){
						String syyt = reader.nextLine();
						Asukkaat asu = new Asukkaat();
						System.out.printf("Asukkaan nimi:");
						String nim = reader.nextLine();
						asu.set_nimi(nim);
						System.out.printf("Asukkaan ika:");
						int ika = reader.nextInt();
						asu.set_ika(ika);
						asukkaat.add(asu);
						System.out.printf("%s, %d\n",asu.get_nimi(), asu.get_ika());
						talo.set_asukkaat(asukkaat);
					}
				}
				else {
					System.out.println("Talo ei voi olla tonttia isompi!");
				}
			}
			else {
				System.out.printf("Hieno homma olet luonut Tontin, sinne Rakennuksen ja rakennukseen Asukkaat!\n");
				System.out.println("Haluatko lopettaa:");
				String vastaus = reader.nextLine();
				if(vastaus.equals("yes") | vastaus.equals("y")){
					break;
				}
				else{
					System.out.println("Ohjelma looppaa");
				}	
			}
		}
		System.out.println("Loit kaiken tarvittavan!");
	}

}
