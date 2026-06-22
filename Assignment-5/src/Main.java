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


// main class 
public class Main 
{
   public static void main( String [] args){

   Admin a1= new Admin(101,"Rahul",50000,5000);
   SalesManager s1 = new SalesManager(107,"Harshal",40000,20000,100000);
   Hr h1= new Hr(3,"Aditya",60000,30000);
   
   System.out.println("=====Admin Details=====");
   a1.display();
   
   System.out.println("=====Sales Manager Details======");
   s1.display();
   
   System.out.println("======HR Details========");
   h1.display();

}
}
   

