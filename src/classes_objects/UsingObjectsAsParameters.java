package classes_objects;

class Test2 {
int a, b;


       Test2(int i, int j) {
	         a = i;
			 b = j; 
	}
       // return true if o is equal to the invoking object
       boolean equals(Test o) {
         if(o.a == a && o.b == b) 
         return true;
         else 
         return false;
       }
}


class UsingObjectsAsParameters {
       public static void main(String args[]) {
         Test2 ob1 = new Test2(100, 22);
         Test2 ob2 = new Test2(100, 22);
         Test2 ob3 = new Test2(-1, -1);
         System.out.println("ob1 == ob2: " + ob1.equals(ob2));
         
          System.out.println("ob1 == ob3: " + ob1.equals(ob3));
  }
}
