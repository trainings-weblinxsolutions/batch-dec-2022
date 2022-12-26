class Box {
  double width;
  double height;
  double depth;
  
  
  
   Box(double w, double h, double d) {
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
    Box mybox = new Box(10,10,10);
    System.out.println(mybox.volume());
    
    
      Box mybox1 = new Box(10,12,15);
    System.out.println(mybox1.volume());
    

   
   
  }
}
