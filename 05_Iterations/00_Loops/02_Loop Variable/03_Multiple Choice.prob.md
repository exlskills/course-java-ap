>>Consider the following code segments:</p>
<p>I.</p>
<pre><code class="java language-java">int varOne = 1;
while (varOne &lt; 20){
  if (varOne % 3 == 1){
    System.out.print(varOne + " ");
  }
  varOne = varOne + 3;    
}
</code></pre>
<p>II.</p>
<pre><code class="java language-java">for (int varOne = 1; varOne &lt; 20; varOne++)
{
  if (varOne % 3 == 1){
    System.out.print(varOne + " ");
  }
}
</code></pre>
<p>III.</p>
<pre><code class="java language-java">for (int varOne = 1; varOne &lt; 20; varOne = varOne + 3)
{
  System.out.print(varOne + " ");
}</code></pre>
<p>Which of the code segments above will produce the following output?
1 4 7 10 13 16 19 <<

( ) I only {{Incorrect because II also prints the correct output as it prints out every number that has a remainder of 1 when divided by 3.}}
( ) II only {{Incorrect because I also prints the correct output as it prints out every number that has a remainder of 1 when divided by 3.}}
( ) I and II {{Incorrect because III also prints the correct output as it prints out every third integer starting from 1.}}
( ) II and III {{Incorrect because I also prints the correct output as it prints out every number that has a remainder of 1 when divided by 3.}}
(x)  I, II and III {{Correct because I, II and III all print the same output.}}

||All the numbers in the output have a difference of 3 and will return a remainder of 1 when divided by 3. ||
