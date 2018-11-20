package racunar;
//1 i prva napravljena klasa
public abstract class Racunar {

	
	// atributi konstruktora i get i set i metoda informacije o racunaru
	// klasa je abstraktna
	//2
	private String serijskiBroj;
	private Double brzinaProcesora;
	private String marka;
	
	//3
	public Racunar(String serijskiBroj, Double brzinaProcesora, String marka) {
		super();
		this.serijskiBroj = serijskiBroj;
		this.brzinaProcesora = brzinaProcesora;
		this.marka = marka;
	}


	// mogli smo da popunimo atribute
	//4
	public void informacijeORacunaru() {
		System.out.println("Racunar na servisu je" 
				+ serijskiBroj);
	}
	// viticasta enter da zatvori
	
	
	//5
	public String getSerijskiBroj() {
		return serijskiBroj;
	}


	public void setSerijskiBroj(String serijskiBroj) {
		this.serijskiBroj = serijskiBroj;
	}


	public Double getBrzinaProcesora() {
		return brzinaProcesora;
	}


	public void setBrzinaProcesora(Double brzinaProcesora) {
		this.brzinaProcesora = brzinaProcesora;
	}


	public String getMarka() {
		return marka;
	}


	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	
	
	
	
	
	
	
	
	
}
