>>Which variables in the following code segment are field variables?

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

[x] <pre><code>varOne</code></pre> {{ selected: Correct because <code>varOne</code> is declared as a member of the class.}, { unselected: Correct because <code>varOne</code> is declared as a member of the class.}}
[x] <pre><code>varTwo</code></pre> {{ selected: Correct because <code>varTwo</code> is declared as a member of the class.}, { unselected: Correct because <code>varTwo</code> is declared as a member of the class.}}
[ ] <pre><code>varThree</code></pre> {{ selected: Incorrect because <code>varThree</code> is declared inside the method body.}, { unselected: Incorrect because <code>varThree</code> is declared inside the method body.}}
[ ] <pre><code>varFour</code></pre> {{ selected: Incorrect because <code>varFour</code> is declared inside the method body.}, { unselected: Incorrect because <code>varFour</code> is declared inside the method body.}}
[ ] <pre><code>paramOne</code></pre> {{ selected: Incorrect because it is declared as a parameter for <code>exampleMethod</code>, also making it a local variable.}, { unselected: Incorrect because it is declared as a parameter for <code>exampleMethod</code>, also making it a local variable.}}

||What is the difference between a local variable and a field variable? ||
