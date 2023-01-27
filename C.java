class Aabb{
 public void sum(){
System.out.println("inside a");
}
}
class B extends Aabb{
public void sum(){
System.out.println("Inside b");
}
}
public class C{
public static void main(String[]args){
B b1 = new B();
b1.sum();
}
}