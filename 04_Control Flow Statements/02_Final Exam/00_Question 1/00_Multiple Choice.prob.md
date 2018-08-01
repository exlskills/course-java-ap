>>Assume that <code>varOne</code> and <code>varTwo</code> are integers. The expression:
<code>!(varOne &lt; varTwo) &amp;&amp; !(varOne &gt; varTwo)</code>
is equivalent to which of the following? <<

(x) <code>varOne == varTwo</code> {{Correct because the negation of the "AND" statement and the '&gt;' and '&lt;' lead to the statement <code>varOne == varTwo</code>.
The process is shown below:
Expression: <code>!(varOne &lt; varTwo) &amp;&amp; !(varOne &gt; varTwo)</code>
          = <code>(varOne &gt;= varTwo) &amp;&amp; (varOne &lt;= varTwo)</code>
          = <code>varOne == varTwo</code> (because varOne cannot be smaller than varTwo and bigger than varTwo at the same time)}}
( ) <code>varOne != varTwo</code> {{Incorrect because the expression evaluates to <code>varOne == varTwo</code>. Look at the process shown within the first answer choice.}}
( ) <code>!((varOne &lt; varTwo) &amp;&amp; (varOne &gt; varTwo))</code> {{Incorrect because the expression evaluates to <code>varOne == varTwo</code>. Look at the process shown within the first answer choice.}}
( ) <code>true</code> {{Incorrect because the expression does not always evaluate to true.}}
( ) <code>false</code> {{Incorrect because the expression does not always evaluate to false.}}

||The '!' operator is distributed equally to everything inside the brackets, including the relational operators. ||
