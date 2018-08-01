>>Which variables in the following code segment are local variables?</p>
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

[ ] <code>varOne</code> {{ selected: incorrect because <code>varOne</code> is declared as a member of the class, making it a field variable.}, { unselected: incorrect because <code>varOne</code> is declared as a member of the class, making it a field variable.}}
[ ] <code>varTwo</code> {{ selected: incorrect because <code>varOne</code> is declared as a member of the class, making it a field variable.}, { unselected: incorrect because <code>varOne</code> is declared as a member of the class, making it a field variable.}}
[x] <code>varThree</code> {{ selected: correct because <code>varThree</code> is declared inside a method body.}, { unselected: correct because <code>varThree</code> is declared inside a method body.}}
[x] <code>varFour</code> {{ selected: correct because <code>varFour</code> is declared inside a method body.}, { unselected: correct because <code>varFour</code> is declared inside a method body.}}
[x] <code>paramOne</code> {{ selected: correct because <code>paramOne</code> is a parameter and parameters are also local variables.}, { unselected: correct because <code>paramOne</code> is a parameter and parameters are also local variables.}}

||What is the difference between a local variable and a field variable? ||
