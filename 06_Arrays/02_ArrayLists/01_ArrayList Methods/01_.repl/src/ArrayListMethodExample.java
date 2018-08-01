package exlhub;

import java.util.ArrayList;

public class ArrayListMethodExample {

  public static ArrayList<String> exampleVariableOne = new ArrayList<String>();

  public static void main(String[] args) {
    // adds "Hello" to the ArrayList
    exampleVariableOne.add("Hello");
    // adds "World" to the 0th index of the ArrayList
    exampleVariableOne.add(0, "World");
    System.out.println(exampleVariableOne);
    // removes "Hello" from the ArrayList
    exampleVariableOne.remove(0);
    // changes "World" to "Java"
    exampleVariableOne.set(0, "Java");
    System.out.println(exampleVariableOne);
    // access the first element of the ArrayList
    System.out.println(exampleVariableOne.get(0));
    // prints the size of the ArrayList
    System.out.println(exampleVariableOne.size());
  }
}