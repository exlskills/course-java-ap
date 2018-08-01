>>Consider the following code segment:</p>
<pre><code class="java language-java">String varOne = "Hello World!";
System.out.println(varOne.indexOf('W'));
</code></pre>
<p>What is printed as a result of executing this code segment? <<

( ) A. 4 {{A is incorrect because the 4th index of "Hello World!" is 'o'.}}
( ) B. 5 {{B is incorrect because the 5th index of "Hello World!" contains a space.}}
(x) C. 6 {{C is correct because the character 'W' exists in the 6th index of "Hello World!".}}
( ) D. 7 {{D is incorrect because the 7th index of "Hello World!" is 'o'.}}
( ) E. An error will be thrown {{E is incorrect because an error would be thrown only if the input of the <code>indexOf()</code> method was not a character. Even if the character does not exist in the String, the method will still return -1, and will not cause an error.}}

||The spacebar in the <code>String</code> counts as a character. ||
