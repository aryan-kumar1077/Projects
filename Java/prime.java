class prime
{
	public static void main(String a[])
	{
		int i=229,n;
		for(n=2;n<=(i-1);n++)
		{
			if(i%n==0)
			{
				System.out.println("not Prime");
				break;
			}
			else
			{
				System.out.println("Prime");
				break;
			}
		}
	}
}