class wrapper_class
{
	public static void main(String a[])
	{
	int i=100;
    Integer j = Integer.valueOf(i);
    Integer ab=i;//Autoboxing
    System.out.println(ab);

	
    Integer k = new Integer(100);
	int y= k.intValue();
	int x=k;//Unboxing
	System.out.println(x);
	}
}