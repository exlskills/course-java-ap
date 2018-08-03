>>Complete the method <code>compareArr</code> so that it satisfies the following conditions:
<ol>
<li>Return the array with the larger sum</li>
<li>In the event of a tie, return the first array in the parameter</li>
</ol>
<p>For example, given:<br/>
<pre><code>int[] varOne = {1, 2};</code>
<code>int[] varTwo = {3, 4};</code>
<code>int[] varThree = {0, 3};</code></pre>
<code>compareArr(varOne, varTwo)</code> should return <code>varTwo</code>
<code>compareArr(varTwo, varOne)</code> should return <code>varTwo</code>
<code>compareArr(varThree, varOne)</code> should return <code>varThree</code></p>
<p>Assume that the length of the array will always be two. </p><<

= #!exl::repl('index.prob.repl.yaml')

||Since the length of the array is always two, you can use <code>paramOne[0]</code> and <code>paramOne[1]</code> to answer the question. ||
