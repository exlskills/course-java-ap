>>Consider the following code segment:
<pre><code class="java language-java">String varOne = "abcdef";
for (int count = 0; count &lt; varOne.length()-1; count++){
  System.out.print(varOne.substring(count, count+2));
}
</code></pre>
<p>What is printed as a result of executing this code segment?</p><<

( ) abcdef {{Incorrect because "abbccddeef" is printed. Look at the process shown within the fourth answer choice.}}
( ) aabbccddeeff {{Incorrect because "abbccddeef" is printed. Look at the process shown within the fourth answer choice.}}
( ) abcbcdcdedef {{Incorrect because "abbccddeef" is printed. Look at the process shown within the fourth answer choice.}}
(x) abbccddeef {{Correct because it accurately represents what the for loop does and the number of times <code>varOne.substring(count, count+2);</code> is printed on the console.
The process is shown below:
When count = 0, <code>varOne.substring(0, 2)</code> = "ab"
When count = 1, <code>varOne.substring(1, 3)</code> = "bc"
When count = 2, <code>varOne.substring(2, 4)</code> = "cd"
When count = 3, <code>varOne.substring(3, 5)</code> = "de"
When count = 4, <code>varOne.substring(4, 6)</code> = "ef"
Adding all these strings together, you end up with "abbccddeef", which is the correct answer.}}
( ) Nothing is printed because an IndexOutOfBoundsException is thrown {{Incorrect because an error would not occur.}}

||<code>substring(x,y)</code> method includes the character at index 'x' but excludes the character at index 'y'. ||
