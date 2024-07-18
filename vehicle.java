class vehicle{
	public String name = "saipavan";
	public int license = 12345;
	
}

class car extends vehicle{
	public String type = "Car";
	public String color = "Red";
	
	public void vehicle_main(){
		System.out.println("Vehicle Type : "+type);
		System.out.println("Vehicle Color : "+color);
	}
	
	public static void main(String[] args){
		car obj = new car();
		System.out.println("Name = "+obj.name);
		System.out.println("License = "+obj.license);
		obj.vehicle_main();
}
}


class truck extends vehicle{
	public String type = "truck";
	public String color = "Blue";
	
	public void truck_main(){
		System.out.println("Truck Type : "+type);
		System.out.println("Truck Color : "+color);
	}
	
	public static void main(String[] args){
		truck obj = new truck();
		obj.truck_main();
}

}

class motorcycle extends vehicle{
	public String type = "MotorCycle";
	public String color = "Green";
	
	public void motor_main(){
		System.out.println("Motor Type : "+type);
		System.out.println("Motor Color : "+color);
	}
	
	public static void main(String[] args){
		motorcycle obj = new motorcycle();
		obj.motor_main();
}
}