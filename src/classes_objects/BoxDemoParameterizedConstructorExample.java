package classes_objects;
class Box4 {
  double width;
  double height;
  double depth;
  
  
  
   Box4(double w, double h, double d) {
    System.out.println("Constructing Box");
    width = w;
    height = h;
    depth = d;
	}


  double volume() {
    return width * height * depth;
  }
  
   





}


class BoxDemoParameterizedConstructorExample {
  public static void main(String args[]) {
    Box4 mybox = new Box4(10,10,10);
    System.out.println(mybox.volume());
    
    
      Box4 mybox1 = new Box4(10,12,15);
    System.out.println(mybox1.volume());
    

   
   
  }
}
