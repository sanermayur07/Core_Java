//Create these classes in Java and create one object in the main method.
class Employee
{
  int id;
  String name;
  double salary;

void display()
{
  System.out.println("ID: "+ id);
  System.out.println("Name: "+ name);
  System.out.println("Salary: "+ salary);
}
}

class EmpDetail
{
  public static void main(String [] args)
{
   Employee e1 = new Employee();
   
   e1.id = 101;
   e1.name = "Mayur";
   e1.salary = 50000;

  e1.display();

}
}

