package exlcode;

import java.util.ArrayList;

public class ArrayListsExample {

  public static ArrayList<String> exampleVariableOne = new ArrayList<String>();
  public static ArrayList<String> exampleVariableTwo = new ArrayList<String>(5);

  public static void main(String[] args) {
    // "add" will be explained later this unit
    exampleVariableOne.add("Hello");
    exampleVariableOne.add("World");
    // ArrayLists can be printed directly to the console, unlike arrays
    System.out.println(exampleVariableOne);
    System.out.println(exampleVariableTwo);
  }
}