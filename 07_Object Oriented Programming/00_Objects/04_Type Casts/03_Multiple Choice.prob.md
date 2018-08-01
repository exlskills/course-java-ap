>>Consider the following code:</p>
<pre><code class="java language-java">String varOne = "Welcome to Java";
Object varTwo = varOne;
String varThree = (String)varTwo;
</code></pre>
<p>Which of the following statements is true? <<

( ) A. When assigning <code>varOne</code> to <code>varTwo</code> in <code>Object varTwo = varOne</code>, a new object is created. {{A is incorrect because it changes the reference of <code>varTwo</code> to <code>varOne</code> and does not create a new object.}}
(x) B. <code>varOne</code>, <code>varTwo</code>, and <code>varThree</code> reference the same String object. {{B is correct because <code>varTwo</code> and <code>varThree</code> both refer to the <code>String</code> "Welcome to Java".}}
( ) C. When casting <code>varTwo</code> to <code>varOne</code> in <code>String varThree = (String)varTwo</code>, a new object is created. {{C is incorrect because casting an object does not result in creating a new object.}}
( ) D. When casting <code>varTwo</code> to <code>varOne</code> in <code>String varThree = (String)varTwo</code>, the contents of <code>varTwo</code> is changed. {{D is incorrect because casting an object does not affect the contents of the object.}}

||New objects are not created but referenced in the code above. ||
