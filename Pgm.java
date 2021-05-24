import java.io.*;
class Pgm
{
	public static void main(String args[]) throws Exception

{
char c;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the Details");
c=(char) br.read();
String str=br.readLine();
System.out.println("Entered character is:"+c);
System.out.println("Entered string is:"+str);
}
}