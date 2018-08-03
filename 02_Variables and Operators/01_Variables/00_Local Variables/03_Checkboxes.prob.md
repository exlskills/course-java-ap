>>Which variables in the following code segment are local variables?
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

[ ] <code>varOne</code> {{ selected: Incorrect because <code>varOne</code> is declared as a member of the class, making it a field variable.}, { unselected: Incorrect because <code>varOne</code> is declared as a member of the class, making it a field variable.}}
[ ] <code>varTwo</code> {{ selected: Incorrect because <code>varOne</code> is declared as a member of the class, making it a field variable.}, { unselected: Incorrect because <code>varOne</code> is declared as a member of the class, making it a field variable.}}
[x] <code>varThree</code> {{ selected: Correct because <code>varThree</code> is declared inside a method body.}, { unselected: Correct because <code>varThree</code> is declared inside a method body.}}
[x] <code>varFour</code> {{ selected: Correct because <code>varFour</code> is declared inside a method body.}, { unselected: Correct because <code>varFour</code> is declared inside a method body.}}
[x] <code>paramOne</code> {{ selected: Correct because <code>paramOne</code> is a parameter and parameters are also local variables.}, { unselected: Correct because <code>paramOne</code> is a parameter and parameters are also local variables.}}

||What is the difference between a local variable and a field variable? ||
