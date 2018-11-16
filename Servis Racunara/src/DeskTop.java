
public class DeskTop extends Racunari{

	
	
	
	TipKucista tipKucista;

	// tip kucista zato sto pozivamo enum klasu a ne string
	// nema sam nove atribute
	
	public DeskTop(String serijskiBroj, Double brzinaProcesora, String marka, TipKucista tipKucista) {
		super(serijskiBroj, brzinaProcesora, marka);
		this.tipKucista = tipKucista;
	}

	
	
	
	
	public TipKucista getTipKucista() {
		return tipKucista;
	}

	public void setTipKucista(TipKucista tipKucista) {
		this.tipKucista = tipKucista;
	}

	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
