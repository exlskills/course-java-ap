>>Consider the following code segment:</p>
<pre><code class="java language-java">int varOne = 3;
int varTwo = 2;
int varThree = 0;
while (varOne &lt;= 5){
  varThree += varOne % varTwo;
  varOne++;
  varTwo++;
}
</code></pre>
<p>What is the value of <code>varThree</code> after the code is executed? <<

( ) 1 {{incorrect because the value of <code>varThree</code> will be 3. Look at the process shown below.}}
( ) 111 {{incorrect because the value of <code>varThree</code> will be 3. Look at the process shown below.}}
( ) 2 {{incorrect because the value of <code>varThree</code> will be 3. Look at the process shown below.}}
(x) 3 {{correct because it accurately represents what the while loop does and the number of times <code>varThree += varOne % varTwol</code> is executed.
The process is shown below:
When varOne = 3,
<code>varOne &lt;= 5 // true</code>
<code>varThree += 3 % 2 // varThree + 1</code>
<code>varOne++ // varOne = 4</code>
<code>varTwo++ // varTwo = 3</code></p>
<p>When varOne = 4,
<code>varOne &lt;= 5 // true</code>
<code>varThree += 4 % 3 // varThree + 1</code>
<code>varOne++ // varOne = 5</code>
<code>varTwo++ // varTwo = 4</code></p>
<p>When varOne = 5,
<code>varOne &lt;= 5 // true</code>
<code>varThree += 5 % 4 // varThree + 1</code>
<code>varOne++ // varOne = 6</code>
<code>varTwo++ // varTwo = 5</code></p>
<p>When varOne = 6,
<code>varOne &lt;= 5 // false</code></p>
<p>Therefore, varThree would be equal to 3 after the while loop.}}
( ) None of these answers is correct. {{incorrect because the statements above will compile and run successfully. Look at the process shown above.}}

||The while statement only runs 3 times, when <code>varOne = 3</code>, <code>varOne = 4</code>, and <code>varOne = 5</code>. ||
