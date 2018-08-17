>>Assume that an array of integer values has been declared as follows and has been initialized.
<code>int[] varOne = new int[10];</code>
Which of the following code segments correctly interchanges the value of <code>varOne[0]</code> and <code>varOne[5]</code>? <<

+( )

<pre><code>varOne[0] = 5;
varOne[5] = 0;
</code></pre>

{{Incorrect because the integer that <code>varOne[0]</code> and <code>varOne[5]</code> hold may not be 5 and 0 respectively.}}

-( )

+( )

<pre><code>varOne[0] = varOne[5];
varOne[5] = varOne[0];
</code></pre>

{{Incorrect because both <code>varOne[0]</code> and <code>varOne[5]</code> will be equal to the original value of <code>varOne[5]</code> after the code is executed.}}

-( )

+(x)

<pre><code>int varTwo = varOne[0];
varOne[0] = varOne[5];
varOne[5] = varTwo;
</code></pre>

{{Correct because accurately interchanges the value of <code>varOne[0]</code> and <code>varOne[5]</code>. Without the use of another integer variable, it is impossible to interchange the values of <code>varOne[0]</code> and <code>varOne[5]</code>.}}

-(x)

+( )

<pre><code>int varTwo = varOne[5];
varOne[0] = varOne[5];
varOne[5] = varTwo;
</code></pre>

{{Incorrect because both <code>varOne[0]</code> and <code>varOne[5]</code> will be equal to the original value of <code>varOne[5]</code> after the code is executed.}}

-( )

+( )

<pre><code>int varTwo = varOne[5];
varOne[5] = varOne[0];
varOne[0] = varOne[5];
</code></pre>

{{Incorrect because both <code>varOne[0]</code> and <code>varOne[5]</code> will be equal to the original value of <code>varOne[0]</code> after the code is executed.}}

-( )

||A temporary variable must be created and used in order to successfully interchange the two values. ||