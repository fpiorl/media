package Media;

public class Luminosita extends MediaControl {
	public Luminosita() {
		super(8); // (8) livello massimo di luminosita 
	}

	protected void setLuminosita(int val){
		Set(val);
	}

	public void alzaLuminosita(int factor) {
		setLuminosita(this.Get() + factor);
	}

	public void alzaLuminosita() {
		alzaLuminosita(1);
	}

	public void abbassaLuminosita(int factor) {
		setLuminosita(this.Get() - factor);
	}

	public void abbassaLuminosita() {
		abbassaLuminosita(1);
	}
}
