>>Which variables in the following code segment are field variables?
<pre><code>public class TestClass()
{
  int varOne = 100;
  int varTwo = 25;

  public static void main (String[] args)
  {
    int varThree = 5;
    System.out.println("Hello World!");
    exampleMethod(5);
  }

  public static int exampleMethod(int paramOne)
  {
    int varFour  = 50;
    System.out.println(paramOne);
    System.out.println(varFour);
  }
}
</code></pre> <<

[x] <code>varOne</code> {{ selected: Correct because <code>varOne</code> is declared as a member of the class.}, { unselected: Correct because <code>varOne</code> is declared as a member of the class.}}
[x] <code>varTwo</code> {{ selected: Correct because <code>varTwo</code> is declared as a member of the class.}, { unselected: Correct because <code>varTwo</code> is declared as a member of the class.}}
[ ] <code>varThree</code> {{ selected: Incorrect because <code>varThree</code> is declared inside the method body.}, { unselected: Incorrect because <code>varThree</code> is declared inside the method body.}}
[ ] <code>varFour</code> {{ selected: Incorrect because <code>varFour</code> is declared inside the method body.}, { unselected: Incorrect because <code>varFour</code> is declared inside the method body.}}
[ ] <code>paramOne</code> {{ selected: Incorrect because it is declared as a parameter for <code>exampleMethod</code>, also making it a local variable.}, { unselected: Incorrect because it is declared as a parameter for <code>exampleMethod</code>, also making it a local variable.}}

||What is the difference between a local variable and a field variable? ||
