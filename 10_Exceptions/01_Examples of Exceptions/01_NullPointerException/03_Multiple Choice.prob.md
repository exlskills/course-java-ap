>>Which of the following throws a NullPointerException? <<

+( )

<pre><code>Object varOne = null;
System.out.println(varOne);
</code></pre>

{{Incorrect because it compiles and runs without any errors.}}

-( )

+(x)

<pre><code>Object varOne = null;
System.out.println(varOne.toString());
</code></pre>

{{Correct because a null value cannot be converted into a <code>String</code>.}}

-(x)

+( )

<pre><code>Object varOne;
System.out.println(varOne);
</code></pre>

{{Incorrect because it causes a compile-time error, not an exception.}}

-( )

+( )

<pre><code>Object varOne;
System.out.println(varOne.toString());
</code></pre>

{{Incorrect because it causes a compile-time error, not an exception.}}

-( )

+( )

<pre><code>Object varOne = null;
String varTwo = varOne;
System.out.println(varTwo);
</code></pre>

{{Incorrect because it causes a compile-time error, not an exception.}}

-( )

||Null values cannot be used as a object in a program. ||