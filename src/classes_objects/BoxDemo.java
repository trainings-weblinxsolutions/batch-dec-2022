package classes_objects;

class Box {
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



}


class BoxDemo {
  public static void main(String args[]) {
    Box mybox = new Box();
    // assign values to mybox's instance variables
    mybox.width = 10;
    mybox.height = 20;
    mybox.depth = 15;
    
    System.out.println("Width : "+mybox.width);
    System.out.println("height : "+mybox.height);
    System.out.println("depth : "+mybox.depth);
    

    
//     compute volume of box
	/*double vol;
    vol = mybox.width * mybox.height * mybox.depth;
   System.out.println("Volume is " + vol);*/
   //mybox.volume();
   double vol = mybox.volume();
   System.out.println(vol);
   
   
   Box mybox2 = new Box();
       /* assign different values to mybox2's
       instance variables */
    mybox2.width = 3;
    mybox2.height = 6;
    mybox2.depth = 9;
      System.out.println("Width : "+mybox2.width);
    System.out.println("height : "+mybox2.height);
    System.out.println("depth : "+mybox2.depth);
  //  vol = mybox2.width * mybox2.height * mybox2.depth;
//   System.out.println("Volume is " + vol);
    //mybox2.volume();
       vol = mybox2.volume();
   System.out.println(vol);
   
   
   
    Box mybox3 ;
    mybox3= new Box();
       /* assign different values to mybox3's
       instance variables */
    mybox3.width = 10;
    mybox3.height = 5;
    mybox3.depth = 3;
      System.out.println("Width : "+mybox3.width);
    System.out.println("height : "+mybox3.height);
    System.out.println("depth : "+mybox3.depth);
  //  vol = mybox3.width * mybox3.height * mybox3.depth;
//   System.out.println("Volume is " + vol);
   
// mybox3.volume();
 
    vol = mybox3.volume();
   System.out.println(vol);
   
   
  }
}
