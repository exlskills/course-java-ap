>>Complete the method <code>totalSum</code> so that it satisfies the following conditions:
<ol>
<li>Returns the sum of three integers</li>
<li>If one of the values are 13, it does not count towards the sum and values to its right do not count either.
Use the <code>else if</code> statements when writing your response.</li>
</ol>
<p>For example:<br/>
<code>totalSum(1, 2, 3)</code> should return 6<br/>
<code>totalSum(3, 2, 13)</code> should return 5<br/>
<code>totalSum(3, 13, 3)</code> should return 3 </p><<

= #!exl::repl('index.prob.repl.yaml')

||You can stack <code>else if</code> statements and a final <code>else</code> statement to complete this question. ||
