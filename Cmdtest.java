class Cmdtest
{
	public static void main(String arg[])
	{
		System.out.println(arg[0]);
		System.out.println(arg[1]);
		System.out.println(arg[2]);
		int sum=Integer.parseInt(arg[0])+Integer.parseInt(arg[1])+Integer.parseInt(arg[2]);
		int count=arg.length;
		System.out.println("no of values:"+count+"and the sum is:"+sum);
	}
}