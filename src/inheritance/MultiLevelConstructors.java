package inheritance;

public class MultiLevelConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.println("---------------");
        X x = new X(10);
        System.out.println("---------------");
        Y y = new Y(11, 21);
        System.out.println("---------------");
        Z z = new Z(12, 22, 32);
        System.out.println("---------------");


	}

}
class X
{
    int i;
    X(int i)
    {
        this.i = i;
        System.out.println("Created X");
    }
}
class Y extends X
{
    int j;
    Y(int i, int j)
    {
        super(i);
        this.j = j;
        System.out.println("Created Y");
    }
}
class Z extends Y
{
    int k;
    Z(int i, int j, int k)
    {
        super(i, j);
        this.k = k;
        System.out.println("Created Z");
    }
}
