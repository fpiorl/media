package Media;

public class Luminosita {
	private int luminosita = 0;	
	private final int maxLuminosita = 100;	

	public void setLuminosita(int val){
		this.luminosita = MediaControl.clip(val, maxLuminosita);
	}

	public int Get(){
		return this.luminosita;
	}

	public void alzaLuminosita(int factor) {
		setLuminosita(luminosita + factor);
	}

	public void alzaLuminosita() {
		alzaLuminosita(10);
	}

	public void abbassaLuminosita(int factor) {
		this.setLuminosita(this.luminosita - factor);
	}

	public void abbassaLuminosita() {
		abbassaLuminosita(10);
	}
}
