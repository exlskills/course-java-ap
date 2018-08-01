>>Consider the following code segment:</p>
<pre><code class="java language-java">int[][] varOne = {{1, 2, 3, 6}, {5, 8, 9, 10}, {7, 6, 7, 8}};
System.out.println(varOne[1].length);
</code></pre>
<p>What is printed as a result of executing this code segment? <<

( ) 1 {{Incorrect because it returns the value of varOne[0][0].}}
( ) 3{{Incorrect because it returns the length of the row in <code>varOne</code>.}}
(x) 4 {{Correct because <code>varOne[1].length</code> returns the length of the second inner array, which is 4.}}
( ) 6{{Incorrect because it returns the value of varOne[0][3].}}
( ) An error would occur.{{Incorrect because the two dimensional array was declared and initialized with the right syntax.}}

||<code>varOne[1]</code> refers to the second row of the 2-dimensional array. ||
