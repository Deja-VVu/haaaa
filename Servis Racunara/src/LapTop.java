
public class LapTop extends Racunari{

	
	
	
	private Double velicinaDispleya;

	
	
	
	public LapTop(String serijskiBroj, Double brzinaProcesora, String marka, Double velicinaDispleya) {
		super(serijskiBroj, brzinaProcesora, marka);
		this.velicinaDispleya = velicinaDispleya;
	}
	
	
	

	public Double getVelicinaDispleya() {
		return velicinaDispleya;
	}

	public void setVelicinaDispleya(Double velicinaDispleya) {
		this.velicinaDispleya = velicinaDispleya;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
