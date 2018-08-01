>>Consider the following class declarations:</p>
<pre><code class="java language-java">public class Main{
  public static void main (String[] args){
    ExampleClass exampleClassOne = new ExampleClass();
    System.out.println(exampleClassOne.varOne);
    System.out.println(exampleClassOne.varTwo);
    System.out.println(exampleClassOne.getString());
    System.out.println(exampleClassOne.getBool());
  }
}
</code></pre>
<pre><code class="java language-java">public class ExampleClass{
  public int varOne = 10;
  private String varTwo = "Hello World";
  private boolean varThree = false;
  public String getString(){
    return varTwo;
  }
  public boolean getBool(){
    return varThree;
  }
}
</code></pre>
<p>Which statement in the <code>Main</code> class will cause an error? <<

( ) A. <code>System.out.println(exampleClassOne.varOne);</code> {{A is incorrect because <code>varOne</code> is declared as a <code>public</code> variable in <code>ExampleClass</code>.}}
(x) B. <code>System.out.println(exampleClassOne.varTwo);</code> {{B is correct because <code>varTwo</code> is declared as a <code>private</code> variable in <code>ExampleClass</code>.}}
( ) C. <code>System.out.println(exampleClassOne.getString());</code> {{C is incorrect because <code>getString()</code> is declared as a <code>public</code> method in <code>ExampleClass</code>.}}
( ) D. <code>System.out.println(exampleClassOne.getBool());</code> {{D is incorrect because <code>getBool</code> is declared as a <code>public</code> method in <code>ExampleClass</code>.}}
( ) E. None of the above. {{E is incorrect because <code>varTwo</code> is declared as a <code>private</code> variable in <code>ExampleClass</code>.}}

||Private variables/methods can only be accessed by its own class. ||
