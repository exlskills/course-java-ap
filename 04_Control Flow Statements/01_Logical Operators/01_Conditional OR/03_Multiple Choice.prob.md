>>Consider the following code segment:</p>
<pre><code class="java language-java">public static void exampleMethod(int paramOne, int paramTwo)
{
  if ((paramOne &gt; 0) &amp;&amp; (paramTwo &gt; 0)) {
    if (paramOne &gt; paramTwo){
      System.out.println("A");
    }
    else{
      System.out.println("B");
    }
  }
  else if ((paramTwo &lt; 0) || (paramOne &lt; 0)) {
    System.out.println("C");
  }
  else if (paramTwo &lt; 0) {
    System.out.println("D");
  }
  else { 
    System.out.println("E");
  }
}
</code></pre>
<p>What is printed as a result of executing <code>exampleMethod(3,-2)</code>? <<

( ) A {{incorrect because it paramTwo is less than zero, causing the whole boolean expression in the if statement to be false.}}
( ) B {{incorrect because it paramTwo is less than zero, causing the whole boolean expression in the if statement to be false.}}
(x) C {{correct because the boolean expression first if statement will lead to false, causing the first else-if statement to execute and print C.
<code>(paramOne &gt; 0) &amp;&amp; (paramTwo &gt; 0)</code> is false while <code>(paramOne &gt; 0) || (paramTwo &gt; 0)</code> is true because one of the parameters is bigger than zero.}}
( ) D {{incorrect because the boolean expression in the first else-if statement is true, meaning that the rest of the else-if and else statements after it will not be executed.}}
( ) E {{incorrect because the boolean expression in the first else-if statement is true, meaning that the rest of the else-if and else statements after it will not be executed.}}

||Consider the nested if statement located towards the start of the method when solving the  question. ||
