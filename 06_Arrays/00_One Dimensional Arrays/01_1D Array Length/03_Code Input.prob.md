>>Complete the method <code>commonStartEnd</code> so that it satisfies the following condition:<br/>
Return true if both arrays have the same first element or the same last element
<p>Assume that the length of the array is greater than or equal to 1.
Use <code>array.length</code> when writing your response.<br/>
For example, given:<br/>
<pre><code>int[] varOne = {1, 2, 3};</code>
<code>int[] varTwo = {7, 3};</code>
<code>int[] varThree = {7, 3, 2};</code></pre>
<code>commonStartEnd(varOne, varTwo)</code> should return true
<code>commonStartEnd(varTwo, varThree)</code> should return true
<code>commonStartEnd(varOne, varThree)</code> should return false</p><<

= #!exl::repl('index.prob.repl.yaml')

||Use <code>paramOne.length-1;</code> to indicate the last index of the array. ||
