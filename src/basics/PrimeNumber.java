public class PrimeNumber{
public static void main(String []args) {


int number = 48;
boolean isPrime = true;

for(int i=2 ; i< number; i++){

if(number % i == 0){
isPrime = false;
break;
}
}


if(isPrime){
System.out.println("Prime");
}
else{
System.out.println("Not Prime");

}




/* Wont work for numbers that are not prime
for(int i=2 ; i< number; i++){

if(number % i == 0){
System.out.println("Not Prime");

}
else{
System.out.println("Prime");
break;

}


}


*/








/* Wont work for numbers that are not prime

if(number % 1 == 0 && number % number == 0 ){
System.out.println("Prime");
}
else{
System.out.println("Not Prime");
}
*/


}
}