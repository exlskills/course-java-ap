>>Consider the following code segment:
<pre><code>String varOne = "HelloWorld!";
String varTwo = varOne.substring(0,7);
String varThree = varTwo.substring(2);
String varFour = varThree.substring(0,3);
System.out.println(varFour);
</code></pre>
<p>What is printed as a result of executing this code segment?</p> <<

(x) llo {{Correct because it represents the answer obtained through the proper use of the substring methods in the code segment above.
<p>The process is shown below. Use the comments to guide you through each step:</p><code>String varOne = "HelloWorld!";</code><br/> // varOne = "HelloWorld!"<br/><code>String varTwo = varOne.substring(0,7);<br/></code>// varTwo = "HelloWo"<br/><code>String varThree = varTwo.substring(2);</code><br/>// varThree = "lloWo"<br/><code>String varFour = varThree.substring(0,3);</code><br/>// varFour = "llo"}}
( ) ell {{Incorrect because "llo" is printed. View the step-by-step solution above.}}
( ) ello {{Incorrect because "llo" is printed. View the step-by-step solution above.}}
( ) lloW {{Incorrect because "llo" is printed.  View the step-by-step solution above.}}
( ) An error would be thrown. {{Incorrect because none of the lines above will cause an error.}}

||<code>substring(x,y)</code> method includes the character at index 'x' but excludes the character at index 'y'. ||
