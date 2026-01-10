package Media;

public class MediaControl {
	protected int value = 0;	
	protected int maxValue = 100;	
	
	protected MediaControl(int maxValue) {
		this.maxValue = maxValue;
	}

	private static int clip(int value, int max) {
		return value < 0 ? 0 : 
			value > max ? max : value;
	}

	public void Set(int val){
		this.value = clip(val, maxValue);
	}

	public int Get(){
		return this.value;
	}

}
