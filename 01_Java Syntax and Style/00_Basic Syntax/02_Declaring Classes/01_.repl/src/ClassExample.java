package exlcode;
 
 public class ClassExample { 
  // This creates new String named exampleVariable 
  private static String exampleVariable; 

  // This is the constructor for the class 
  // that takes in one parameter 
  public ClassExample(String exampleVariable){ 
    this.exampleVariable = exampleVariable; 
  } 

  public static void main(String[] args) { 
    // This will be explained in Unit 8 
    ClassExample classexample = new ClassExample("Hello World!"); 
    // This prints the String stored in exampleVariable 
    System.out.println(exampleVariable); 
  }
}