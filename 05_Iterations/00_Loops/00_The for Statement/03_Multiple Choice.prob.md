>>Consider the following code segment:</p>
<pre><code class="java language-java">String varOne = "abcdef";
for (int count = 0; count &lt; varOne.length()-1; count++){
  System.out.print(varOne.substring(count, count+2));
}
</code></pre>
<p>What is printed as a result of executing this code segment? <<

( ) A. abcdef {{A is incorrect because "abbccddeef" is printed. Look at the process shown below.}}
( ) B. aabbccddeeff {{B is incorrect because "abbccddeef" is printed. Look at the process shown below.}}
( ) C. abcbcdcdedef {{C is incorrect because "abbccddeef" is printed. Look at the process shown below.}}
(x) D. abbccddeef {{D is correct because it accurately represents what the for loop does and the number of times <code>varOne.substring(count, count+2);</code> is printed on the console.
The process is shown below:
When count = 0, <code>varOne.substring(0, 2)</code> = "ab"
When count = 1, <code>varOne.substring(1, 3)</code> = "bc"
When count = 2, <code>varOne.substring(2, 4)</code> = "cd"
When count = 3, <code>varOne.substring(3, 5)</code> = "de"
When count = 4, <code>varOne.substring(4, 6)</code> = "ef"
Adding all these Strings together, you end up with "abbccddeef", which is the correct answer.}}
( ) E. Nothing is printed because an IndexOutOfBoundsException is thrown {{E is incorrect because an error would not occur.}}

||<code>substring(x,y)</code> method includes the character at index "x" but excludes the character at index "y". ||
