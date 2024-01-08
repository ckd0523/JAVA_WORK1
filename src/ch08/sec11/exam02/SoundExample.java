package ch08.sec11.exam02;

public class SoundExample {
	public static void main(String[] args) {
		
	
	
	Duck duck = new Duck();
	Cow cow = new Cow();
	Chicken chicken = new Chicken();
	
	Sound sound = new Sound();
	
	sound.sound(chicken);
	sound.sound(cow);
	sound.sound(duck);
	
	
	
	}
}
