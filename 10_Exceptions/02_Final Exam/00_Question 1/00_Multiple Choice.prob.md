>>Consider the following code segment:</p>
<pre><code class="java language-java">try{
  System.out.println("Hello" + 1 / 0);
} catch (ArithmeticException e){
  System.out.print("World");
}
</code></pre>
<p>What is printed as a result of executing this code segment? <<

( ) Hello {{Incorrect because "1/0" is an example of an <code>ArithmeticException</code>.}}
(x) World {{Correct because "1 / 0" causes an <code>ArithmeticException</code> and the exception is caught by the <code>catch</code> block, thus printing "World".}}
( ) HelloWorld {{Incorrect because the statement <code>System.out.println("Hello" + 1 / 0);</code> will not print "Hello" due to the <code>ArithmeticException</code>.}}
( ) Hello World {{Incorrect because the statement <code>System.out.println("Hello" + 1 / 0);</code> will not print "Hello" due to the <code>ArithmeticException</code>.}}
( ) None of the above {{Incorrect because "1/0" will causes an <code>ArithmeticException</code> and print "World".}}

||<code>try</code> and <code>throw</code> are not used to handle exceptions in a program. ||
