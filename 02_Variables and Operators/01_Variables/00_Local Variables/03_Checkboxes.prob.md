>>Which variables in the following code segment are local variables?

```
public class TestClass()
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
```

<<

[ ] <pre><code>varOne</code></pre> {{ selected: Incorrect because <code>varOne</code> is declared as a member of the class, making it a field variable.}, { unselected: Incorrect because <code>varOne</code> is declared as a member of the class, making it a field variable.}}
[ ] <pre><code>varTwo</code></pre> {{ selected: Incorrect because <code>varOne</code> is declared as a member of the class, making it a field variable.}, { unselected: Incorrect because <code>varOne</code> is declared as a member of the class, making it a field variable.}}
[x] <pre><code>varThree</code></pre> {{ selected: Correct because <code>varThree</code> is declared inside a method body.}, { unselected: Correct because <code>varThree</code> is declared inside a method body.}}
[x] <pre><code>varFour</code></pre> {{ selected: Correct because <code>varFour</code> is declared inside a method body.}, { unselected: Correct because <code>varFour</code> is declared inside a method body.}}
[x] <pre><code>paramOne</code></pre> {{ selected: Correct because <code>paramOne</code> is a parameter and parameters are also local variables.}, { unselected: Correct because <code>paramOne</code> is a parameter and parameters are also local variables.}}

||What is the difference between a local variable and a field variable? ||
