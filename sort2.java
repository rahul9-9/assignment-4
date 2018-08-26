import java.util.Scanner;
import java.util.Arrays;
class check
{
public static void main(String args[])
{
int i,n,v=1 ;
int a[]=new int[]{1,4,6,7,8,9,10};
Scanner obj=new Scanner(System.in);
System.out.println("Enter element to find");
n=obj.nextInt();
for(i=0;i<a.length;i++)
{
if(a[i]==n)
{
v=0;
}
}
if(v==0)
{
System.out.println("yes it is in the array");
}
else
{
System.out.println("not in the array");
}
}
}