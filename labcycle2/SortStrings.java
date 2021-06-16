import java.util.Scanner;
public class SortStrings
{
    public static void main(String[] args) 
    {
        int n;
        String temp;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number of names you want to enter:");
        n=s.nextInt();
        String str[]=new String[n];
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the names:");
        for(int i=0;i<n;i++)
        {
            str[i]=s1.nextLine();
        }
        for (int i=0;i<n;i++) 
        {
            for (int j=i+1;j<n;j++) 
            {
                if (str[i].compareTo(str[j])>0) 
                {
                    temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
        System.out.print("Sorted Order:\n");
        for (int i=0;i<n;i++) 
        {
            System.out.println(str[i]);
        }
    }
}