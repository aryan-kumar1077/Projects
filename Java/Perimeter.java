class hello
{
  hello(int x,int y,int z)
  {
    System.out.println("Cuboid Surfacce Area: "+((2*x*y)+(2*z*y)+(2*x*z)));
  }
  hello(int z, int a)                
  {
    System.out.println("Rectangle area: " +(z*a));
  }
}

class Perimeter
{
  public static void main(String args[])
  {
    hello p3 = new hello(10,20,30); 
    hello p2 = new hello(30,10);  
  }
}