>>Consider the following code segment:</p>
<pre><code class="java language-java">int varOne = 24;
int varTwo = 30;
while (varTwo != 0){
  int varThree = varOne % varTwo;
  varOne = varTwo;
  varTwo = varThree;
}
System.out.println(varOne);
</code></pre>
<p>What is printed as a result of executing the code segment? <<

( ) A. 0 {{A is incorrect because 6 is printed. Look at the process shown below.}}
(x) B. 6 {{B is correct because it accurately represents what the while loop does and the number of times the body of the while loop is executed.
The process is shown below:
When varTwo = 30,
<code>varTwo != 0 // true</code>
<code>int varThree = varOne % varTwo // varThree = 24%30 = 24</code>
<code>varOne = varTwo // varOne = 30</code>
<code>varTwo = varThree // varTwo = 24</code></p>
<p>When varTwo = 24,
<code>varTwo != 0 // true</code>
<code>int varThree = varOne % varTwo // varThree = 30%24 = 6</code>
<code>varOne = varTwo // varOne = 24</code>
<code>varTwo = varThree // varTwo = 6</code></p>
<p>When varTwo = 6,
<code>varTwo != 0 // true</code>
<code>int varThree = varOne % varTwo // varThree = 24%6 = 0</code>
<code>varOne = varTwo // varOne = 6</code>
<code>varTwo = varThree // varTwo = 0</code></p>
<p>When varTwo = 0,
<code>varTwo != 0 // false</code></p>
<p>Therefore, <code>varOne</code> = 6 and 6 will be printed as a result of executing the code segment.}}
( ) C. 12 {{C is incorrect because 6 is printed. Look at the process shown below.}}
( ) D. 24 {{D is incorrect because 6 is printed. Look at the process shown below.}}
( ) E. 30 {{E is incorrect because 6 is printed. Look at the process shown below.}}

||Pay attention to each variable and how it changes as the program is executed. ||
