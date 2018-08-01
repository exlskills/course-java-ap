package exlhub;

public class IndentationExample {

  // standard indenting increases by 2 spaces as shown below
  // braces are used even when optional
  public static void main(String[] args) {
    // neat indenting:
    // if-else will be explained in Unit 5
    if (true) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }

    // no indenting:
    if(true)          System.out.println("True");
    else    System.out.println("False");

  }
}