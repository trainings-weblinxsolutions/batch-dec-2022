package basics;
public class ShortCircuit {
   public static void main(String []args) {
   
   int c = 2;
   int e = 90;
   int d=0;
   
   
   if(c==1 && e++ < 100) {
	   d = 100;
   }
   
   System.out.println(d);
   System.out.println(e);
   
   
   
   }
   }
   

