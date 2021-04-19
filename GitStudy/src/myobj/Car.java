package myobj;

public class Car {

	private int num;
	private boolean isDisabled;
	private boolean hasChildCompanion;
	private boolean isLightCar;
	
	public Car(int num, boolean isDisabled, boolean hasChildCompanion, boolean isLightCar) {
		this.num = num;
		this.isDisabled = isDisabled;
		this.hasChildCompanion = hasChildCompanion;
		this.isLightCar = isLightCar;
	}
	
	public int getNum() {
		return num;
	}
	
	public boolean isDisabled() {
		return isDisabled;
	}
	
	public boolean hasChildCompanion() {
		return hasChildCompanion;
	}
	
	public boolean isLightCar() {
		return isLightCar;
	}
}
