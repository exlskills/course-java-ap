>>Which of the following would assign <code>varOne</code> to a random single-digit odd integer? <<

( ) <code>int varOne = (int)(Math.random()*5*2) + 1;</code> {{Incorrect because <code>varOne</code> would be a random whole number between 0 - 10.}}
( ) <code>int varOne = (int)Math.random()*5*2 + 1;</code> {{Incorrect because <code>varOne</code> would always be 1. This is because <code>(int)Math.random()</code> always returns 0.}}
( ) <code>int varOne = (int)(Math.random()*10) + 1;</code> {{Incorrect because <code>varOne</code> would be a random whole number between 0 - 10.}}
(x) <code>int varOne = ((int)(Math.random()*5))*2 + 1;</code> {{Correct because it accurately returns a random single digit odd number.
The process is shown below:
<code>Math.random()</code>:                   0.0 &lt;= varOne &lt; 1.0
<code>Math.random() * 5</code>:               0.0 &lt;= varOne &lt; 5.0
<code>(int)(Math.random() * 5)</code>:        varOne = 0 or 1 or 2 or 3 or 4
<code>(int)(Math.random() * 5)*2</code>:      varOne = 0 or 2 or 4 or 6 or 8
<code>(int)(Math.random() * 5)*2 + 1</code>:  varOne = 1 or 3 or 5 or 7 or 9}}
( ) <code>int varOne = (int)(Math.random()*9) + 1;</code> {{Incorrect because <code>varOne</code> would be a random whole number between 0 - 9.}}

||<code>Math.random()</code> gives you a random number that is greater than or equal to 0 and less than 1. ||
