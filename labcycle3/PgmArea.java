import java.util.Scanner;
class DemoArea
{
	float area(float a,float pi)
     {
        float ar = pi*a*a;
        return ar;
    }
	int area(int a)
    {
        int ar = a*a;
         return ar;
    }
    int area(int a,int b)
    {
        int ar = a*b;
        return ar;
    }
    double area(double a,double b)
    {
        double ar = (a*b)/2;
        return ar;
    }
}
public class PgmArea
{
	public static void main(String args[])
	{
		float r;
        int s,a,b;
        double h,j;
        System.out.println("Enter Radius of circle:");
        Scanner input = new Scanner(System.in);
        r = input.nextFloat();
        System.out.println("Enter Side of square:");
        s = input.nextInt();
        System.out.println("Enter length and breadth of rectangle:");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("Enter height and base of triangle:");
        h = input.nextDouble();
        j = input.nextDouble();
        DemoArea od=new DemoArea();
        float res=od.area(r,3.142f);
        System.out.println("Area of Circle= "+ res);
        res=od.area(s);
        System.out.println("Area of Square= "+res);
        res=od.area(a,b);
        System.out.println("Area of Rectangle= "+ res);
        double res2=od.area(h,j);
        System.out.println("Area of Triangle= "+ res2);
	}
}