import java.util.Scanner;

class LehtiMain {
	
	static Scanner reader = new Scanner(System.in);
	static StandingSubscription standing = new StandingSubscription();
	static RegularSubscription regular = new RegularSubscription();
	static Subscription subs = new Subscription();
	
	public static void main(String [] args){
		
		while(true){
			System.out.printf("Minka tyyppinen tilaus?(regular or standing):");
			String tilaus = reader.nextLine();
			if(tilaus.equals("standing")){
				System.out.printf("Minka nimista lehtea tilataan:");
				String lehti = reader.nextLine();
				standing.set_lehden_nimi(lehti);
				System.out.printf("Tilaajan nimi:");
				String tilaaja = reader.nextLine();
				standing.set_tilaajan_nimi(tilaaja);
				System.out.printf("Lehden toimitusosoite:");
				String osoite = reader.nextLine();
				standing.set_toimitusosoite(osoite);
				System.out.printf("Lehden kuukausihinta:");
				double hinta = reader.nextDouble();
				standing.set_kuukausihinta(hinta);
				System.out.printf("Syota alennus prosentti:");
				int alennus = reader.nextInt();
				standing.set_alennus(alennus);
				printSubscriptionInvoice(standing);
				String syy = reader.nextLine(); //ilmeisesti bufferi tayttyy
			}
			else if(tilaus.equals("regular")){
				System.out.printf("Minka nimista lehtea tilataan:");
				String lehti = reader.nextLine();
				regular.set_lehti(lehti);
				System.out.printf("Tilaajan nimi:");
				String tilaaja = reader.nextLine();
				regular.set_tilaaja(tilaaja);
				System.out.printf("Lehden toimitusosoite:");
				String osoite = reader.nextLine();
				regular.set_osoite(osoite);
				System.out.printf("Lehden kuukausihinta:");
				double hinta1 = reader.nextDouble();
				regular.set_kuukausihinta(hinta1);
				System.out.printf("Tilauksen kesto kuukausina:");
				int kesto = reader.nextInt();
				regular.set_kesto(kesto);
				printSubscriptionInvoice(regular);
				String syy = reader.nextLine();
			}
			else{
				System.out.println("Vaaran tyypinen tilaus!");
			}
		}
	}
	static void printSubscriptionInvoice(Subscription subs){
		subs.printInvoice();
	}
}
