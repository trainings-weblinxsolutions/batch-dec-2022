public class FibonacciSeries{
public static void main(String []args) {

int a = 0;
int b = 1;
System.out.println(a);
System.out.println(b);

for(int c = 0; c<=20; c = a+b  ){

System.out.println(c);
a = b; 
b = c;

}
System.out.println("Done");




}

}