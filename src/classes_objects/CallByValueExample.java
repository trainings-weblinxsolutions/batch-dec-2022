class Test {
  void meth(int i, int j) {
    i *= 2;
	j /= 2; 
	 System.out.println("i and j in method: " +
                       i + " " + j);
}
}
class CallByValueExample {
  public static void main(String args[]) {
    Test ob = new Test();
    int a = 15, b = 20;
    System.out.println("a and b before call: " +
                       a + " " + b);
    ob.meth(a, b);
    System.out.println("a and b after call: " +
                       a + " " + b);
} }