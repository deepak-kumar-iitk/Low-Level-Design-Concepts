package lld.second;

public class Builder {
	String processor  = "Intel";
	String screentype = "not_touch";
	int ram = 8;
	String brand = "lenevo";
	int battery = 3000;
	
	public Builder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public Builder setScreentype(String screentype) {
		this.screentype = screentype;
		return this;
	}
	public Builder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public Builder setBrand(String brand) {
		this.brand = brand;
		return this;
	}
	
	public Builder setBattery(int battery) {
		this.battery = battery;
		return this;
	}


	public Laptop get_laptop() {
		return new Laptop(processor, screentype, ram, brand, battery);
	}
	

}
