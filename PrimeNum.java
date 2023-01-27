
import java.util.Scanner;
class PrimeNum{
public static void main(String[] args){
int n;
int count=0;
System.out.println("Enter a number");
Scanner sc= new Scanner(System.in);
n = sc.nextInt();


for(int i=1; i<=n; i++){
if(n%i==0){
count++;
}
if(count==2){
System.out.println("it is a prime no.");
}
else{
System.out.println("it is not a prime no.");
}
}
}
}