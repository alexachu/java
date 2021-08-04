import java.util.*;
class StringMan
{
public static void main(String args[]) 
{
String str,str1,str2,str3,r,t;
char c;
int p,q,ch,n;
Scanner s = new Scanner(System.in);
System.out.println("STRING MANIPULATION");
System.out.println("\n1.Create new string\n2.Getting a string length\n3.String concatenation\n4.Character extraction\n5.String comparision\n6.Searching substrings\n7.modifying a string\n8.data conversion using valueOf()");

do
{
System.out.println("Enter your choice :");
ch=s.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter any string : ");
str=s.next();
String s1 = new String(str);
System.out.println("New string : "+s1);
break;
	
case 2:
System.out.println("Enter any string : ");
str=s.next();
System.out.println("Length of string : " + str.length());
break;
	
case 3:
System.out.println("Enter 1st string : ");
str1=s.next();
System.out.println("Enter 2nd string : ");
str2=s.next();
str3=str1.concat(str2);
System.out.println("Concatenation using concat() : "+str3);
break;
	
case 4:
System.out.println("Enter any string : ");
str=s.next();
System.out.println("Enter the position :");
p=s.nextInt();
c=str.charAt(p);
System.out.println("Character extraction : "+c);
break;
	
case 5:
System.out.println("Enter 1st string : ");
str1=s.next();
System.out.println("Enter 2nd string : ");
str2=s.next();
System.out.println("String comparsion : "+str1.compareTo(str2));
break;
	
case 6:
System.out.println("Enter any string : ");
str=s.next();
System.out.println("Enter the position of substring :");
q=s.nextInt();
System.out.println("Searching substrings : "+str.substring(q));
break;
	
case 7:
System.out.println("Enter any string : ");
str1=s.next();
System.out.println("Enter the character to be replaced :");
r=s.next();
System.out.println("Enter the character to be replaced with :");
t=s.next();
str2=str1.replace(r,t);
System.out.println("Replacing strings : "+str2);
break;

case 8:
System.out.println("Enter any number : ");
n=s.nextInt();
str=String.valueOf(n);
System.out.println("Data conversion using valueOf() : "+str);
break;

case 9:
System.out.println("Exiting!!");
break;

default:
System.out.println("Invalid choice !!!");
break;
}
}
while(ch!=9);
}
}