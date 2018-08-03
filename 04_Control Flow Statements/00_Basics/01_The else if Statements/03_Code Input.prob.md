>>Complete the method <code>closeToTen</code> so that it satisfies the following conditions:
<ol>
<li>Returns the input that is nearest to the value 10.</li>
<li>In the event of a tie, return 0.</li>
</ol>
<p>Use the <code>else if</code> statements when writing your response.
For example:<br/>
<code>closeToTen(8, 13)</code> should return 8<br/>
<code>closeToTen(11, 8)</code> should return 11<br/>
<code>closeToTen(13, 7)</code> should return 0 </p><<

= #!exl::repl('index.prob.repl.yaml')

||You can use <code>Math.abs</code> to calculate how close the parameters are to the value 10. ||