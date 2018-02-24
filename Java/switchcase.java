import java.util.Scanner;
class switchcase
{
public static void main(String args[])
{
int a,b,c;
char d;
Scanner x = new Scanner(System.in);
System.out.print("Enter the value of a = ");
a=x.nextInt();
System.out.print("Enter the value of b = ");
b=x.nextInt();
System.out.print("Enter your expression = ");
d=x.next().charAt(0);
switch(d)
{
 case '+':
   c=a+b;
   System.out.print("Sum of your number is = "+c);
   break;

 case '-':
   c=a-b;
   System.out.print("Sub of your number is = "+c);
   break;

 case '*':
   c=a*b;
   System.out.print("Mul of your number is = "+c);
   break;

 case '/':
   c=a/b;
   System.out.print("Div of your number is = "+c);
   break;

 default:
   System.out.print("Enter the expression.");   
}
}
}