>>Consider the following code:</p>
<pre><code class="java language-java">String varOne = new String("Hi There");
String varTwo = new String("Hi There");
String varThree = varOne;
</code></pre>
<p>After this code is executed, which of the following statements will evaluate to TRUE?</p>
<p>I.   <code>varOne == varTwo</code>
II.  <code>varOne.equals(varTwo)</code>
III. <code>varOne == varThree</code>
IV.  <code>varTwo.equals(varThree)</code> <<

( ) A. II {{A is incorrect because III and IV will also evaluate to true because all three strings hold the value "Hi There".}}
( ) B. IV {{B is incorrect because II and III will also evaluate to true because all three strings hold the value "Hi There".}}
( ) C. II and IV {{C is incorrect because III will also evaluate to true because the reference for <code>varOne</code> and <code>varThree</code> is the same.}}
(x) D. II, III and IV {{D is correct because all three variables hold the same value, and the reference for <code>varOne</code> and <code>varThree</code> is the same.}}
( ) E. I, II and III {{E is incorrect because I will evaluate to false due to the fact that <code>varOne</code> and <code>varTwo</code> don't share the same reference.}}

||"==" compares the reference while ".equals()" compares the values inside the <code>String</code>. ||
