package lld.third;

//OOPS -> encapsulation abstraction inheritance polymorphism - lecture 1
// Static -> block, variable, method, class
// Design Pattern
//  ----> Builder Design     -- lecture 2
//  ----> Singalton   ----***
//  ----> Factory  -- lecture 3  ----****
// -----> splitwise (from the scratch)
// php, java --> make a connection with database(mysql)
// Amazon --> by giving zipcode 

public class Singalton {
	static Singalton ins = null;
	int data;
	
	private Singalton(){
		
	}
	
	static public Singalton getInstance() {
		if (ins == null) {
			ins = new Singalton();
		}
		return ins;
	}

}


//lets start at 7:05PM