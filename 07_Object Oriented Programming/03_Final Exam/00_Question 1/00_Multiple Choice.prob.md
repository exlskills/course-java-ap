>>Consider the following class declarations:
<pre><code class="java language-java">public interface Greeting {
  public void printGreeting();
}
</code></pre>
<pre><code class="java language-java">public class PersonGreeting implements Greeting
{
  public void print(){
  }
}
</code></pre>
<p>Why does the code above cause a compile-time error?</p><<

( ) <code>PersonGreeting</code> should extend <code>Greeting</code>, not implement it. {{Incorrect because the Java reserved word <code>implements</code> is used between a class and an interface.}}
( ) The <code>printGreeting</code> method doesn't have any statements. {{Incorrect because <code>printGreeting()</code> is a method inside a interface and does not require a method body.}}
(x) <code>PersonGreeting</code> doesn't implement the <code>printGreeting()</code> method. {{Correct because a class that implements an interface must implement the methods that exist in the interface.}}
( ) <code>PersonGreeting</code> cannot implement <code>Greeting</code>. {{Incorrect because any regular class can implement an interface as long as it implements all the methods as required.}}
( ) The <code>print()</code> method doesn't have any statements. {{Incorrect because a method does not have to have any statements in the method body, and even though this method will not be useful at all, it will not cause any errors.}}

||All methods in an interface should exist in a class that implements it.||
