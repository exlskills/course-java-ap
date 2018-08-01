>>Consider the code segment below:</p>
<pre><code class="java language-java">double[] varOne = {2.5, 3, 4};
for (double varTwo: varOne){
  System.out.print(varTwo + " ");
}
</code></pre>
<p>What is printed as a result of executing this code segment? <<

( ) 2.5, 3, 4 {{Incorrect because commas are not in the print statement.}}
(x) 2.5 3.0 4.0 {{Correct because all the values printed are doubles that are separated by spaces.}}
( ) 2.5 3 4 {{Incorrect because some of the values are not represented as a <code>double</code>.}}
( ) 2.5, 3.0 4.0 {{Incorrect because because commas are not in the print statement.}}
( ) An error would occur. {{Incorrect because the for-each loop works properly and prints the elements of the array accurately.}}

||<code>varOne</code> is an array of doubles, not integers. ||
