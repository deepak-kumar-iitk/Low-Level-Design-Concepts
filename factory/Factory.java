package lld.third;

public class Factory {
		
	public Animal getAnimal(String animal_name) {
		Animal ani;
		if(animal_name.equalsIgnoreCase("cat")){
			ani =  new Cat();
		}else if(animal_name.equalsIgnoreCase("dog")) {
			ani =  new Dog();
		}else {
			ani = null;
		}
		
		return ani;
	}
}
