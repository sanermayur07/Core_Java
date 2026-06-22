//Implement setters, getters. display method
class HR
{
  int id;
  String name;
  double salary;
  double commission;

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
  this.salary=sal;
}

void setCommission(double comm)
{
  this.commission= comm;
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

double getCommission(double comm)
{
  return this.commission;
}

void display()
{
  System.out.println(this.id+"/"+this.name+"/"+this.salary+"/"+this.commission);
}
}

class HrDept
{
  public static void main(String [] args)
{ 
  HR h1= new HR();

 h1.setId(5);
 h1.setName("IT");
 h1.setSalary(1500000);
 h1.setCommission(60);

 h1.display();

}

}
  

