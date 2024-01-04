package ch06.sec07;

public class Car {

	String company = "현대자동차";
	String model;
	String color;
	int maxspeed;

	Car() {
	};

	Car(String model) {
		this(model,"검정",250);
	}

	Car(String model, String color) {

		this(model,color,140);


	}

	Car(String model, String color, int maxspeed) {
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}
}
