>>Assume that the following variable declarations have been made.
<pre><code class="java language-java">double varOne = Math.random();
double varTwo;
</code></pre>
<p>Which of the following assigns a value to <code>varTwo</code> with the uniform distribution over the range 0.5 &lt;= <code>varTwo</code> &lt; 5.5?</p><<

( ) <code>varTwo = varOne + 0.5;</code> {{Incorrect because it returns a random value between 0.5 and 1.5.}}
( ) <code>varTwo = varOne + 0.5 * 5.0;</code> {{Incorrect because it returns a random value between 2.5 and 3.5.}}
( ) <code>varTwo = varOne * 5.0;</code> {{Incorrect because it returns a random value between 0 and 5.0.}}
( ) <code>varTwo = varOne * 5.5;</code> {{Incorrect because it returns a random value between 0 and 5.5.}}
(x) <code>varTwo = varOne * 5.0 + 0.5;</code> {{Correct because it accurately returns a random value between 0.5 (inclusive) and 5.5.
The process is shown below. Use the comments to guide you through each step:
<code>Math.random()</code>:             0.0 &lt;= varTwo &lt; 1.0
<code>Math.random() * 5.0</code>:       0.0 &lt;= varTwo &lt; 5.0
<code>Math.random() * 5.0 + 0.5</code>: 0.5 &lt;= varTwo &lt; 5.5}}

||<code>Math.random()</code> gives you a random number that is greater than or equal to 0 and less than 1. ||
