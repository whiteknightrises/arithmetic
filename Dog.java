package logic;
class dogs{
	String breed_name;
	int dog_age;
	public dogs(String breed_name, int dog_age) {
		this.breed_name = breed_name;
		this.dog_age = dog_age;
	}
	public String getBreed_name() {
		return breed_name;
	}
	public void setBreed_name(String breed_name) {
		this.breed_name = breed_name;
	}
	public int getDog_age() {
		return dog_age;
	}
	public void setDog_age(int dog_age) {
		this.dog_age = dog_age;
	}
	public void display() {
		System.out.println("Breed of the dog is  "+breed_name+"  age is "+dog_age);
	}
	
}
public class Dog {
public static void main(String[] args) {
	dogs d = new dogs("pomerian",10);
	d.display();
	d.setDog_age(13);
	d.setBreed_name("rottweiler");
	d.display();
		
		
		
		
		
	}

}
