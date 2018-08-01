>>Assume that an array of integer values has been declared as follows and has been initialized.
<code>int[] varOne = new int[10];</code>
Which of the following code segments correctly interchanges the value of <code>varOne[0]</code> and <code>varOne[5]</code>? <<

( ) <code>varOne[0] = 5;</code>
<code>varOne[5] = 0;</code> {{Incorrect because the integer that <code>varOne[0]</code> and <code>varOne[5]</code> hold may not be 5 and 0 respectively.}}
( ) <code>varOne[0] = varOne[5];</code>
<code>varOne[5] = varOne[0];</code> {{Incorrect because both <code>varOne[0]</code> and <code>varOne[5]</code> will be equal to the original value of <code>varOne[5]</code> after the code is executed.}}
(x) <br />
 <code>java
int varTwo = varOne[0];
varOne[0] = varOne[5];
varOne[5] = varTwo;
</code> {{Correct because accurately interchanges the value of <code>varOne[0]</code> and <code>varOne[5]</code>. Without the use of another integer variable, it is impossible to interchange the values of <code>varOne[0]</code> and <code>varOne[5]</code>.}}
( ) <br />
 <code>java
int varTwo = varOne[5];
varOne[0] = varOne[5];
varOne[5] = varTwo;
</code> {{Incorrect because both <code>varOne[0]</code> and <code>varOne[5]</code> will be equal to the original value of <code>varOne[5]</code> after the code is executed.}}
( ) <br />
 <code>java
int varTwo = varOne[5];
varOne[5] = varOne[0];
varOne[0] = varOne[5];
</code> {{Incorrect because both <code>varOne[0]</code> and <code>varOne[5]</code> will be equal to the original value of <code>varOne[0]</code> after the code is executed.}}

||A temporary variable must be created and used in order to successfully interchange the two values. ||
