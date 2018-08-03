>>Consider the following code segment:
<pre><code class="java language-java">int varOne = 0;
for (int count = 0; count &lt; 20; count++)
{
  varOne ++;
  if (varOne &gt; 3){
    break;
  }
}
System.out.println(varOne);
</code></pre>
<p>What is printed as a result of executing this code segment?</p><<

( ) 2 {{Incorrect because 4 is printed. View the step-by-step solution for the question by selecting the correct answer, 4.}}
( ) 3 {{Incorrect because 4 is printed. View the step-by-step solution for the question by selecting the correct answer, 4.}}
(x) 4 {{Correct because it accurately represents what the break statement does when the value of <code>varOne</code> is greater than 3.
<p>The process is shown below. Use the comments to guide you through each step:</p>
<p>When count = 0,<br/>
<code>varOne++</code> // varOne = 1<br/>
<code>varOne &gt; 3</code> // results in false</p>
<p>When count = 1,<br/>
<code>varOne++</code> // varOne = 2<br/>
<code>varOne &gt; 3</code> // results in false</p>
<p>When count = 2,<br/>
<code>varOne++</code> // varOne = 3<br/>
<code>varOne &gt; 3</code> // results in false</p>
<p>When count = 3,<br/>
<code>varOne++</code> // varOne = 4<br/>
<code>varOne &gt; 3</code> // results in true<br/>
<code>break;</code> // exits the for loop</p>
<p>Therefore, <code>varOne</code> = 4 and "4" will be printed.</p>}}
( ) 5 {{Incorrect because 4 is printed. View the step-by-step solution for the question by selecting the correct answer, 4.}}
( ) Nothing is printed because an error is thrown. {{Incorrect because the statements above will compile and run successfully.}}

||The <code>break;</code> statement causes the program to leave the for statement and jump straight to the <code>System.out.println(varOne)</code> statement. ||
