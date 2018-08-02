>>Consider the following code segment:
<pre><code class="java language-java">String varOne = "HelloWorld!";
String varTwo = varOne.substring(0,7);
String varThree = varTwo.substring(2);
String varFour = varThree.substring(0,3);
System.out.println(varFour);
</code></pre>
<p>What is printed as a result of executing this code segment?</p> <<

(x) llo {{Correct because it represents the correct use of the substring method in the code segment above. The process is shown below:<code>String varOne = "HelloWorld!";</code>varOne = "HelloWorld!"<code>String varTwo = varOne.substring(0,7);</code>varTwo = "HelloWo"<code>String varThree = varTwo.substring(2);</code>varThree = "lloWo"<code>String varFour = varThree.substring(0,3);</code> varFour = "llo"}}
( ) ell {{Incorrect because "llo" is printed. Look at the process shown within the first answer choice.}}
( ) ello {{Incorrect because "llo" is printed. Look at the process shown within the first answer choice.}}
( ) lloW {{Incorrect because "llo" is printed. Look at the process shown within the first answer choice.}}
( ) An error would be thrown. {{Incorrect because none of the lines above will cause an error.}}

||<code>substring(x,y)</code> method includes the character at index 'x' but excludes the character at index 'y'. ||
