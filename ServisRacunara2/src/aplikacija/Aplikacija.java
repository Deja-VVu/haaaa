//package aplikacija;
//
//import java.time.LocalDate;
//import java.util.Scanner;
//
//import racunar.LapTop;
//import racunar.Racunar;
//import servisEvidencija.EvidencijaRacunara;
//import servisEvidencija.Servis;
//
//public class Aplikacija {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		//1 objekat new
//		Servis servisSasa = new Servis();
//		Racunar djoletovRacunar = new LapTop("545453" ,2.50 , "Toshiba" , 15.6);
//		// 2 . 5 ne zarez
//	
//		
//		EvidencijaRacunara djoletovaEvidencija = new EvidencijaRacunara("1A", "DJORDJE", djoletovRacunar);
//	// null nije djoletov racunar
// ne ja ahahha
//		
//		servisSasa.dodajRacunarNaServis(djoletovaEvidencija);
//		
//		
//		// najbolje je da se preko ctrl space automatski ubace parametri
//		
//		
//		// stampanje racunara na evidenciji i
//		
//		
//		Racunar tanjinRacunar = new LapTop("656475", 2.40 , "DELL" , 15.6);
//		EvidencijaRacunara tanjinaEvidencija = new EvidencijaRacunara ("3A" , "TANJA" , tanjinRacunar);
//		servisSasa.dodajRacunarNaServis(tanjinaEvidencija);
//		// dodaj pa ctrl space umesto racunar za evidenciju tanjinaEvidencija
//		
//		
//		// aboravio sam ovo tj ove treba da bude
//		Scanner ulaz = new Scanner (System.in);
//		
//		// zagrada viticasta za unreachable code
//		// beskonacna petlja
//		while(true) {
//			
//			System.out.println("Komande za rad sa servisom:");
//		    System.out.println("   0 - izlazak iz aplikacije");
//		    System.out.println("   1 - pregled racunara na servisu");
//			System.out.println("   2 - unos novog racunara");
//			Integer ulaznaKomanda = ulaz.nextInt();
//			if (ulaznaKomanda == 0) {
//				System.out.println("   Izlazak iz aplijacije    ");
//				break;
//			}
//			
//			
//			
//			if (ulaznaKomanda == 1) {
//				servisSasa.racunarNaServisu();
//			}
//			// nisam sejvovao servis jer bio je private pa sam promenio u public a nisam ctrl s
//			
//			
//			if (ulaznaKomanda == 2)
//				System.out.println("Unesite vlasnika racunara :");
//				String vlasnik = ulaz.nextLine();
//				System.out.println("Unesite evidencioni broj :");
//				String evidencioniBroj = ulaz.nextLine();
//				System.out.println("Unesite serijski broj racunara:");
//				String serijskiBrojRacunara= ulaz.nextLine();
//				System.out.println("Unesite marku racunara:");
//				String marka= ulaz.nextLine();
//				System.out.println("Unesite brzinu procesora:");
//				Double brzina= ulaz.nextDouble();
//				System.out.println("Unesite velicinu ekrana:");
//				Double dijagonala= ulaz.nextDouble();
//				
//				
//				// nove promenljive nov konstruktor novi nazivi
//				// ali parametri su iz klase LapTop
//				// naziv moze da bude kakav god mi zelimo
//				
//				// mogoa je jedan parametar da bude 2 puta dijagonala npr dijagonala marka dijagonala
//				// ali tip je najvazniji javi i on je tacan bez obzira kako se zove
//				Racunar r= new LapTop(serijskiBrojRacunara , brzina , marka , dijagonala);
//				EvidencijaRacunara evidencija = new EvidencijaRacunara(evidencioniBroj, vlasnik,r);
//				servisSasa.dodajRacunarNaServis(evidencija);
//				System.out.println("Uspesno ste dodali racunar u servis"); // NE OVDE gore gde je 2 if
//				// metoda servissasa 
//				
//				// i metoda za dodavanje u evidenciji? a evidencija je lista
//				
//				
//				
//				
//				// kopiranje za Helper klass
//				
//				
//				
//				
//				
//				
//		}
//				
//				
//				
//		//System.out.println("Unesite 1 da bi videli racunare na servisu");
//		
//		
//		
//		
//		
//		
////		Scanner ulaz = new Scanner(System.in);
////		Integer ulaznaKomanda = ulaz.nextInt();
////		if (ulaznaKomanda == 1) {
////			servisSasa.racunarNaServisu
//		//
//		
//		
//		
//		
//		
//	}
//
//}
