>>Consider the following code segment:</p>
<pre><code class="java language-java">int varOne = 0;
int varTwo = 10;
varOne = --varTwo;
System.out.println("varOne: " + varOne + " varTwo: " + varTwo)
</code></pre>
<p>What is printed as a result of executing this code segment? <<

( ) varOne: 9 varTwo: 11 {{incorrect because the value of <code>varTwo</code> cannot increase from any of the statements above.}}
( ) varOne: 0 varTwo: 9 {{incorrect because the value of <code>varOne</code> changes to 9.}}
( ) varOne: 10 varTwo: 9 {{incorrect because <code>varOne</code> is assigned to the value 9, not 10.}}
(x) varOne: 9 varTwo: 9 {{correct because <code>--varTwo</code> performs the decrement operation before returning the current value of <code>varTwo</code>. Therefore, <code>varOne</code> is assigned to the new value of <code>varTwo</code>, making <code>varOne</code> also equal to 9.}}

||How does <code>—-varTwo</code> differ from <code>varTwo—</code>? ||
