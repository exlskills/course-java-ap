>>Consider the following code segment:</p>
<pre><code class="java language-java">String varOne = "abc";
String varTwo = varOne;
String varThree = varTwo;
</code></pre>
<p>After this code is executed, which of the following statements will evaluate to true?</p>
<p>I.   <code>varOne.equals(varThree)</code>
II.  <code>varOne == varTwo</code>
III. <code>varOne == varThree</code> <<

( ) I {{Incorrect because II will also evaluate to true because all three Strings share the same reference as <code>varOne</code>.}}
( ) II {{Incorrect because III will also evaluate to true because all three Strings share the same reference as <code>varOne</code>.}}
( ) III {{Incorrect because I will also evaluate to true because <code>varOne</code> and <code>varThree</code> are both "abc".}}
( ) II and III {{Incorrect because I will also evaluate to true because <code>varOne</code> and <code>varThree</code> are both "abc".}}
(x) I, II and III {{Correct because I, II, and III all share the same reference and hold the same <code>String</code> value.}}

||"==" compares the reference while <code>.equals()</code> compares the values inside the <code>String</code>. ||
