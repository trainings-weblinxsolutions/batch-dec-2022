package inheritance;

class ArithmeticUtilsDemo{
 public static void main(String args[]) {
   
   
   ArithmeticUtils obj = new ArithmeticUtils();
   
   int res = obj.add(2,3);
   System.out.println(res);
   
   
   
	} 

}

class ArithmeticUtils
{
    int add(int a, int b)    // LINE A
    {
        return a + b;
    }
    
/*    int add(int c, int d)    // LINE 21 -- compileation error
    {
        return c + d;
    } */

    int add(int a, int b, int c) // LINE B
    {
        return a + b + c;
    }

    double add(double a, double b, double c) // LINE C
    {
        return a + b + c;
    }

    int multiply(int a, int b)
    {
        return a * b;
    }

    int multiply(int a, int b, int c)
    {
        return a * b * c;
    }


	double add(int a, double b)
	{
    	return a + b;
	}

	double add(int a, double b, int c, double d)
	{
    return a + b + c + d;
	}
}