package servisEvidencija;

import java.time.LocalDate;

import racunar.Racunar;

public class EvidencijaRacunara {

	
	//1
	
	// import LocalDate
	private String evidencioniBroj;
	private String vlasnik;
	private LocalDate datumPrijemaServisa;
	private LocalDate datumZavrsetkaServisa;
	private Status statusServisa;
	private Racunar racunar;
	
	// racunar kao atribut iz klase Racunar 
	
	// nov koncept racunar
	
	
	//3
	public EvidencijaRacunara(String evidencioniBroj, String vlasnik,
			 Racunar racunar) {
		// izbrisati datum prijema servisa za aplikaciju
		this (evidencioniBroj,vlasnik,LocalDate.now(), Status.ZA_POPRAVKU, racunar);
		
		// 7 localDate now dodat umesto datum prijema
		// izbaciti null
		
		
		// promenljiva racunar malim a velikim tip Racunar
		// racunari pre statusa moraju da budu
		
		// null je zato sto nemamo datumj zavrsetka
		// nema status u konstruktoru da ne mora da se pise valueOf
	}
	
	// pozivanje sa this
	
	//2
	public EvidencijaRacunara(String evidencioniBroj, String vlasnik, 
			LocalDate datumZavrsetkaServisa, Status statusServisa, Racunar racunar) {
		super();
		this.evidencioniBroj = evidencioniBroj;
		this.vlasnik = vlasnik;
		//this.datumPrijemaServisa = datumPrijemaServisa;
		this.datumZavrsetkaServisa = datumZavrsetkaServisa;
		this.statusServisa = statusServisa;
		this.racunar = racunar;
		
		// 6 naknadno da umesto datumPrijema bude LocalDate.now
		// ustvari sad se uopste ne koristi datum prijema stoga mozemo da ga izbrisemo?
		
	}
	// status i datum zavrsetkaservisa tj da ne unosimo to kad unosimo nov racunar?
	// da imamo 2 konstruktora
	
	

	
	
	
	//4
	public void informacijeOEvidenciji() {
		System.out.println("Racunar"+ racunar.getSerijskiBroj() + "je u statusu" + statusServisa);
	}
	// moze getstatusServisa

	
	
	
	
	
	
	//5 sve za svaki slucaj
	public String getEvidencioniBroj() {
		return evidencioniBroj;
	}

	public void setEvidencioniBroj(String evidencioniBroj) {
		this.evidencioniBroj = evidencioniBroj;
	}

	public String getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(String vlasnik) {
		this.vlasnik = vlasnik;
	}

	public LocalDate getDatumPrijemaServisa() {
		return datumPrijemaServisa;
	}

	public void setDatumPrijemaServisa(LocalDate datumPrijemaServisa) {
		this.datumPrijemaServisa = datumPrijemaServisa;
	}

	public LocalDate getDatumZavrsetkaServisa() {
		return datumZavrsetkaServisa;
	}

	public void setDatumZavrsetkaServisa(LocalDate datumZavrsetkaServisa) {
		this.datumZavrsetkaServisa = datumZavrsetkaServisa;
	}

	public Status getStatusServisa() {
		return statusServisa;
	}

	public void setStatusServisa(Status statusServisa) {
		this.statusServisa = statusServisa;
	}

	public Racunar getRacunar() {
		return racunar;
	}

	public void setRacunar(Racunar racunar) {
		this.racunar = racunar;
	}
	
	
	
	   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
