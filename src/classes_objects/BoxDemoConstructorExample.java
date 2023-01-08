package classes_objects;

class Box1 {
  double width;
  double height;
  double depth;
  
  
  
   Box1() {
    System.out.println("Constructing Box");
    width = 10;
    height = 10;
    depth = 10;
	}


  double volume() {
    return width * height * depth;
  }
  
   





}


class BoxDemoConstructorExample {
  public static void main(String args[]) {
    Box1 mybox = new Box1();
    System.out.println(mybox.volume());
    
    
      Box1 mybox1 = new Box1();
    System.out.println(mybox1.volume());
    

   
   
  }
}
