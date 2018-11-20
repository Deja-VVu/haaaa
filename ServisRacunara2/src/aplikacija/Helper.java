package aplikacija;

import java.util.Scanner;

import racunar.LapTop;
import racunar.Racunar;
import servisEvidencija.EvidencijaRacunara;

public class Helper {
// dodat scanner
	public static EvidencijaRacunara unesiEvidenciju (Scanner ulaz) {

	System.out.println("Unesite vlasnika racunara :");
	String vlasnik = ulaz.nextLine();
	System.out.println("Unesite evidencioni broj :");
	String evidencioniBroj = ulaz.nextLine();
	System.out.println("Unesite serijski broj racunara:");
	String serijskiBrojRacunara= ulaz.nextLine();
	System.out.println("Unesite marku racunara:");
	String marka= ulaz.nextLine();
	System.out.println("Unesite brzinu procesora:");
	Double brzina= ulaz.nextDouble();
	System.out.println("Unesite velicinu ekrana:");
	Double dijagonala= ulaz.nextDouble();
	
	
	// nove promenljive nov konstruktor novi nazivi
	// ali parametri su iz klase LapTop
	// naziv moze da bude kakav god mi zelimo
	
	// mogoa je jedan parametar da bude 2 puta dijagonala npr dijagonala marka dijagonala
	// ali tip je najvazniji javi i on je tacan bez obzira kako se zove
	Racunar r= new LapTop(serijskiBrojRacunara , brzina , marka , dijagonala);
	EvidencijaRacunara evidencija = new EvidencijaRacunara(evidencioniBroj, vlasnik,r);
		return evidencija;
		
		
		
		
	}

}
