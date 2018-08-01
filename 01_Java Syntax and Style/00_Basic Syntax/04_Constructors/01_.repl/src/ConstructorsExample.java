package exlhub;

public class ConstructorsExample {
  private String exampleVariable;

  // this is the Default constructor of the class
  // that has no parameters
  public ConstructorsExample(){
  }

  // this is the constructor of the class
  // that takes in one parameter
  public ConstructorsExample(String parameterOne) {
    // this prints exampleVariable
    System.out.println(parameterOne);
  }

  public static void main(String[] args) {
    // this will be explained in Unit 8
    ConstructorsExample constructorsExample = new ConstructorsExample("Hello World!");
  }
}