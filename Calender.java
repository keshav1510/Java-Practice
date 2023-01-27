import java.util.Scanner;
public class Calender{
public static void main(String[]args){
int i;
System.out.println("enter a number");
Scanner s = new Scanner(System.in);
i = s.nextInt();
switch (i) {
case 1:
System.out.println("jan ");
break;
case 2:
System.out.println("feb ");
break;
case 3:
System.out.println("mar ");
break;
}
}
}