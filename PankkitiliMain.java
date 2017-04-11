import java.util.Scanner;

public class PankkitiliMain {
	
	static Scanner reader = new Scanner(System.in);
	static Pankkitili tili = new Pankkitili();

	public static void main(String [] args){
		while(true){
			System.out.printf("Paina nappainta, koska voin tehda nain:");
			String syy2 = reader.nextLine();
			System.out.printf("Mita haluat tehda: luo tili(l), nosta(n), talleta(t), lopeta(q), tarkista tili(tr)\n >");
			String input = reader.nextLine();
			if (input.equals("l")) {
				System.out.printf("Anna nimi >");
				String nimi = reader.nextLine();
				tili.set_name(nimi);
				System.out.printf("Syota tilinumero >");
				String numero = reader.nextLine();
				tili.set_tili(numero);
				try{
					System.out.printf("Syota saldo >");
					double s = reader.nextDouble();
					tili.set_saldo(s);
				} catch (Exception exception) {
					System.out.printf("Vaara saldo\n");
				}
				tili.print();
				String syy = reader.nextLine();
			}
			else if(input.equals("n")) {
				System.out.printf("Paljonko haluat nostaa >");
				double nosto = reader.nextDouble();
				double n = tili.get_saldo();
				if (n-nosto <0){
					System.out.printf("Tililla ei ole nain paljoa rahaa!");
				}
				else {
					n = n-nosto;
					tili.set_saldo(n);
					System.out.printf("tililla on : %f $\n", n);
					String syy1 = reader.nextLine();
				}
			}
			else if (input.equals("t")) {
				double t = tili.get_saldo();
				System.out.printf("Paljonko haluat tallettaa >\n");
				double tallennus = reader.nextDouble();
				tili.set_saldo((tallennus+t));
				System.out.printf("Nyt tililla on %f $\n", (tallennus+t));
			}
			else if (input.equals("q")){
				break;
			}
			else if (input.equals("tr")){
				if (tili.get_name() == null){
					System.out.printf("Sinulla ei ole tilia luo sellainen ensin!\n");
				} else {
					tili.print();
				}
			}
		}
	}
}
