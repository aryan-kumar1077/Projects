import java.util.Scanner;
class sum
{
public static void main(String args[])
{
int num,y=1,sum=0;

Scanner x = new Scanner(System.in);
System.out.print("Enter your number = ");
num=x.nextInt();

while(y<=num)
{
sum=sum+y;
y++;
}

System.out.print("Sum of your natural number is = "+sum);

}
}