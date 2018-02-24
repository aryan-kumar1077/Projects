class a
{
    int i=10;
}

class b extends a
{
    int i=20;
}

class runtime_poly_with_data_member
{
    
	public static void main(String a[])
	{
        a ob = new b();
       
		System.out.println(ob.i);
	}
}