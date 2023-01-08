package classes_objects;

class Box2 {
  double width;
  double height;
  double depth;
  
  
  
   Box2(double width, double height, double depth) {
    System.out.println("Constructing Box");
    this.width = width;
    this.height = height;
    this.depth = depth;
	}


	  // constructor used when no dimensions specified
  Box2() {
    width = -1;  // use -1 to indicate
    height = -1; // an uninitialized
    depth = -1;  // box
}

// constructor used when cube is created
  Box2(double len) {
    width = height = depth = len;
  }


  double volume() {
    return width * height * depth;
  }
  
   





}


class BoxDemoConstrutorOverloading {
  public static void main(String args[]) {
   	Box2 mybox1 = new Box2(10, 20, 15);
    Box2 mybox2 = new Box2();
    Box2 mycube = new Box2(7);

    double vol;
// get volume of first box
vol = mybox1.volume();
System.out.println("Volume of mybox1 is " + vol);
// get volume of second box
vol = mybox2.volume();
System.out.println("Volume of mybox2 is " + vol);
// get volume of cube
vol = mycube.volume();
System.out.println("Volume of mycube is " + vol);

   
   
  }
}
