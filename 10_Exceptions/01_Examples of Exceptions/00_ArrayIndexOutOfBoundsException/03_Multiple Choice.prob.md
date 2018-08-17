>>Which of the following throws an ArrayIndexOutOfBoundsException? <<

+( )

<pre><code>int[] varOne = new int[5];
System.out.println(varOne[4]);
</code></pre>

{{Incorrect because it compiles and runs without any errors.}}

-( )

+(x)

<pre><code>int[] varOne = new int[5];
System.out.println(varOne[5]);
</code></pre>

{{Correct because index 5 does not exist in <code>varOne</code>.}}

-(x)

+( )

<pre><code>int[] varOne;
System.out.println(varOne[4]);
</code></pre>

{{Incorrect because it causes a compile-time error, not an exception.}}

-( )

+( )

<pre><code>int[] varOne = {1,2,3,4,5,5};
System.out.println(varOne[5]);
</code></pre>

{{Incorrect because it compiles and runs without any errors.}}

-( )

+( )

<pre><code>int[] varOne = {1,2,3,4,5};
System.out.println(varOne[3+varOne[0]]);
</code></pre>

{{Incorrect because it compiles and runs without any errors.}}

-( )

||The last index of an array is always <code>array.length-1</code>. ||