//Implement the arithmatic operations using function overloading:
class Calculator
{
  // Addition
 int add(int a, int b)
{
   return a + b;
}
 
double add(double a, double b)
{
   return a + b;
}
 
double add(int a, double b)
{
   return a + b;
}

double add(double a, int b)
{
   return a + b;
}

// Substraction
int sub(int a, int b)
{
   return a-b;
}

double sub(double a, double b)
{ 
   return a-b;
}

double sub(int a, double b)
{
   return a-b;
}

double sub(double a , int b)
{
    return a-b;
}

//Multiplication
int mul(int a, int b)
{
    return a*b;
}

double mul(double a , double b)
{
   return a*b;
}

double mul(int a, double b)
{
    return a*b;
}

double mul(double a, int b)
{  
   return a*b;
}

//Division

int div(int a, int b)
{
   return a/b;
}

double div(double a , double b)
{
    return a/b;
}

double div(int a, double b)
{
   return a/b;
}

double div(double a, int b)
{
   return a/b;
}
}

class CalculatorMain
{
  public static void main(String [] args)
{
    Calculator c = new Calculator();
  
   System.out.println("Addition: "+c.add(10,5));
   System.out.println("Addition: "+c.add(10.5,5.5));
   System.out.println("Addition: "+c.add(10,5.5));
   System.out.println("Addition: "+c.add(10.5,5));

   System.out.println("Substraction: "+c.sub(10,5));
   System.out.println("Multiplication: "+c.mul(10,5));
   System.out.println("Division: "+c.div(10,5));

}
}


  
   
