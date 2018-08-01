>>Consider the following code segment:</p>
<pre><code class="java language-java">int varOne = 0;
for (int count = 0; count &lt; 20; count++)
{
  varOne ++;
  if (varOne &gt; 3){
    break;
  }
}
System.out.println(varOne);
</code></pre>
<p>What is printed as a result of executing this code segment? <<

( ) 2 {{incorrect because 4 is printed. Look at the process shown below.}}
( ) 3 {{incorrect because 4 is printed. Look at the process shown below.}}
(x) 4 {{correct because it accurately represents what the break statement does when the value of <code>varOne</code> is greater than 3.
The process is shown below:
When count = 0, 
<code>varOne++ // varOne = 1</code>
<code>varOne &gt; 3 // false</code></p>
<p>When count = 1, 
<code>varOne++ // varOne = 2</code>
<code>varOne &gt; 3 // false</code></p>
<p>When count = 2, 
<code>varOne++ // varOne = 3</code>
<code>varOne &gt; 3 // false</code></p>
<p>When count = 3, 
<code>varOne++ // varOne = 4</code>
<code>varOne &gt; 3 // true</code>
<code>break; // exits the for loop</code></p>
<p>Therefore, <code>varOne</code> = 4 and "4" will be printed.}}
( ) 5 {{incorrect because 4 is printed. Look at the process shown above.}}
( ) Nothing is printed because an error is thrown. {{incorrect because the statements above will compile and run successfully.}}

||The <code>break;</code> statement causes the program to leave the for statement and jump straight to the <code>System.out.println(varOne)</code> statement. ||
