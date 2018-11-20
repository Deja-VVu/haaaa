package racunar;

public class DeskTop extends Racunar {
// 1 extends
	
	private TipKucista tipKucista;
// ne mora da se importuje?
	// ctrl click za
	
	// moze public ili private
	
	
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
