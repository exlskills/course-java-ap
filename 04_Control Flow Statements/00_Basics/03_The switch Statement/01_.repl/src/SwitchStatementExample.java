package exlcode;

public class SwitchStatementExample {

  public static int exampleVariableOne = 37;

  public static void main(String[] args) {
    // checks to see which number exampleVariableOne is
    // between 35-40
    switch (exampleVariableOne /* expression */){
      case 35: // 35 is a label
        System.out.println("exampleVariableOne is 35");
        break;
      case 36: // 36 is a label
        System.out.println("exampleVariableOne is 36");
        break;
      case 37: // 37 is a label
        System.out.println("exampleVariableOne is 37");
        break;
      case 38:
        System.out.println("exampleVariableOne is 38");
        break;
      case 39:
        System.out.println("exampleVariableOne is 39");
        break;
      case 40:
        System.out.println("exampleVariableOne is 40");
        break;
      default:
        System.out.println("exampleVariableOne has to be between 35 and 40");
    }
  }
}