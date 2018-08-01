>>Consider the following code segment:</p>
<pre><code class="java language-java">private int calculate (int paramOne){
  if (paramOne &lt;= 1){
    return 1;
  } else {
    return paramOne * calculate(paramOne - 2);
  }
}
</code></pre>
<p>Which of the following is printed as a result of the call <code>calculate(5)</code>? <<

( ) A. 1 {{A is incorrect because 15 is printed after <code>calculate(5)</code> is executed. Look at the process shown below.}}
( ) B. 10 {{B is incorrect because 15 is printed after <code>calculate(5)</code> is executed. Look at the process shown below.}}
(x) C. 15 {{C is correct because it accurately represents what the recursive method above prints.
The process is shown below:</p>
<p>calculate(5)
<code>if (paramOne &lt;= 1) // false (STEP 1)</code>
<code>return paramOne * calculate(paramOne - 2); // returns 5 * calculate(3) (STEP 2) and (STEP 8)</code></p>
<p>calculate(3)
<code>if (paramOne &lt;= 1) // false (STEP 3)</code>
<code>return paramOne * calculate(paramOne - 2); // returns 3 * calculate(1) (STEP 4) and (STEP 7)</code></p>
<p>calculate(1)
<code>if (paramOne &lt;= 1) // true (STEP 5)</code>
<code>return 1; // returns 1, go back to STEP 4 (STEP 6)</code></p>
<p>Therefore, "15" is printed after <code>calculate(5)</code> is executed.}}
( ) D. 25 {{D is incorrect because 15 is printed after <code>calculate(5)</code> is executed. Look at the process shown above.}}
( ) E. 3125 {{E is incorrect because 15 is printed after <code>calculate(5)</code> is executed. Look at the process shown above.}}

||The <code>calculate()</code> method is only called twice after the initial call <code>calculate(5)</code>. ||
