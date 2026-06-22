//Implement both constructors (default & parameterized)
class Date
{
  int day;
  int month;
  int year;
  String dow;

Date()   //default constructor
{
  day = 22;
  month = 07;
  year = 2004;
  String dow = "Tuesday";
}

Date(int day, int month, int year, String dow)       // parameterized constructor
{
   this.day = day;
   this.month = month;
   this.year = year;
   this.dow = dow;
}


//setter
void setDay(int day)
{
   this.day = day;
}

void setMonth(int month)
{
   this.month = month;
}

void setYear(int year)
{
   this.year = year;
}

void setDow(String dow)
{
   this.dow = dow;
}

//getter
int getDay()
{
  return day;
}

int getMonth()
{ 
   return month;
}

int getYear()
{
  return year;
}

String getDow()
{
  return dow;
}

void display()
{
   System.out.println("Day: " + day);
   System.out.println("Month: " + month);
   System.out.println("Year: " + year);
   System.out.println("Dow: " + dow);
}
}

class DateDetail
{
  public static void main(String [] args)
{

  Date d1 = new Date();

  d1.setDay(11);
  d1.setMonth(06);
  d1.setYear(2026);
  d1.setDow("Saturday");

  d1.display();

}
}






