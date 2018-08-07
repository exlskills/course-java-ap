>>Assume that <code>varOne</code> and <code>varTwo</code> are integers. The expression:
<code><br/>!(varOne &lt; varTwo) &amp;&amp; !(varOne &gt; varTwo)<br/></code>
is equivalent to which of the following? <<

(x) <code>varOne == varTwo</code> {{Correct because the negation of the "AND" statement and the '&gt;' and '&lt;' lead to the statement <code>varOne == varTwo</code>.
<p>The process is shown below. Use the comments to guide you through each step:<br/>
<code>!(varOne &lt; varTwo) &amp;&amp; !(varOne &gt; varTwo)</code><br/>
= <code>(varOne &gt;= varTwo) &amp;&amp; (varOne &lt;= varTwo)</code><br/>
= <code>varOne == varTwo</code> (because <code>varOne</code> cannot be smaller and bigger than <code>varTwo</code>, meaning <code>varOne</code> has to equal <code>varTwo</code>)</p>}}
( ) <code>varOne != varTwo</code> {{Incorrect because the expression evaluates to <code>varOne == varTwo</code>. View the step-by-step solution above.}}
( ) <code>!((varOne &lt; varTwo) &amp;&amp; (varOne &gt; varTwo))</code> {{Incorrect because the expression evaluates to <code>varOne == varTwo</code>.  View the step-by-step solution above.}}
( ) <code>true</code> {{Incorrect because the expression does not always evaluate to true.}}
( ) <code>false</code> {{Incorrect because the expression does not always evaluate to false.}}

||The '!' operator is distributed equally to everything inside the brackets, including the relational operators. ||
