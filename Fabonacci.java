import java.util.Scanner;
public class Fabonacci{
public static void main(String[]args){
int max=5,a=0,b=1,c;
System.out.print(a + " " + b);
for(int i=2;i<=max;i++){
c=a+b;
a=b;
b=c;
System.out.print(" " + c);

}
}
}