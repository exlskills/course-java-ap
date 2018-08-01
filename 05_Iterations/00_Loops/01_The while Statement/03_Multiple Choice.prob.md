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

( ) 1 {{Incorrect because the value of <code>varThree</code> will be 3. Look at the process shown within the fourth answer choice.}}
( ) 111 {{Incorrect because the value of <code>varThree</code> will be 3. Look at the process shown within the fourth answer choice.}}
( ) 2 {{Incorrect because the value of <code>varThree</code> will be 3. Look at the process shown within the fourth answer choice.}}
(x) 3 {{Correct because it accurately represents what the while loop does and the number of times <code>varThree += varOne % varTwo</code> is executed.
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
<p>Therefore, <code>varThree</code> would be equal to 3 after the while loop.}}
( ) None of these answers is correct. {{Incorrect because the statements above will compile and run successfully. Look at the process shown within the fourth answer choice..}}

||The while statement only runs 3 times, when <code>varOne = 3</code>, <code>varOne = 4</code>, and <code>varOne = 5</code>. ||
