//Implement setters, getters. display method
class BankAccount
{
  int accountNumber;
  String holderName;
  double currentBalance;
  double interestRate;
 
void setAccountNumber(int num)
{
   this.accountNumber= num;
}

void setHolderName(String str)
{
  this.holderName= str;
}

void setCurrentBalance(double balance)
{
  this.currentBalance= balance;
}

void setInterestRate(double rate)
{
  this.interestRate= rate;
}

int getAccountNumber(int num)
{
  return this.accountNumber;
}

String getHolderName(String str)
{
  return this.holderName;
}

double getcurrentBalance(double balance)
{
  return this.currentBalance;
}

double getInterestRate(double rate)
{
  return this.interestRate;
}

void display()
{
  System.out.println(this.accountNumber+"/"+this.holderName+"/"+this.currentBalance+"/"+this.interestRate);
}
}

class BankAcc
{
 public static void main(String [] args)
{
  BankAccount b1 = new BankAccount();

  b1.setAccountNumber(101);
  b1.setHolderName("Rohit Pawar");
  b1.setCurrentBalance(50000);
  b1.setInterestRate(10000);
  

  b1.display();

}
}