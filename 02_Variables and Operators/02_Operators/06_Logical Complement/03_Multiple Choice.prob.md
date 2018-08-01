>>Consider the following method:</p>
<pre><code class="java language-java">public static void exampleMethod()
{
  if(false)
  {
    System.out.println("False");
  }
  if(true)
  {
    System.out.println("True");
  }
  if(!false)
  {
    System.out.println("Not False");
  }
  if(!true)
  {
    System.out.println("Not True");
  }
}
</code></pre>
<p>What is printed when we call <code>exampleMethod()</code>? <<

( ) False {{Incorrect because only expressions that evaluate to true are executed.}}
( ) True {{Incorrect because <code>!false</code> also evaluates to true.}}
( ) False 
Not True {{Incorrect because only expressions that evaluate to true are executed.}}
(x) True
Not False {{Correct because only expressions that evaluate to true are executed, and <code>!false</code> evaluates to true.}}
( ) False
True
Not False
Not True {{Incorrect because only expressions that evaluate to true are executed.}}

||The if statements only execute when the value in the bracket results to <code>true</code>. ||
