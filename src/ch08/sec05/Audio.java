package ch08.sec05;

public class Audio implements RemoteControl {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		}
		else if(volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		}
		else {
			this.volume=volume;
		}
		System.out.println("현재 볼륨은 : "+this.volume);
		
	}
	private int memoryVolume;
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume=this.volume;
			System.out.println("무음 처리 되었습니다.");
			setVolume(RemoteControl.MIN_VOLUME);
		}
		else {
			System.out.println("무음 해제 되었습니다.");
			setVolume(this.memoryVolume);
			
		}
	}
	
	

}
