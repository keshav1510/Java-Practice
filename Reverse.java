import java.util.Scanner;
public class Reverse{
public static void main(String[]args){
int m; 
System.out.println("Enter a no.");
Scanner s = new Scanner(System.in);

for(int n=s.nextInt(); n>0 ; n = n/10){
m = n%10;
System.out.print("Reverse" + m);

}
}
}