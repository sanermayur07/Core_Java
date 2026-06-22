//Create these classes in Java and create one object in the main method.
class Date
{
  int day,month,year;
  String dow;

void display()
{
  System.out.println("Day: "+ day);
  System.out.println("Month: "+ month);
  System.out.println("Year: "+ year);
  System.out.println("DOW: "+ dow);
}
}

class Demo
{
  public static void main(String []args)
{
   Date d1= new Date();
   
   d1.day = 7;
   d1.month = 6;
   d1.year = 2003;
   d1.dow = "Saturday";
  
   d1.display();

}
}