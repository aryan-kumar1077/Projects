class labbledbreak
{
	public static void main(String a[])
	{
		int n,i;
		outer:for(n=0;n<=4;n++)
		{
			inner:for(i=4;i<=7;i++)
			{
				if(i==6)
				break outer;
			    System.out.println(i);
			}
			System.out.println("Hello!");
		}
	}
}