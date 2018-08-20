>>Assume that <code>varOne</code> and <code>varTwo</code> are integers. The expression:

```
!(varOne &#60; varTwo) &#38;&#38; !(varOne &#62; varTwo)
```

is equivalent to which of the following? <<

(x) <pre><code>varOne == varTwo</code></pre> {{Correct because the negation of the "AND" statement and the '&gt;' and '&lt;' lead to the statement <code>varOne == varTwo</code>.
<p>The process is shown below. Use the comments to guide you through each step:<br/>
<code>!(varOne &lt; varTwo) &amp;&amp; !(varOne &gt; varTwo)</code><br/>
= <code>(varOne &gt;= varTwo) &amp;&amp; (varOne &lt;= varTwo)</code><br/>
= <code>varOne == varTwo</code> (because <code>varOne</code> cannot be smaller and bigger than <code>varTwo</code>, meaning <code>varOne</code> has to equal <code>varTwo</code>)</p>}}
( ) <pre><code>varOne != varTwo</code></pre> {{Incorrect because the expression evaluates to <code>varOne == varTwo</code>. View the step-by-step solution above.}}
( ) <pre><code>!((varOne &lt; varTwo) &amp;&amp; (varOne &gt; varTwo))</code></pre> {{Incorrect because the expression evaluates to <code>varOne == varTwo</code>.  View the step-by-step solution above.}}
( ) <pre><code>true</code></pre> {{Incorrect because the expression does not always evaluate to true.}}
( ) <pre><code>false</code></pre> {{Incorrect because the expression does not always evaluate to false.}}

||The '!' operator is distributed equally to everything inside the brackets, including the relational operators. ||
