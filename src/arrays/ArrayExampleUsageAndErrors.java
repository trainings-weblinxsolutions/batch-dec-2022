package arrays;

public class ArrayExampleUsageAndErrors{
public static void main(String []args) {

int marks[] = new int[5];
marks[0]=10;
marks[3]=18;
marks[4]=20;


System.out.println(marks[3]);

//System.out.println(marks[10]); -- error, ArrayIndexOutOfBoundsException


System.out.println(marks[1]);

marks[1]=15;

System.out.println(marks[1]);


//System.out.println(marks[-1]); -- -- error, ArrayIndexOutOfBoundsException


}

}