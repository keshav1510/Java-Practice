import java.util.Scanner;
public class Fabonacci{
public static void main(String[]args){
int max,a=0,b=1,c;
System.out.print("Enter the max value");
Scanner sc= new Scanner(System.in);
max=sc.nextInt();
for(int i=2;i<6;i++){
System.out.print(a);
c=a+b;
a=b;
b=c;
}
}
}