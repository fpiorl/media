package Media;

public class MediaControl {
	public static int clip(int value, int max) {
		return (value < 0) ? 0 :
			(value > max) ? max : value;
	}
}
