package servisEvidencija;

import java.util.ArrayList;
import java.util.List;

public class Servis {

	
	//1
	private List<EvidencijaRacunara> racunari;
// moze new array
	
	
	//2
	//public Servis(List<EvidencijaRacunara> racunari) { // prazan treba da bude? 
		public Servis() {
		super();
		//this.racunari = new ArrayList<EvidencijaRacunara>();//3 bez evidencijaRacunara sto?
		this.racunari = new ArrayList<>();
	}
	
	// import za listu
	// dodat objekat new arraylist moze i gore u private 
	// inicijalizovano polje new arraylist
	//pravilnije je jer konstruktor se koristi da inicijalizuje
	// inicijalizacije se rade preko konstruktora
	
	
	// lista objekata u servis iz evidencijeracunara 
	// 1 lista za sve
	//metode iz servisa dodaj itd
	
		
		
		
    //4
	public void dodajRacunarNaServis(EvidencijaRacunara racunarZaEvidenciju) {
		
		//5
		racunari.add(racunarZaEvidenciju);
		
		
	}
	
	// potpis metode preuzmiURad
	public void preuzmiURad(String evidencioniBroj) {
		
		
		
		// dodato nakon helper klase
		
		
		for (EvidencijaRacunara evidencijaRacunara : racunari) {
			if (evidencijaRacunara.getEvidencioniBroj().equals(evidencioniBroj)){
				evidencijaRacunara.setStatusServisa(Status.U_RADU);
			}
		}
		// umesto evidencija evidencijaRacunara
		
		
		
	}
	
	
	public void zavrsiServis(String evidencioniBroj) { // sugestija ulazni parametar mora da prosledi neki evidencioni broj 1 a npr kao string "1a"
		// kao jmbg
	}
	
	// public ne private?
	
	// nije string evidencioni broj kao argument?
	// evo ga racunarNaServisu za palikaciju
	public void racunarNaServisu() {
		// dodati ili videti listu?
		// public metoda ili private?
		
		//6 ctrl space i nadji foreach
		
		// evidencija naziv tipa? i : dvotacka kao in racunari sto je lista
		for (EvidencijaRacunara evidencija : racunari) {
			evidencija.informacijeOEvidenciji();
			// ovaj deo for kroz listu i za svaki entitet
			// pita sta zelis da uradimo sa objektor evidencijaracunara
			// taj objekat ima metodu evidencija.informacije o evidenciji gde se nalazi syso ova metoda stampa , on poziva ...
			// ovde ide syso?
		}
		
		
	}
}
