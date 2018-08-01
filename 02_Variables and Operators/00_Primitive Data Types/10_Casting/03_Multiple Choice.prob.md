>>Consider the following code segment:</p>
<pre><code class="java language-java">double piValue = 3.14159;
int radius = 5000;
int circumference = (int)(2 * piValue * radius);
System.out.println(circumference);
</code></pre>
<p>What is printed as a result of executing this code segment? <<

( ) 31416 {{incorrect because Java does not round when converting from a <code>double</code> to an integer.}}
( ) 30000 {{incorrect because Java converts the result of <code>(2 * piValue * radius)</code> into an integer, not <code>piValue</code> into an integer before the calculation.}}
(x) 31415 {{correct because the decimal in 31415.9, the calculated radius, is truncated when converting from a <code>double</code> to an integer.}}
( ) 314159 {{incorrect because this answer is off by one digit and would be correct only if the radius was 50000.}}
( ) 31415.9 {{incorrect because Java truncates the decimal when converting from a <code>double</code> to an integer.}}

||What happens when you convert a double value to an integer? ||
