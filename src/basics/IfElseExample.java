package basics;
public class IfElseExample {
   public static void main(String []args) {
   
   int a =  10;
   int b = 5;
   
   
   // Basic if else
   if(a > b) {
   	System.out.println("Exp is true");
   	//
   	//
   	///
   	///
   }
   
   else{
      	System.out.println("Exp is false");
   }
   
   
   // Nested if's
   
   if( 18 > 9){
   		
   		if (15 > 10){
   			if(10 > 5){
   			
   				if( 5 > 4){
   						System.out.println("Nested if example, 5 > 4");
   				}
   				
   			}
   		
   		}	
   	
   }
   
   
   // if else example, brackets needed or not
   
   if(10 > 5){
   	System.out.println("Exp is true");
   	}
   else{
   System.out.println("Exp is false");
   }
   
   //if else ladder
   
   
   if( 18 > 9 ){
   
   	if(5 > 7) {
   		
   	}
   	else{
   	System.out.println("5 not greater than 7 ");
   	
   	}
   
   }
   else{
    System.out.println("Not true");
   }
   
   
   
   
	int month = 4; // April
    String season;
    if(month == 12 || month == 1 || month == 2)
      season = "Winter";
    else if(month == 3 || month == 4 || month == 5)
      season = "Spring";
    else if(month == 6 || month == 7 || month == 8)
      season = "Summer";
    else if(month == 9 || month == 10 || month == 11)
      season = "Autumn";
    else
      season = "Bogus Month";
    System.out.println("April is in the " + season + ".");

   

   
   
   
   
}
}