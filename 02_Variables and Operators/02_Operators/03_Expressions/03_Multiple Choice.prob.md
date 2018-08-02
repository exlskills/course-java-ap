>>Consider the following code segment:
<pre><code class="java language-java">double varOne; 
int varTwo = 56; 
int varThree = 25; 
varOne = varTwo / varThree; 
System.out.println(varOne);
</code></pre>
<p>What is printed as a result of executing this code segment?</p><<

( ) 2 {{Incorrect because <code>result</code> is a <code>double</code> value, so it should have a decimal.}}
(x) 2.0 {{Correct because <code>varTwo</code> and <code>varThree</code> are both integers, so Java will perform integer division and then assign the value to <code>varOne</code>, a <code>double</code> value.}}
( ) 2.2{{Incorrect because the decimal is truncated when the integer division is performed.}}
( ) 2.24{{Incorrect because the decimal is truncated when the integer division is performed.}}
( ) An error will occur.{{Incorrect because no precision is lost when converting from an <code>int</code> value to a <code>double</code> value. However, if it was a double division assigned to an integer, an error would occur because precision is lost.}}

||What happens when you divide two integers that don’t divide perfectly? ||
