package classes_objects;

class College{
       final int MAX_STUDENTS = 100;
}

class FinalVariableInJava{

  public static void main(String args[]) {
  
       final int MAX_STUDENTS = 100;
       int marks = 10;
       
       
       //......
       
       System.out.println("Marks : "+marks);
        System.out.println("MAX_STUDENTS : "+MAX_STUDENTS);
       marks = 90;
    //   MAX_STUDENTS = 120; - This won't work as the variable is marked as FINAL
       
       System.out.println("Marks : "+marks);
       System.out.println("MAX_STUDENTS : "+MAX_STUDENTS);

}

}