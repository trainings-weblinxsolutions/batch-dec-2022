package arrays;

public class ArrayExampleUsage{
public static void main(String []args) {

int marks[] = new int[5];
marks[0]=10;
marks[1]=10;
marks[2]=15;
marks[3]=18;
marks[4]=20;



// give the sum of all the marks
int sum  = marks[0] + marks[1] + marks[2] + marks[3] + marks[4] ;
System.out.println(sum);


int age[]={12,18,14,15,17,19,14,15,18,20,22,15,16,32,14,16,12,19,23,22,14};

//give me the sum of the array using for loop
int total_sum=0;
for(int i=0;i<age.length;i++){
total_sum = total_sum + age[i];
}
System.out.println(total_sum);




}
}
