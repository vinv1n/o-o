import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class KassaJono implements JonoInterface {
	
	Asiakas[] jono = new Asiakas[2];
	
	public void lisaaElementti(Asiakas asiakas){
		for(int i = 1; i <= jono.length; i++){
			if(jono[i] == null){
				jono[i] = asiakas;
				System.out.printf("Lisatiin asiakas jonoon paikalle %d!\n", i);
				break;
			}
		}
	}
	public boolean onkoJonoOlemassa(){
		if(jono.length == 0){
			return false;
		}
		else{
			return true;
		}
	}
	public boolean onkoJonoTyhja(){
		if(jono[0] == null){
			return true;
		}
		else{
			return false;
		}
	}
	public Asiakas palautaElementit(){
		if(jono.length > 1){
			Asiakas[] shorterJono = Arrays.copyOfRange(jono, 1, jono.length);
			Asiakas maksanut = jono[1];
			jono = shorterJono;
			return maksanut;
		}
		else{
			return jono[1];
		}
	}
	public void odota(){
		try{
			TimeUnit.SECONDS.sleep(1);
		}
		catch(InterruptedException exception){
			
		}
	}
	public void laajenna(){
		Asiakas[] newJono = new Asiakas[jono.length+2];
		System.arraycopy(jono, 0, newJono, 0, jono.length);
		jono = newJono;
	}
}