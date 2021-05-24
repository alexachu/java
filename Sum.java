import java.io.*;
class Sum
{
	public static void main(String args[]) throws Exception

{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the first number:");
int a=Integer.parseInt(br.readLine());
System.out.println("Enter the second number:");
int b=Integer.parseInt(br.readLine());
System.out.println("Sum is:"+(a+b));
}
}