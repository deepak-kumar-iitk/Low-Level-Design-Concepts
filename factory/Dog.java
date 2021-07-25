package lld.third;

public class Dog extends CommonAnimal{
	
	String name = "puppy";
	
	
	@Override
	public String eat() {
		return "nonveg";
		
	}
	
		
	@Override
	public String speak() {
		return "bark";
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	public String sleep() {
		return "go to sleep";
	}
}
