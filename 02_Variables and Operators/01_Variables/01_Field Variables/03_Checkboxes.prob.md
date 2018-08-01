>>Which variables in the following code segment are field variables?</p>
<pre><code class="java language-java">public class TestClass()
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

[x] <code>varOne</code> {{ selected: correct because <code>varOne</code> is declared as a member of the class.}, { unselected: correct because <code>varOne</code> is declared as a member of the class.}}
[x] <code>varTwo</code> {{ selected: correct because <code>varTwo</code> is declared as a member of the class.}, { unselected: correct because <code>varTwo</code> is declared as a member of the class.}}
[ ] <code>varThree</code> {{ selected: incorrect because <code>varThree</code> is declared inside the method body.}, { unselected: incorrect because <code>varThree</code> is declared inside the method body.}}
[ ] <code>varFour</code> {{ selected: incorrect because <code>varFour</code> is declared inside the method body.}, { unselected: incorrect because <code>varFour</code> is declared inside the method body.}}
[ ] <code>paramOne</code> {{ selected: incorrect because it is declared as a parameter for <code>exampleMethod</code>, also making it a local variable.}, { unselected: incorrect because it is declared as a parameter for <code>exampleMethod</code>, also making it a local variable.}}

||What is the difference between a local variable and a field variable? ||
