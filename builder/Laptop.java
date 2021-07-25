package lld.second;

// processor, harddisk, ram, cooler, screensize, brand, os, clock_speed, HDMI_slot, core 20 Attribute
public class Laptop {
//1
//.
//.
//.
//20
//constructer
	//Laptop(processor, harddisk, ram, cooler, screensize, .............)
	
	private String processor;
	private String screentype;
	private int ram;
	private String brand;
	private int battery;
	
	//Laptop(String processor, String screentype, int ram, String brand){
	Laptop(String processor, String screentype, int ram, String brand, int battery){
		this.processor = processor;
		this.screentype = screentype;
		this.ram = ram;
		this.brand = brand;
		this.battery  = battery;
	}

	@Override
	public String toString() {
		return "Laptop [processor=" + processor + ", screentype=" + screentype + ", ram=" + ram + ", brand=" + brand
				+ ", battery=" + battery + "]";
	}
	
	

//	public void setProcessor(String processor) {
//		this.processor = processor;
//	}
//
//
//
//	public void setScreentype(String screentype) {
//		this.screentype = screentype;
//	}
//
//
//
//	public void setRam(int ram) {
//		this.ram = ram;
//	}
//
//
//
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}




	
	
}
