class Employee
{
  int id;
  String name;
  double salary;

Employee(){
  this.id = 0;
  this.name = "Not Given";
  this.salary = 0;
}

Employee(int id,String name, double salary)
{
  this.id= id;
  this.name= name;
  this.salary= salary;
}

double calSal() {
	return salary;
}

void setId(int id) 
{
   this.id= id;
}

int getId(){
  return this.id;
}

void setName(String name)
{
   this.name= name;
}

String getName()
{
   return this.name;
}

void setSalary(double salary)
{
   this.salary= salary;
}

double getSalary()
{
   return this.salary;
}

void display()
{
   System.out.println("Id: "+this.id);
   System.out.println("Name: "+this.name);
   System.out.println("Salary: "+this.salary);
   System.out.println("Total Salary: "+calSal());
}



}
// Employee class ends here

class Admin extends Employee
{
  int allowance;

Admin(){
super();
this.allowance = 0;
}

Admin(int id, String name, double salary,int allowance)
{
  super(id,name,salary);
  this.allowance = allowance;
}

double calSal() {
	return salary + allowance;
}

void setAllowance(int allowance)
{
  this.allowance= allowance;
}

int getAllowance()
{
   return this.allowance;
}

void display(){
 super.display();
 System.out.println("Allowance: "+this.allowance);
}
}
// Admin class ends here

class SalesManager extends Employee
{
  double incentive;
  double target;

SalesManager()
{
  super();
  this.incentive = 0;
  this.target = 0;
}

SalesManager(int id, String name,double salary,double incentive, double target)
{
  super(id,name,salary);
  this.incentive = incentive;
  this.target = target;
}

double calSal() {
	return salary + incentive;
}

void setIncentive(double incentive)
{
  this.incentive= incentive;
}

double getIncentive()
{
  return this.incentive;
}

void setTarget(double target)
{
  this.target = target;
}

double getTarget()
{
   return this.target;
}

void display()
{
  super.display();
  System.out.println("Incentive: "+this.incentive);
  System.out.println("Target: "+this.target);
}
}
// SalesManager class ends here

class Hr extends Employee
{
  double commission;

Hr()
{
  super();
 this.commission = 0;
}

Hr(int id, String name,double salary,double commission)
{
  super(id, name, salary);
  this.commission = commission;
}

double calSal() {
	return salary + commission;
}

void setCommission(double commission)
{
   this.commission= commission;
}

double getCommssion()
{
    return this.commission;
}

void display()
{
  super.display();
  System.out.println("Commission: "+this.commission);
}
}
//class Hr ends here


public class EmployeeClass {
   public static void main(String[] args) {
	   
	Employee e1;      // Generic Reference
	
	System.out.println("================Emoloyee Details===============");
	e1=new Employee(101,"Sachin",10000);
	e1.display();
	
	System.out.println("===========Sales Manager Details==============");
	e1= new SalesManager(102,"Rahul",20000,2000,400);
	e1.display();
	
	System.out.println("==========Admin Details===================");
	e1=new Admin(103,"Sanket",40000,300);
	e1.display();
	
	System.out.println("=============Hr Details====================");
	e1= new Hr(105,"Aditya",50000,10000);
	e1.display();
}
   
}
