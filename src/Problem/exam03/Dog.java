package Problem.exam03;
import java.util.*;
public class Dog extends Pet {

	private String breed;						// 품종
	private boolean boosterShot;			// 예방주사 접종 여부
	
	public Dog() {
		super ();
		breed="";
		boosterShot=false;
	}
	
	public Dog(String name, int age, String breed, boolean boosterShot) {
		super (name,age);
		this.breed=breed;
		boosterShot=false;
	}
	
	public String toString() {
	return "";
}

	public String getBreed() {return breed;}

	public void setBreed(String breed) {this.breed = breed;}

	
	public boolean isBoosterShot(String shotAnswer) {
		if(shotAnswer.equals("예"))return true;
		else return false;
		}

	public void setBoosterShot(boolean boosterShot) {this.boosterShot = boosterShot;}
	
	
	
}
	
	
	
