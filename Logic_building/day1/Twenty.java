class Twenty
{
	public static void main(String []args)
	{
		int n = 123456;
		int n1=n;
		int count =0;
		while(n1>0)
		{
			count++;
			n1=n1/10;
		}
		System.out.println("The number "+n+" has "+count+" digits.");
	}
}
