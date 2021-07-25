package lld.third;

public class Shopkeeper {
	
	public static void main(String str[]) {
		Factory f =  new Factory();
		Animal a = f.getAnimal("cat");
		String ans = a.eat();
		System.out.println(ans);
		
		String run = a.running();
		System.out.println(run);
		
		
		Animal b = f.getAnimal("dog");
		String ans2 = b.eat();
		System.out.println(ans2);
		//System.out.println(b.name);


	}
}
