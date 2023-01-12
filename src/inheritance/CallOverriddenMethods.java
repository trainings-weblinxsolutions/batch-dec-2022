package inheritance;

public class CallOverriddenMethods {
	public static void main(String[] args) {
        A2 a = new A2();
        a.print();
        
        B2 b = new B2();
        b.print();
        
        C2 c = new C2();
        c.print();
        
        System.out.println("-----------------");
        A2 a2 = b; 
        a2.print();
        
        System.out.println("-----------------");
        B2 b2 = c; // LINE B
        b2.print();
        
        System.out.println("-----------------");
        A2 a3 = c; // LINE C
        a3.print();




	}

}
class A2
{
    void print()
    {
        System.out.println("Print method in class A2 called");
    }
}

class B2 extends A2
{
    void print()
    {
        System.out.println("Print method in class B2 called");
    }
}

class C2 extends B2
{
    void print()
    {
        System.out.println("Print method in class C2 called");
    }
}
