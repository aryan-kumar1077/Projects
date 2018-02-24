class top
{
	top()
	{
		System.out.println("hello");
	}
}

class lower extends top
{
	lower()
	{
		super();
	}
}

class supermethod
{
	public static void main(String[] a)
	{
		lower obj = new lower();
	}
}