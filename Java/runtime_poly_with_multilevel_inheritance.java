class a
{
	void m()
	{
		System.out.println("Hello");
	}
	
}

class b extends a
{
	void m()
	{
		System.out.println("Hello!");
	}
	
}

class c extends b
{
	void m()
	{
		System.out.println("Hello!!");
	}
	
}

class runtime_poly_with_multilevel_inheritance
{
	public static void main(String a[])
	{
		a ob = new a();
		a ob1 = new b();
		a ob2 = new c();
		
		ob.m();
		ob1.m();
		ob2.m();
	}
}