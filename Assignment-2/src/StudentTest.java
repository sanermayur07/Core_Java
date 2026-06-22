//Implement both constructors (default & parameterized)
class Student 
{
  int frn;
  String name;              
  double distanceCovered;

Student()     // default constructor
{
  frn = 11;
  name = "Rahul";
  distanceCovered = 14;
}

Student(int frn, String name, double distanceCovered)       //parameterized constructor
{
  this.frn = frn;
  this.name = name;
  this.distanceCovered = distanceCovered;
}


//setter
void setFrn(int frn)
{
   this.frn = frn;
}

void setName(String name)
{
   this.name = name;
}

void setDistanceCovered(double distanceCovered)
{
   this.distanceCovered = distanceCovered;
}

//getter
int getFrn()
{
   return frn;
}

String getName()
{
   return name;
}

double getDistanceCovered()
{
   return distanceCovered;
}

void display()
{
  System.out.println("FRN: "+ frn);
  System.out.println("Name: "+ name);
  System.out.println("DistanceCovered: "+ distanceCovered);
}
}

class StudentTest
{
  public static void main(String [] args)
{
  
  Student s1 = new Student(101,"Mayur",25.5);
  Student s2 = new Student(201,"Rahul",35.5);

  //s1.setFrn(101);
  //s1.setName("Mayur");
  //s1.setDistanceCovered(25.5);
 
  //s2.setFrn(102);
  //s2.setName("Rahul");
  //s2.setDistanceCovered(35.5);
  

    
  System.out.println("Student 1 Details: ");
  s1.display();
  System.out.println("Student 2 Details: ");
  s2.display();
}
}