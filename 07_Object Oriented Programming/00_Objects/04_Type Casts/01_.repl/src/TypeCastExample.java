package exlcode;



public class TypeCastExample {

  public static void main(String[] args) {
    Object exampleVariableOne = new TypeCastTest();
    // exampleVariableOne has to be casted to a TypeCastTest object
    // before accessing language
    System.out.println(((TypeCastTest)exampleVariableOne).language);
  }
}