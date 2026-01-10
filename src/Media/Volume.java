package Media;

import java.util.Random;

public class Volume extends MediaControl {
	public Volume() {
		super(7); // 7 e' volume massimo
	}

	protected void setVolume(int val){
		Set(val);
	}

	public void alzaVolume(int factor) {
		setVolume(Get() + factor);
	}

	public void alzaVolume() {
		alzaVolume(1);
	}

	public void abbassaVolume(int factor) {
		setVolume(Get() - factor);
	}

	public void abbassaVolume() {
		abbassaVolume(1);
	}
}
