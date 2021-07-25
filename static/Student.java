package lld.second;

//last class we covered OOPS
// -> Inheritance
// -> encapsulation
// -> abstraction
// -> polymorphism

// Lecture Outline
// -> Static
// -> Design Pattern
// ---> Builder Design Pattern

//Entitity -> Student as Bosscoder --> (name, email, phone, Batch_no=B3 to B4, institute)

//Student  Tejas -- 20 Byte --> 12 Byte
//Student Dheeraj -- 20 Byte
// My making something static it is shared at class level
// -> Block -----
// -> Variable ----
// -> methods ----
// -> nested class ----

class Bachha {
	String name;
	int rollNo;
	static String institute = "BCA"; // BossCoder
	
	
	
	
	Bachha (String name, int rollNo){
		this.name = name;
		this.rollNo =  rollNo;
		//this.institute = institute;
	}
	
	static void setInstitute(String name) {
		institute = name;
	}
	
	void setName(String name) { // when some method is changing object personal properties then dont make it as static.
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", institute=" + institute + "]";
	}

	static class Bachha2{ //will be shared across all the instance of Bachha class //USB
		String name;
		//Object of Bachha
	}  //Motherboard --> USB pin // CPU. process/ CACHE/ RAM

	class Bacha3{
		
	}

}

class Bachha2{
	
}

public class Student {
	
//	public static void main (String arg[]) {
//		Bachha dheeraj = new Bachha("Dheeraj", 1); //12 Byte [ ]
//				
//		//dheeraj.institute = "BossCoder";
//		
//		Bachha.Bacha3 dheeraj_c1 = dheeraj.new Bacha3();
//		Bachha.Bacha3 dheeraj_c2 = dheeraj.new Bacha3();
//		
//		Bachha.Bachha2 global_bachha = new Bachha.Bachha2();
//		//Bachha.setInstitute("BossCoder");
//		dheeraj.setName("Dheeraj Barik");
//		
//		Bachha Vardan = new Bachha("Vardan", 2);
//		System.out.println(dheeraj);
//
//		System.out.println(Vardan);
//		
//		
//
//	}
	
//	static {
//		//System.out.println("Hello Guys");
//		Bachha.institute = "BCAAAA";
//	}

	

}






//lets start at 7:05 PM