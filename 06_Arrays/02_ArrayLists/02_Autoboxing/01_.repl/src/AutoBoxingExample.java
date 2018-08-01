package exlhub;


import java.util.ArrayList;

public class AutoBoxingExample {

  public static ArrayList<Integer> exampleVariableOne = new ArrayList<Integer>();

  public static void main(String[] args) {
    exampleVariableOne.add(new Integer(5));
    // autoboxing leads to simple code without unnecessary boxing
    exampleVariableOne.add(80);
    System.out.println(exampleVariableOne);
  }
}