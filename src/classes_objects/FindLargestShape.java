class FindLargestShape
{
    public static void main(String arg[])
    {
        Rectangle r = new Rectangle(10, 8);
        Square s = new Square(7);
        Circle c = new Circle(12);
        
        System.out.println("Rectangle Area : " + r.getArea());
        System.out.println("Square Area : " + s.getArea());
        System.out.println("Circle Area : " + c.getArea());
        System.out.println();
        
        if ((r.getArea() > c.getArea()) && (r.getArea() > s.getArea()))
        {
            System.out.println("Rectangle has the largest area.");
        }
        else if( s.getArea() > c.getArea() )
        {
            System.out.println("Square has the largest area.");
        }
        else
        {
            System.out.println("Circle has the largest area.");
        }    
    }
}


class Rectangle
{
    double length;
    double breadth;

    Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea()
    {
        return length * breadth;
    }
}


class Square
{
    double side;

    Square(double side)
    {
        this.side = side;
    }

    double getArea()
    {
        return side * side;
    }
}


class Circle
{
    double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }

    double getArea()
    {
        return (22.0/7.0) * radius * radius;
    }
}
