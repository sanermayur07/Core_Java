//Implement setters, getters. display method
class PlacedStudent
{
 int frn;
 String studentName, companyName,designation;
 double distanceCovered;

void setFrn(int frn)
{
  this.frn = frn;
}

void setStudentName(String str)
{
  this.studentName= str;
}

void setDistanceCovered(double dist)
{
  this.distanceCovered= dist;
}

void setCompanyName(String comp)
{
  this.companyName= comp;
}

void setDesignation(String desg)
{
  this.designation= desg;
}
 
int getFrn(int frn)
{
  return this.frn;
}

String getStudentName(String str)
{
  return this.studentName;
}

double getDistanceCovered(double dist)
{
   return this.distanceCovered;
}

void display()
{
  System.out.println(this.frn+"/"+this.studentName+"/"+this.distanceCovered+"/"+this.companyName+"/"+this.designation);
}
}

class PlacedStud
{
public static void main(String[] args)
{

  PlacedStudent p1 = new PlacedStudent();

  p1.setFrn(011);
  p1.setStudentName("Mayur");
  p1.setDistanceCovered(250);
  p1.setCompanyName("Capgemini");
  p1.setDesignation("Software Developer");

  p1.display();

}

}