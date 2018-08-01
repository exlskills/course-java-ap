>>Given the following code segment, what is the value of varTwo?</p>
<pre><code class="java language-java">double varOne = 9.692;
int varTwo = 12;
varTwo = (int)varOne;
</code></pre> <<

( ) A. 12 {{A is incorrect because this is the initial value of <code>varTwo</code>, <code>(int)varOne</code> does not result in 12.}}
( ) B. 10 {{B is incorrect because Java does not round when converting from a <code>double</code> to an <code>int</code> value.}}
(x) C. 9 {{C is correct because a <code>double</code> truncates the digits after the decimal when it is converted into an <code>int</code> value.}}
( ) D. 9.692 {{D is incorrect because this is the value of <code>varOne</code>, not <code>varTwo</code>.}}
( ) E. 12.692 {{E is incorrect because <code>varTwo</code> is declared and initialized as a integer.}}

||Is <code>varTwo</code> an integer or a double? ||
