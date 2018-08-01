>>Which of the following throws a StringIndexOutOfBoundsException? <<

( ) <pre><code class="java language-java">String varOne = "Java";
System.out.println(varOne.charAt(3));
</code></pre> {{Incorrect because they all compile and run without any errors.}}
( ) <pre><code class="java language-java">String varOne = "Java" + Hello;
System.out.println(varTwo.charAt(4));
</code></pre> {{Incorrect because it causes a compile-time error, not an exception.}}
( ) <pre><code class="java language-java">String varOne = "Java";
System.out.println(varOne.substring(0,4));
</code></pre> {{Incorrect because they all compile and run without any errors.}}
(x) <pre><code class="java language-java">String varOne = "Java";
System.out.println(varOne.charAt(4));
</code></pre> {{Correct because the index 4 does not exist in the <code>String</code> "Java".}}
( ) <pre><code class="java language-java">String varOne = "Java" + '!';
System.out.println(varTwo.charAt(4));
</code></pre> {{Incorrect because they all compile and run without any errors.}}

||The last index of a <code>String</code> is always <code>string.length() - 1</code>. ||
