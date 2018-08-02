>>Given the following code segment:
<pre><code class="java language-java">String varOne = "ab";
String varTwo = varOne;
varOne = varOne + varTwo + "c";
</code></pre>
<p>Which of the following is in the string referenced by <code>varOne</code>?</p><<

( ) abc {{Incorrect because <code>varOne</code> will equal "ab" plus another "ab" plus "c" at the end.}}
(x) ababc {{Correct because <code>varOne</code> contains the original value, plus itself, plus "c".}}
( ) ab ab {{Incorrect because no spaces were added during concatenation. Also, it is missing the "c" at the end of the <code>String</code>.}}
( ) ab c {{Incorrect because no spaces were added during concatenation. Also, it is missing the "ab" at the beginning of the <code>String</code>.}}
( ) c {{Incorrect because <code>varOne</code> was initially set to "ab", so the final answers will have to include "ab" as well, not just "c".}}

||There are no spaces in any of the <code>String</code> variables listed in the code segment. ||
