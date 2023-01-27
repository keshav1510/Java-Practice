class Adder{

int add(int a,int b){
return a+b;
}
int add(int a, int b, int c){
return a+b+c;
}
public static void main(String[] args){
Adder a1 = new Adder();
int a = 34;
int b = 43;
int c = 22;

System.out.println(a1.add(a,b));
System.out.println(a1.add(a,b,c));


}

}
