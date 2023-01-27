import java.util.Scanner;
public class Swap{
public static void main(String[]args){
int a,b;
System.out.println("enter two no.");
Scanner sc= new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.print("after swap"+a+" "+b);
}
}