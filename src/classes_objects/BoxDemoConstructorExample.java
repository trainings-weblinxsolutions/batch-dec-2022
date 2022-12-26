class Box {
  double width;
  double height;
  double depth;
  
  
  
   Box() {
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
    Box mybox = new Box();
    System.out.println(mybox.volume());
    
    
      Box mybox1 = new Box();
    System.out.println(mybox1.volume());
    

   
   
  }
}
