package exlcode;

public class AccessControlExample {

  public static void main(String[] args) {
    // This will be explained in Unit 8
    AccessControlTest accessControlTest = new AccessControlTest();
    System.out.println(accessControlTest.exampleVariableOne);
    System.out.println(accessControlTest.exampleVariableTwo);
    // accessControlTest.exampleVariableThree will cause an error because
    // exampleVariableThree is private
  }
}