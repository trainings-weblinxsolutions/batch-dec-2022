package arrays;

public class ArrayExample{
public static void main(String []args) {



int student1_marks[] = new int[5];
int []student2_marks = new int[5];
// variable declaration //allocating memory;


int a;
a= 10;

int student3_marks[];

student3_marks = new int[5];


student1_marks[0]=10;
student1_marks[1]=12;
student1_marks[2]=15;
student1_marks[3]=18;
student1_marks[4]=20;


student2_marks[0]=10;
student2_marks[1]=20;
student2_marks[2]=10;
student2_marks[3]=15;
student2_marks[4]=20;


student3_marks[0]=11;
student3_marks[1]=12;
student3_marks[2]=13;
student3_marks[3]=14;
student3_marks[4]=15;



int student4_marks[] = {12,1,5,18,20,65,23,12,87,43,2,3,12,67};
//variable declaration // {,,} to directky assign value

System.out.println(student1_marks[0]);
System.out.println(student2_marks[0]);
System.out.println(student3_marks[0]);
System.out.println(student4_marks[0]);



System.out.println(student3_marks.length);












}

}