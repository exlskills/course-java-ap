>>Consider the following code:
<pre><code>String varOne = "Welcome to Java";
Object varTwo = varOne;
String varThree = (String)varTwo;
</code></pre>
<p>Which of the following statements is true?</p><<

( ) When assigning <code>varOne</code> to <code>varTwo</code> in <code>Object varTwo = varOne</code>, a new object is created. {{Incorrect because it changes the reference of <code>varTwo</code> to <code>varOne</code> and does not create a new object.}}
(x) <code>varOne</code>, <code>varTwo</code>, and <code>varThree</code> reference the same String object. {{Correct because <code>varTwo</code> and <code>varThree</code> both refer to the <code>String</code> "Welcome to Java".}}
( ) When casting <code>varTwo</code> to <code>varOne</code> in <code>String varThree = (String)varTwo</code>, a new object is created. {{Incorrect because casting an object does not result in creating a new object.}}
( ) When casting <code>varTwo</code> to <code>varOne</code> in <code>String varThree = (String)varTwo</code>, the contents of <code>varTwo</code> is changed. {{Incorrect because casting an object does not affect the contents of the object.}}

||New objects are not created but referenced in the code above. ||
