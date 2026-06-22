class Vehicle
{
	String vehicleNo;
	String model;
	String companyName;
	int noOfWheels;
	double price;
	
	Vehicle(){
		
	}
	
	Vehicle(String vehicleNo,String model, String companyName,int noOfWheels,double price){
		this.vehicleNo = vehicleNo;
		this.model = model;
		this.companyName = companyName;
		this.noOfWheels = noOfWheels;
		this.price = price;
	}
	
	void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	
	String getVehicleNo() {
		return this.vehicleNo;
	}
	
	void setModel(String model) {
		this.model = model;
	}
	
	String getModel() {
		return this.model;
	}
	
	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	String getCompanyName() {
		return this.companyName;
	}
	
	void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	
	int getNoOfWheels() {
		return this.noOfWheels;
	}
	
	void setPrice(double price) {
		this.price = price;
	}
	
	double getPrice() {
		return this.price;
	}
	
	void display() {
		System.out.println("Vehicle Number: "+this.vehicleNo);
		System.out.println("Model: "+this.model);
		System.out.println("Company Name: "+this.companyName);
		System.out.println("No Of Wheels: "+this.noOfWheels);
		System.out.println("Price: "+this.price);
	}
}
//class Vehicle ends here

class Bike extends Vehicle{
	int noOfStands;
	int noOfHelmets;
	String bikeCategory;
	
	Bike(){
		super();
	}
	
	Bike(String vehicleNo,String model,String companyName,int noOfWheels,double price,int noOfStands,int noOfHelmets,String bikeCategory){
		super(vehicleNo,model,companyName,noOfWheels,price);
		
		this.noOfStands = noOfStands;
		this.noOfHelmets =noOfHelmets;
		this.bikeCategory = bikeCategory;
	}
	
	void setNoOfStands(int noOFStands) {
		this.noOfStands = noOFStands;
	}
	
	int getNoOfStands() {
		return this.noOfStands;
	}
	
	void setNoOfHelmets(int noOfHelmets) {
		this.noOfHelmets = noOfHelmets;
	}
	
	int getNoOfHelmets() {
		return this.noOfHelmets;
	}
	
	void setBikeCategory(String bikeCategory) {
		this.bikeCategory = bikeCategory;
	}
	
	String getBikeCategory() {
		return this.bikeCategory = bikeCategory;
	}
	
	void display() {
		super.display();
		
		System.out.println("No of Vehicles: "+this.noOfStands);
		System.out.println("No of Helmets: "+this.noOfHelmets);
		System.out.println("Bike Category: "+this.bikeCategory);
	}
}
//Bike class ends here

class Car extends Vehicle {
	boolean hasPowerSteering;
	String driveMode;
	int parkingAssistance;
	
	Car(){
		super();
	}
	
	Car(String vehicleNo, String model, String companyName, int noOfWheels, double price, boolean hasPowerSteering, String driveMode,int parkingAssistance){
		super(vehicleNo,model,companyName,noOfWheels,price);
		
		this.hasPowerSteering = hasPowerSteering;
		this.driveMode = driveMode;
		this.parkingAssistance = parkingAssistance;
	}
	
	void setHasPowerSteering(boolean hasPowerSteering) {
		this.hasPowerSteering = hasPowerSteering;
	}
	
	boolean getHasPowerSteering() {
		return this.hasPowerSteering;
	}
	
	void setDriveMode(String driveMode) {
		this.driveMode = driveMode;
	}
	
	String getDriveMode() {
		return this.driveMode;
	}
	
	void display() {
		super.display();
		
		System.out.println("Car has Power Steering: "+this.hasPowerSteering);
		System.out.println("Drive Mode: "+this.driveMode);
		System.out.println("Parking Assistance: "+this.parkingAssistance);
	}
}
//Car class ends here

class Bus extends Vehicle{
	int passengerCapacity;
	int standingCapacity;
	
	Bus(){
		
	}
	Bus(String vehicleNo, String model,String companyName,int noOfVehicles,double price,int passengerCapacity,int standingCapacity){
		super(vehicleNo,model,companyName,noOfVehicles,price);
		this.passengerCapacity= passengerCapacity;
		this.standingCapacity= standingCapacity;
	}
	
	void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity= passengerCapacity;
	}
	
	int getPassengerCapacity() {
		return this.passengerCapacity;
	}
	
	void setStandingCapacity(int standingCapacity) {
		this.standingCapacity = standingCapacity;
	}
	
	int getStandingCapacity() {
		return this.standingCapacity;
	}
	
	void display() {
		super.display();
		System.out.println("Passenger Capacity: "+this.passengerCapacity);
		System.out.println("Standing Capacity: "+this.standingCapacity);
	}
	
	
}
//class Bus ends here

public class Test {
   public static void main(String[] args) {
	
	   Bike b1 = new Bike("Mh20CN5057","Discover","Bajaj",2,60000,1,1,"Sports");
	   Car c1 = new Car("Mh20GY4996","Harrier","TaTa",4,1500000,true,"AutoMatic",4);
	   Bus b= new Bus("Mh12JK7788","StarBus","TaTa",6,1800000,40,10);
	   
	  
	   b1.display();
	   System.out.println();
	   c1.display();
	   System.out.println();
	   b.display();
}
}
