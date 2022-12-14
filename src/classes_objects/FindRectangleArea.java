package classes_objects;

class FindRectangleArea
{
    public static void main(String arg[])
    {
        Rectangle1 rect = new Rectangle1(10, 5);
        
        System.out.println("Length = " + rect.length);
        System.out.println("Breadth = " + rect.breadth);
        System.out.println("Area = " + rect.getArea());
        System.out.println("Perimeter = " + rect.getPerimeter());
        
        
        
         Rectangle1 rect1 = new Rectangle1(15, 8);
         System.out.println("Length = " + rect1.length);
        System.out.println("Breadth = " + rect1.breadth);
        System.out.println("Area = " + rect1.getArea());
        System.out.println("Perimeter = " + rect1.getPerimeter());
        
         System.out.println("-----------");
        
         Rectangle1 rect2 = new Rectangle1(150, 9);
         System.out.println("Area of rect2 = " + rect2.getArea());
   
        
         Rectangle rect3 = new Rectangle(170, 8);
     
         System.out.println("Area of rect3 = " + rect3.getArea());
        
    
    }
}


class Rectangle1
{
    double length;
    double breadth;

    Rectangle1(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea()
    {
    if(length > 100){
   	 length=100;
    }
    
        return length * breadth;
    }

    double getPerimeter()
    {
        return 2 * (length + breadth);
    }
}
