import java.util.Scanner;
class armstrong
{
public static void main(String[] args)
{
int f,z,x=0;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
f=n;
while(n>0)
{
z=n%10;
n=n/10;
x=x+(z*z*z);
}
if(f==x)
{
System.out.print("armstrong");
}

else
System.out.print("NOT");
}
}