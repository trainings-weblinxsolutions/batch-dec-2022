package basics;
public class ScopeOfVariables {
   public static void main(String []args) {
   int x =100;
   
   if(x > 10){
   	int y=20;
   	System.out.println(x+y);
   
   }
   
 //  	System.out.println(x+y); -- This won't work, y is not in scope
   
   
   
   
   
   }


}
