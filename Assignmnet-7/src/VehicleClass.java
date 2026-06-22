abstract class Vehicle {
	String vehicleNo;
	String model;
	String companyName;
	int noOfWheels;
	double price;
	
	 Vehicle() {
		 
	 }
	 
	Vehicle(String vehicleNo, String model, String companyName, int noOfWheels, double price) {
		this.vehicleNo = vehicleNo;
		this.model = model;
		this.companyName = companyName;
		this.noOfWheels = noOfWheels;
		this.price = price;
	}
	
	abstract void Brake();
	
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
    	System.err.println("Price: "+this.price);
    }
	
}

class Bike extends Vehicle{
	int noOfStands;
	int noOfHelmet;
	String bikeCategory;
	
	Bike() {
		super();
	}

	Bike(String vehicleNo, String model, String companyName, int noOfWheels, double price, int noOfStands,int noOfHelmet, String bikeCategory) {
		super(vehicleNo, model, companyName, noOfWheels, price);
		
		this.noOfStands = noOfStands;
		this.noOfHelmet = noOfHelmet;
		this.bikeCategory = bikeCategory;
	}

	void Brake() {
		System.out.println("Bike is applying Disc brake....");
	}
	
	int getNoOfStands() {
		return noOfStands;
	}

	void setNoOfStands(int noOfStands) {
		this.noOfStands = noOfStands;
	}

	int getNoOfHelmet() {
		return noOfHelmet;
	}

	void setNoOfHelmet(int noOfHelmet) {
		this.noOfHelmet = noOfHelmet;
	}

	String getBikeCategory() {
		return bikeCategory;
	}

	void setBikeCategory(String bikeCategory) {
		this.bikeCategory = bikeCategory;
	}
	
	void display() {
		super.display();
		
		System.out.println("No of Stands: "+this.noOfStands);
		System.out.println("No of Helmet: "+this.noOfHelmet);
		System.out.println("Bike Category: "+this.bikeCategory);
	}
	
	
}

class Car extends Vehicle{
	String hasPowerSteering;
	String driveMode;
	int parkingAssistance;
	
	Car() {
		super();
	}

	Car(String vehicleNo, String model, String companyName, int noOfWheels, double price, String hasPowerSteering, String driveMode, int parkingAssistance) {
		super(vehicleNo, model, companyName, noOfWheels, price);
		
		this.hasPowerSteering = hasPowerSteering;
		this.driveMode = driveMode;
		this.parkingAssistance = parkingAssistance;
	}

	void Brake() {
		System.out.println("Car is applying ABS brake....");
	} 
	
	String getHasPowerSteering() {
		return hasPowerSteering;
	}

	void setHasPowerSteering(String hasPowerSteering) {
		this.hasPowerSteering = hasPowerSteering;
	}

	String getDriveMode() {
		return driveMode;
	}

	void setDriveMode(String driveMode) {
		this.driveMode = driveMode;
	}

	int getParkingAssistance() {
		return parkingAssistance;
	}

	void setParkingAssistance(int parkingAssistance) {
		this.parkingAssistance = parkingAssistance;
	}
	
	void display() {
		super.display();
		
		System.out.println("Has Power Steering: "+this.hasPowerSteering);
		System.out.println("Drive Mode: "+this.driveMode);
		System.out.println("Parking Assistance: "+this.parkingAssistance);
	}
	
}

class Bus extends Vehicle{
	int passengerCapacity;
	int standingCapacity;
	
	Bus() {
		super();
	}

	Bus(String vehicleNo, String model, String companyName, int noOfWheels, double price, int passengerCapacity, int standingCapacity) {
		super(vehicleNo, model, companyName, noOfWheels, price);
		
		this.passengerCapacity = passengerCapacity;
		this.standingCapacity = standingCapacity;
	}

	void Brake() {
		System.out.println("Bus is applying Air brake....");
	}
	
	int getPassengerCapacity() {
		return passengerCapacity;
	}

	void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

	int getStandingCapacity() {
		return standingCapacity;
	}

	void setStandingCapacity(int standingCapacity) {
		this.standingCapacity = standingCapacity;
	}
	
	void display() {
		super.display();
		
		System.out.println("Passenger Capacity: "+this.passengerCapacity);
		System.out.println("Standing Capacity: "+this.standingCapacity);
	}
	
}
public class VehicleClass {
	public static void main(String[] args) {
		
		Vehicle v1;
		
		v1 = new Bike("MH20CN5057","Pulsor","Bajaj",4,400000,2,2,"Sports");
		v1.display();
		v1.Brake();
		
		
		
	}

}
