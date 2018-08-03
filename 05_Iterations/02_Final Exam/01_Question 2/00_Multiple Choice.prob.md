>>Consider the following code segment:
<pre><code class="java language-java">int varOne = 24;
int varTwo = 30;
while (varTwo != 0){
  int varThree = varOne % varTwo;
  varOne = varTwo;
  varTwo = varThree;
}
System.out.println(varOne);
</code></pre>
<p>What is printed as a result of executing the code segment?</p><<

( ) 0 {{Incorrect because 6 is printed.View the step-by-step solution for the question by selecting the correct answer, 6.}}
(x) 6 {{Correct because it accurately represents what the while loop does and the number of times the body of the while loop is executed.
<p>The process is shown below. Use the comments to guide you through each step:</p>
<p>When varTwo = 30,<br/>
<code>varTwo != 0</code> // results in true<br/>
<code>int varThree = varOne % varTwo </code>// varThree = 24%30 = 24<br/>
<code>varOne = varTwo </code>// varOne = 30<br/>
<code>varTwo = varThree </code>// varTwo = 24</p>
<p>When varTwo = 24,<br/>
<code>varTwo != 0</code> // results in true<br/>
<code>int varThree = varOne % varTwo</code> // varThree = 30%24 = 6<br/>
<code>varOne = varTwo</code> // varOne = 24<br/>
<code>varTwo = varThree </code>// varTwo = 6</p>
<p>When varTwo = 6,<br/>
<code>varTwo != 0</code> // results in true<br/>
<code>int varThree = varOne % varTwo</code> // varThree = 24%6 = 0<br/>
<code>varOne = varTwo</code> // varOne = 6<br/>
<code>varTwo = varThree</code> // varTwo = 0</p>
<p>When varTwo = 0,<br/>
<code>varTwo != 0</code> // results in false</p>
<p>Therefore, <code>varOne</code> = 6 and 6 will be printed as a result of executing the code segment.</p>}}
( ) 12 {{Incorrect because 6 is printed.View the step-by-step solution for the question by selecting the correct answer, 6.}}
( ) 24 {{Incorrect because 6 is printed.View the step-by-step solution for the question by selecting the correct answer, 6.}}
( ) 30 {{Incorrect because 6 is printed.View the step-by-step solution for the question by selecting the correct answer, 6.}}

||Pay attention to each variable and how it changes as the program is executed. ||
