package lld.third;

public class Cat extends CommonAnimal{
	
	String name = "cat";
	@Override
	public String eat() {
		return "nonveg and milk";
		
	}
	
		
	@Override
	public String speak() {
		return "meau";
	}
	
	@Override
	public String getName() {
		return name;
	}


}
