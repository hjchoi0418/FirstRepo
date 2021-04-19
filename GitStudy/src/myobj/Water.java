package myobj;

public class Water {
	public double temperature;
	public int purity;
	public String state;
	
	public Water() {
		temperature = 20.0;
		purity = 100;
		state = "water";
	}
	
	public Water(double temperature) {
		this.temperature = temperature;
		purity = 100;
		if (this.temperature >= 0)
			state = "water";
		else
			state = "Ice";
	}
	
	public Water(double temperature, int purity) {
		this.temperature = temperature;
		this.purity = purity;
		if (this.temperature >= 0)
			state = "water";
		else
			state = "Ice";
	}
	
	public void boil() {
		temperature++;
		if (temperature >= 0)
			state = "water";
	}
	
	public void freeze() {
		temperature--;
		if (temperature < 0)
			state = "ice";
	}
}
