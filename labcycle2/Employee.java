import java.util.*;

class Employee 
{
int eNo;
String eName;
float eSalary;
 
public void getdata() 
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the employee number : ");
eNo=s.nextInt();
System.out.println("Enter the employee name : ");
eName=s.next();
System.out.println("Enter the employee salary : ");
eSalary=s.nextFloat();
} 
public void display() 
{
System.out.println("\nEmployee number : " +eNo);
System.out.println("Employee name : " +eName);
System.out.println("Employee salary : " +eSalary);
}
public static void main(String args[]) 
{
int n=0;
Scanner s1 = new Scanner(System.in);
System.out.println("Enter the limit :");
n=s1.nextInt();
Employee e[]=new Employee[n];
for(int i=0; i<n; i++) 
{
e[i]=new Employee();
e[i].getdata();
}
System.out.println("\nEMPLOYEE DETAILS");
for(int i=0; i<n; i++) 
{
e[i].display();
}
}
}