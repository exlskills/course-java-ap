>>Consider the following code segment:</p>
<pre><code class="java language-java">String varOne = "abc";
String varTwo = varOne;
String varThree = varTwo;
</code></pre>
<p>After this code is executed, which of the following statements will evaluate to true?</p>
<p>I.   <code>varOne.equals(varThree)</code>
II.  <code>varOne == varTwo</code>
III. <code>varOne == varThree</code> <<

( ) II {{incorrect because II will also evaluate to true because all three Strings share the same reference as <code>varOne</code>.}}
( ) III {{incorrect because III will also evaluate to true because all three Strings share the same reference as <code>varOne</code>.}}
( ) II and III {{incorrect because I will also evaluate to true because <code>varOne</code> and <code>varThree</code> are both "abc".}}
( ) I, II and III {{incorrect because I will also evaluate to true because <code>varOne</code> and <code>varThree</code> are both "abc".}}

||"==" compares the reference while ".equals()" compares the values inside the <code>String</code>. ||
