package classes_objects;

class Box3 {
  double width;
  double height;
  double depth;
  
/*  
  // display volume of a box - without return
  void volume() {
    System.out.print("From class level, Volume is ");
    System.out.println(width * height * depth);
  }*/
   // display volume of a box - with return
  double volume() {
    return width * height * depth;
  }
  
  
    // sets dimensions of box
  void setDim(double w, double h, double d) {
  		System.out.println("In setDim method");
		width = w;
		height = h;
		depth = d; 
		
		}




}


class BoxDemoMethods {
  public static void main(String args[]) {
    Box3 mybox = new Box3();
    // invoke setDim method
   mybox.setDim(10, 20, 15);        

    
    System.out.println("Width : "+mybox.width);
    System.out.println("height : "+mybox.height);
    System.out.println("depth : "+mybox.depth);
    

    

   double vol = mybox.volume();
   System.out.println(vol);
   
   
   Box3 mybox2 = new Box3();
       /* assign different values to mybox2's
           // invoke setDim method */
	 mybox2.setDim(3, 6, 9);
      System.out.println("Width : "+mybox2.width);
    System.out.println("height : "+mybox2.height);
    System.out.println("depth : "+mybox2.depth);

       vol = mybox2.volume();
   System.out.println(vol);
   
   
   
    Box3 mybox3 ;
    mybox3= new Box3();
       /*     // invoke setDim method */
 		mybox3.setDim(10, 5, 3);
      System.out.println("Width : "+mybox3.width);
    System.out.println("height : "+mybox3.height);
    System.out.println("depth : "+mybox3.depth);

 
    vol = mybox3.volume();
   System.out.println(vol);
   
   
  }
}
