package evidencija;

import java.time.LocalDate;

public class Evidencija {

	
	private String vlasnikRacunara;
	private LocalDate kadajeRacunarPrimljen;
	private LocalDate kadaJeRacunarSpreman;
	// import
	private String infoSevis;
	private String evidencioniBroj;
	
	
	
	public Evidencija(String vlasnikRacunara, LocalDate kadajeRacunarPrimljen, LocalDate kadaJeRacunarSpreman,
			String infoSevis , String evidencioniBroj) {
		super();
		this.vlasnikRacunara = vlasnikRacunara;
		this.kadajeRacunarPrimljen = kadajeRacunarPrimljen;
		this.kadaJeRacunarSpreman = kadaJeRacunarSpreman;
		this.infoSevis = infoSevis;
		this.evidencioniBroj=evidencioniBroj;
	}
	
	
	
	
	
	
	
	
	public String getVlasnikRacunara() {
		return vlasnikRacunara;
	}
	public void setVlasnikRacunara(String vlasnikRacunara) {
		this.vlasnikRacunara = vlasnikRacunara;
	}
	public LocalDate getKadajeRacunarPrimljen() {
		
		return kadajeRacunarPrimljen = LocalDate.now();
		
		
		// u get ili u set?
		
		
	}
	public void setKadajeRacunarPrimljen(LocalDate kadajeRacunarPrimljen) {
		//this.kadajeRacunarPrimljen = kadajeRacunarPrimljen;
		
		this.kadajeRacunarPrimljen = LocalDate.of(year, month, dayOfMonth);
		
	}
	public LocalDate getKadaJeRacunarSpreman() {
		return kadaJeRacunarSpreman;
	}
	public void setKadaJeRacunarSpreman(LocalDate kadaJeRacunarSpreman) {
		this.kadaJeRacunarSpreman = kadaJeRacunarSpreman;
	}
	public String getInfoSevis() {
		return infoSevis;
	}
	public void setInfoSevis(String infoSevis) {
		this.infoSevis = infoSevis;
	}
	
	
	
	public void setevidencioniBroj(String evidencioniBroj) {
		this.evidencioniBroj = evidencioniBroj;
	}
	
	
	
	
	//Sysyem.out.printline("Hello world");
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
