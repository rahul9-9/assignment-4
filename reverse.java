import java.util.Scanner;
class reverse {

    public static void main(String[] args) {

        int x, y = 0;
Scanner s=new Scanner(System.in);
       System.out.println("enter number");
x=s.nextInt();
while(x != 0) {
            int z = x % 10;
            y=y * 10 + z;
            x /= 10;
        }

        System.out.println("reverse number"+y);
    }
}