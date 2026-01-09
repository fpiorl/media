package Media;

public class Volume {
	private int volume = 0;	
	private final int maxVolume = 100;	

	public void setVolume(int vol){
		this.volume = MediaControl.clip(vol, maxVolume);
	}

	public int Get(){
		return this.volume;
	}

	public void alzaVolume(int factor) {
		setVolume(volume + factor);
	}

	public void alzaVolume() {
		alzaVolume(10);
	}

	public void abbassaVolume(int factor) {
		this.setVolume(this.volume - factor);
	}

	public void abbassaVolume() {
		abbassaVolume(10);
	}

}
