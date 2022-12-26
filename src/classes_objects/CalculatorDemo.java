class Calculator{


int square(int num){
return num*num;

}


/*
int add(int num1, int num2){

return num1+num2;

}*/


int add(int num1, int num2,int num3){

return num1+num2+num3;

}

double add(double num1, double num2){

return num1+num2;

}


}

class CalculatorDemo{

 public static void main(String args[]) {
 
 Calculator c = new Calculator();
 
 
/*int result = c.square(10);
System.out.println(result);*/


//int sum = c.add(10,12);
System.out.println(c.add(10,12));

int sum = c.add(10,12,13);
System.out.println(sum);

double sum_d = c.add(10.5 , 11.5);
System.out.println(sum_d);

 
 
 }
}