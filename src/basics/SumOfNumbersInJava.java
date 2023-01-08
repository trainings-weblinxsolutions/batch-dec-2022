package basics;
public class SumOfNumbersInJava{
public static void main(String []args) {



int sum = 0;
// Sum of first 10 numbers
for(int i = 1 ; i <= 10 ; i++){

sum = sum+i;

}
System.out.println(sum);



//sum of even numbers in the range 1 to 10
sum = 0;
for(int i = 1 ; i <= 10 ; i++){

if(i % 2 == 0 ){
	sum = sum+i;
	}

}
System.out.println(sum);

//sum of odd numbers in the range 1 to 10
sum = 0;
for(int i = 1 ; i <= 10 ; i++){

if(i % 2 != 0 ){
	sum = sum+i;
	}

}
System.out.println(sum);

}

}