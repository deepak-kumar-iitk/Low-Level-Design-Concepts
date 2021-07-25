package lld.second;

public class Shopkeeper {

	
	public static void main(String arg[]) {
		Laptop deeraj_laptop = new Laptop("intel", "not_touch", 8, "Lenovo", 3000);
//		Laptop deeraj_laptop = new Laptop();
//		deeraj_laptop.setRam(16); //mutable
		System.out.println(deeraj_laptop);
		
		Laptop Suraj_laptop = new Builder().setRam(16).setBattery(6000).get_laptop();
		
		Laptop ayush_laptop = new Builder().setRam(16).setScreentype("touch").get_laptop();
		
		System.out.println(Suraj_laptop);
		System.out.println(ayush_laptop);

	}
}
