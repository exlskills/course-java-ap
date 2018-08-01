>>Assume that varOne and varTwo are integers. The expression:
<code>!(varOne &lt; varTwo) &amp;&amp; !(varOne &gt; varTwo)</code>
is equivalent to which of the following? <<

(x) A. <code>varOne == varTwo</code> {{A is correct because the negation of the AND statement and the '&gt;' and '&lt;' lead to the statement <code>varOne == varTwo</code>.
The process is shown below:
Expression: <code>!(varOne &lt; varTwo) &amp;&amp; !(varOne &gt; varTwo)</code>
          = <code>(varOne &gt;= varTwo) &amp;&amp; (varOne &lt;= varTwo)</code>
          = <code>varOne == varTwo</code> (because varOne cannot be smaller than varTwo and bigger than varTwo at the same time)}}
( ) B. <code>varOne != varTwo</code> {{B is incorrect because the expression evaluates to <code>varOne == varTwo</code>. Look at the process shown above.}}
( ) C. <code>!((varOne &lt; varTwo) &amp;&amp; (varOne &gt; varTwo))</code> {{C is incorrect because the expression evaluates to <code>varOne == varTwo</code>. Look at the process shown above.}}
( ) D. <code>true</code> {{D is incorrect because the expression does not always evaluate to true.}}
( ) E. <code>false</code> {{E is incorrect because the expression does not always evaluate to false.}}

||The '!' operator is distributed equally to everything inside the brackets, including the relational operators. ||
