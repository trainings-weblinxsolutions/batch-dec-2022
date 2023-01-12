package inheritance;

public class RunTimePolymorphism {

	public static void main(String[] args) {

		
        int input = 44;
        
        A3 aref; 
        
        if(input < 10)
        {
            aref = new A3();
        }
        else if(input < 30)
        {
            aref = new B3();
        }
        else
        {
            aref = new C3();
        }
        
        aref.print(); 

        
//        B3 ref = new A3(); This line won't work
		
	}

}
class A3
{
    void print()
    {
        System.out.println("class A3 method called.");
    }
}

class B3 extends A3
{
    void print()
    {
        System.out.println("class B3 method called.");
    }
}

class C3 extends A3
{
    void print()
    {
        System.out.println("class C3 method called.");
    }
}
