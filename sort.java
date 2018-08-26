import java.util.Scanner;
class sort
{
public static void main(String args[])
{
int i,j,k;
int a[]=new int[]{1,1,1,1,0,0,1,0};
for(i=0;i<a.length;i++)
{
for(j=i+1;j<a.length;j++)
{
     if(a[i]>a[j])
      {
          k=a[i];
          a[i]=a[j];
          a[j]=k;
     }
}
System.out.print(a[i]+" ");
}
}
}