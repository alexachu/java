import java.util.*;

class BankAccount
{
int accno;
String dname, acctype;
double amount,balance;
Scanner s = new Scanner(System.in);

public void getdata() 
{
System.out.println("\nEnter the account number : ");
accno=s.nextInt();
System.out.println("Enter the name of the depositor : ");
dname=s.next();
System.out.println("Enter the type of the account : ");
acctype=s.next();
System.out.println("Enter the balance amount : ");
balance=s.nextDouble();
}

public void deposit()
{
System.out.println("\nAccount balance : "+balance);
System.out.println("\nEnter the amount to be deposited : ");
amount=s.nextDouble();
if (amount>0) 
{
balance+=amount;
}
else
{
System.out.println("Error: invalid amount!!!");
}
}

public void withdrawn()
{
System.out.println("\nAccount balance : "+balance);
System.out.println("\nEnter the amount to be withdrawn : ");
amount=s.nextDouble();
if (amount>0 && amount<balance)
{
balance-=amount;
}
else
{
System.out.println("Error: insufficient balance/invalid amount!!!");
}
}

public void display()
{
System.out.println("\nName of the depositor : "+dname);
System.out.println("Account type : "+acctype);
System.out.println("Account balance : "+ balance);
}

public static void main(String args[])
{
int n=0;
Scanner s1 = new Scanner(System.in);
System.out.print("Enter the limit : ");
n=s1.nextInt();
BankAccount b[]=new BankAccount[n];
for(int i=0; i<n; i++) 
{
b[i]=new BankAccount();
b[i].getdata();
}
System.out.println("\nACCOUNT DETAILS");
for(int i=0; i<n; i++) 
{
b[i].deposit();
b[i].withdrawn();
b[i].display();
}
}
}
