public class IterationStatementsFor{
 public static void main(String []args) {
 
 /*
   System.out.println(1);
   System.out.println(2);
   System.out.println(3);
   System.out.println(4); 
   System.out.println(5);
   System.out.println(6);
   System.out.println(7);
   System.out.println(8);
   System.out.println(9); 
   System.out.println(10); 
*/   

System.out.println("Printing from 1 to 10"); 
for(int i = 1 ; i < 11 ; i++){
 System.out.println(i); 
}
System.out.println("Done"); 


System.out.println("Printing from 10 to 1"); 

for(int i=10 ;i >=1 ; i--){
 System.out.println(i); 

}
System.out.println("Done"); 


/* We can skip the 2 parameters, but it might lead to an infinite loop which we should avoid
for(int i=5 ; ; ){
 System.out.println(i);


}
 */
 
System.out.println("Printing from 1 to 10"); 
for(int i = 1 ; i <=10 ; i * 2){
 System.out.println(i); 
}
System.out.println("Done");  
 
 }

}