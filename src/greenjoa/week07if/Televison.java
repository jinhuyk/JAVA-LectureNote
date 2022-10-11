package greenjoa.week07if;

public class Televison implements RemoteControl {
	
	
	private int volume;
	public void turnOn() {
		System.out.println("TV on");
	}
	public void turnOff() {
		System.out.println("TV OFF");
	}
	
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
	}
}
