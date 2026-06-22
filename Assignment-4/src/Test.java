class ElectricityBill{
	int customerId;
	String customerName;
	int unitsConsumed;
	
	//static variable
	static double ratePerUnit = 5.0;
	// class member ends here
	
	//default constructor
	ElectricityBill(){
		this.customerId=0;
		this.customerName="not given";
		this.unitsConsumed=0;
	}
	
	//para constructor
	ElectricityBill(int customerId,String customerName,int unitsConsumed){
		this.customerId = customerId;
		this.customerName = customerName;
		this.unitsConsumed = unitsConsumed;
	}
	
	// Static method to update rate
	static void setUpdateRate(double newRate) {
		ratePerUnit = newRate;
	}
	
	// Method to calculate bill
	double calculateBill() {
		return unitsConsumed * ratePerUnit;
	}
	
	//display method
	void display() {
		System.out.println("Customer Id: "+this.customerId);
		System.out.println("Customer Name: "+this.customerName);
		System.out.println("Units Consumed: "+this.unitsConsumed);
		System.out.println("Rate Per Unit: "+this.ratePerUnit);
		System.out.println("Total Bill: "+this.calculateBill());
		System.out.println("------------------------------------");
		
	}
}
//Electricity class ends here

class Test{
	public static void main(String[] args) {
		
		//objects
		ElectricityBill e1 = new ElectricityBill(101,"Mayur",100);
		ElectricityBill e2 = new ElectricityBill(102,"Rahul",150);
		
		//Display bills
		System.out.println("Before Rate Update");
		e1.display();
		e2.display();
		
		//Update rate using static method
		ElectricityBill.setUpdateRate(7.5);
		System.out.println("Updated Bill");
		e1.display();
		e2.display();
		
	}
}