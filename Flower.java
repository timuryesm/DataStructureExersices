package java_problems_datastructures;

public class Flower {

	String flower;
	int petals;
	float price; // in rupees

	public Flower(String flower, int petals, float price) {

		this.flower = flower;
		this.petals = petals;
		this.price = price;
	}

	// below are getters and setters

	public String getFlower() {
		return flower;
	}

	public void setFlower(String flower) {
		this.flower = flower;
	}

	public int getPetals() {
		return petals;
	}

	public void setPetals(int petals) {
		this.petals = petals;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public static void main(String[] args) {
		/*
		 * you can intialize the values through constructor method or through getter and
		 * setter methods defined in class
		 */

		Flower flower = new Flower("astor flower", 12, 6.99f);

		// print the values using getter methods

		System.out.println("the flower name, petals count and price respectively is: " + flower.getFlower() + ", "
				+ flower.getPetals() + ", " + flower.getPrice() + ", ");

	}

}
