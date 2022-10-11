package greenjoa.week07if;

public interface RemoteControl {
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 10;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리");
		}
		else {
			System.out.println("무음해제");
		}
	}
}
