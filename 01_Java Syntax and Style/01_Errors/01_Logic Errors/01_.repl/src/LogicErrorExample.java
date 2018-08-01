package exlcode;
 
 public class LogicErrorExample { 
  public static int exampleVariableOne = 5;
 public static int exampleVariableTwo = 10; 
 public static int exampleVariableThree = exampleVariableTwo * exampleVariableOne; 

  public static void main(String[] args) { 
   // this prints the wrong number because the symbol '*' is used instead of the '/' 
    System.out.println("10 divided by 5 is " + exampleVariableThree); 
  }}