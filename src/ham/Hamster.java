package ham;

public class Hamster {

	private String name;

	// default
	private int age;

	private String colour;

	public Hamster(String name, int age, String colour) {
		this.setName(name);
		this.setAge(age);
		this.setColour(colour);
	}

	public Hamster() {
	}

//	public Hamster(String name, int age, String colour) {
//		this.name = name;
//		this.age = age;
//		this.colour = colour;
//	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if (age > 0 && age < 5) {
			this.age = age;
		} else {
			System.out.println("Invalid age: " + age);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
