>>Given the following code segment:</p>
<pre><code class="java language-java">String varOne = "ab";
String varTwo = varOne;
varOne = varOne + varTwo + "c";
</code></pre>
<p>Which of the following is in the string referenced by varOne? <<

( ) A. abc {{A is incorrect because varOne will equal "ab" plus another "ab" plus "c" at the end.}}
(x) B. ababc {{B is correct because varOne contains the original value, plus itself, plus "c".}}
( ) C. ab ab {{C is incorrect because no spaces were added during concatenation. Also, it is missing the "c" at the end of the <code>String</code>.}}
( ) D. ab c {{D is incorrect because no spaces were added during concatenation. Also, it is missing the "ab" at the beginning of the <code>String</code>.}}
( ) E. c {{E is incorrect because varOne was initially set to "ab", so the final answers will have to include "ab" as well, not just "c".}}

||There are no spaces in any of the <code>String</code> variables listed in the code segment. ||
