import java.util.Scanner;
public class Primee{
public static void main(String[]args){
int n=11;
int Flag=0;
for(int i=2;i<=n;i++){
if(n%2==0){
Flag++;
break;
}
}
if(Flag==1){
System.out.print("It is not prime");
}
else{
System.out.print("Prime");
}
}
}