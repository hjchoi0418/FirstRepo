package myinterface;

public interface Car {

	void startUp();
	default void drive() {
		System.out.println("ºÎ¸ªºÎ¸ª");
	}
}
