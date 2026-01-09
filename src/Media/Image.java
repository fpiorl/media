package Media;

public class Image extends Media {
	Luminosita luminosita;

	public Image(String titolo, int luminosita) {
		super(titolo);
		this.luminosita = new Luminosita();
		this.luminosita.setLuminosita(luminosita);
	}

	public void Show(){
		System.out.println(this.titolo + "*".repeat(this.luminosita.Get()));
	}
}
