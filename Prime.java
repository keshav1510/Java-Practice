public class Prime{
public static void main(String [] args){
int n = 11;
int var = 0;
for(int  i = 2; i<=n-1; i++){
if(n%i == 0){
var = var+1;
}
if(var>0){
System.out.println("It is not a prime number");
}
else{
System.out.println("It is a prime number");
}
}
}
}