>>Consider the following code segment:
<pre><code>int varOne = 0;
int varTwo = 1;
varOne = varTwo++;
System.out.println("varOne: " + varOne + " varTwo: " + varTwo)
</code></pre>
<p>What is printed as a result of executing this code segment?</p><<

( ) varOne: 0 varTwo: 0 {{Incorrect because there are expressions or operators that decreases the value of <code>varOne</code> or <code>varTwo</code>.}}
(x) varOne: 1 varTwo: 2 {{Correct because <code>varTwo++</code> returns the current value of <code>varTwo</code> before performing the increment operation. Therefore, <code>varOne</code> is assigned to the original value of <code>varTwo</code> before <code>varTwo</code> increases by 1.}}
( ) varOne: 0 varTwo: 1 {{Incorrect because <code>varOne</code> assigned to the original value of <code>varTwo</code>.}}
( ) varOne: 1 varTwo: 1 {{Incorrect because <code>varTwo</code> increments by 1.}}

||How does <code>varTwo++</code> differ from <code>++varTwo</code>? ||
