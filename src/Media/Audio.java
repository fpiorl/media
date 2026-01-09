package Media;

public class Audio extends Media implements Riproduttore {
	Volume volume;
	private int durata;	

	public Audio(String titolo, int volume, int durata) {
		super(titolo);
		this.volume = new Volume();
		this.volume.setVolume(volume);
		this.durata = durata;
	}

	@Override
	public void Riproduci() {
		for(int i=0; i<this.durata; i++)
			System.out.println(this.titolo + "!".repeat(this.volume.Get()));
	}
}
