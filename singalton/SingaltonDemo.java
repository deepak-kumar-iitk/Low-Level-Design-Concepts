package lld.third;

public class SingaltonDemo {
	
	public static void main(String arg[]) {
	//Singalton instance = new Singalton();
	//Singalton instance2 = new Singalton();
	Singalton instance  = Singalton.getInstance();
	Singalton instance2  = Singalton.getInstance();


	System.out.println(instance);
	System.out.println(instance2);

	}
}
