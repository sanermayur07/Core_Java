//Implement setters, getters. display method 
class Admin
{
  int id;
  String name;
  double salary;
  double allowance;
 
void setId(int id)
{
   this.id= id;
}

void setName(String str)
{
  this.name= str;
}

void setSalary(double sal)
{
  this.salary= sal;
}

void setAllowance(double allow)
{
  this.allowance= allow;
}

int getId(int id)
{
  return this.id;
}

String getName(String str)
{
  return this.name;
}

double getSalary(double sal)
{
  return this.salary;
}

double getAllowance(double allow)
{
  return this.allowance;
}

void display()
{
  System.out.println(this.id+"/"+this.name+"/"+this.salary+"/"+this.allowance);
}
}

class AdminDept
{
 public static void main(String [] args)
{
  Admin a1 = new Admin();

  a1.setId(101);
  a1.setName("Rohit");
  a1.setSalary(50000);
  a1.setAllowance(10000);
  

  a1.display();

}
}
