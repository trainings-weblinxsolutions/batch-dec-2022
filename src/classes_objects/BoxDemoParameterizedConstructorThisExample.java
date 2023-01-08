package classes_objects;

class Box5 {
  double width;
  double height;
  double depth;
  
  
  
   Box5(double width, double height, double depth) {
    System.out.println("Constructing Box");
    this.width = width;
    this.height = height;
    this.depth = depth;
	}


  double volume() {
    return width * height * depth;
  }
  
   





}


class BoxDemoParameterizedConstructorThisExample {
  public static void main(String args[]) {
    Box5 mybox = new Box5(10,10,10);
    System.out.println(mybox.volume());
    
    
      Box5 mybox1 = new Box5(10,12,15);
    System.out.println(mybox1.volume());
    

   
   
  }
}
