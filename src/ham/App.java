package ham;

public class App {

	public static void main(String[] args) {
		Hamster ham1 = new Hamster();

		ham1.setAge(Integer.MIN_VALUE);

		System.out.println("Age: " + ham1.getAge());

		ham1.setAge(2);

		System.out.println("Age: " + ham1.getAge());

		Hamster ham2 = new Hamster("Barry", -252, "Blue");

		System.out.println("Age: " + ham2.getAge());
	}

}
