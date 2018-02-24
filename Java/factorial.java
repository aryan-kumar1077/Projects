import java.util.Scanner;
class factorial
{
public static void main(String args[])
{
int num,y=1,fact=1;

Scanner x = new Scanner(System.in);
System.out.print("Enter your number = ");
num=x.nextInt();

while(y <= num)
{
fact=fact*y;
y++;
}

System.out.print("Factorial of your natural number is = "+sum);

}
}