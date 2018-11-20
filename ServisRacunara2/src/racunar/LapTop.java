package racunar;

public class LapTop extends Racunar{
// error bez konstruktora
	
	private Double velicinaDispleja;

	public LapTop(String serijskiBroj, Double brzinaProcesora, String marka, Double velicinaDispleja) {
		super(serijskiBroj, brzinaProcesora, marka);
		this.velicinaDispleja = velicinaDispleja;
	}

	// ctrl s save za sve klase
	
	// override informacije o racunaru
	
	@Override
	public void informacijeORacunaru() {
		// TODO Auto-generated method stub
		super.informacijeORacunaru();
		System.out.println("Ovo je LapTop");
	}
	
	
	
	
	
	public Double getVelicinaDispleja() {
		return velicinaDispleja;
	}

	



	public void setVelicinaDispleja(Double velicinaDispleja) {
		this.velicinaDispleja = velicinaDispleja;
	}
	
	// get i set novi atribut
	
	
	
	
	
}
