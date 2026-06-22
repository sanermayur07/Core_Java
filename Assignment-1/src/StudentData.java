//Create object of student class and print hashcode of object.

class Student 
{
  int id;
  String name;
  double distanceCovered;
}   //Student data ends here

class StudentData
{
   public static void main(String [] args)
{
  Student s1 = new Student();
   
   System.out.println(s1);
}
}