package Media;

public class Video extends Media implements Riproduttore {
	Volume volume;
	Luminosita luminosita;
	private int durata;

	public Video(String titolo, int volume, int luminosita, int durata) {
		super(titolo);
		this.volume = new Volume();
		this.luminosita = new Luminosita();
		this.volume.setVolume(volume);
		this.luminosita.setLuminosita(luminosita);
		this.durata = durata;
	}

	@Override
	public void Riproduci() {
		for(int i=0; i<this.durata; i++)
			System.out.println(this.titolo 
				+ "!".repeat(this.volume.Get())
				+ "*".repeat(this.luminosita.Get()));
	}
	
}
