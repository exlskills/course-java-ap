>>Consider the following code segment:</p>
<pre><code class="java language-java">double varOne; 
int varTwo = 56; 
int varThree = 25; 
varOne = varTwo / varThree; 
System.out.println(varOne);
</code></pre>
<p>What is printed as a result of executing this code segment? <<

( ) A. 2 {{A is incorrect because <code>result</code> is a double value, so it should have a decimal.}}
(x) B. 2.0 {{B is correct because <code>varTwo</code> and <code>varThree</code> are both integers, so Java will perform integer division and then assign the value to <code>varOne</code>, a double value.}}
( ) C. 2.2 {{C is incorrect because the decimal is truncated when the integer division is performed.}}
( ) D. 2.24 {{D is incorrect because the decimal is truncated when the integer division is performed.}}
( ) E. An error will occur. {{E is incorrect because no precision is lost when converting from an integer value to a double value. However, if it was a double division assigned to an integer, an error would occur because precision is lost.}}

||What happens when you divide two integers that don’t divide perfectly? ||
