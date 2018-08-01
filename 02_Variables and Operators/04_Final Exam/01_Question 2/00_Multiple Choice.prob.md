>>What will the value of <code>varOne</code> be after the following expression is evaluated?
<code>double varOne = (5/3) + 2 * 4 % 5</code> <<

( ) 5.0 {{Incorrect because the expression will evaluate to 4.0. Look at the process shown in the third answer choice.}}
( ) 4 {{Incorrect because <code>varOne</code> is a <code>double</code> value.}}
(x) 4.0 {{Correct because it follows the order of operation, which is: 
division/multiplication/modulus, addition/subtraction (left to right)
The process is shown below:
Expression: (5/3) + 2 * 4 % 5
          = 1 + 2 * 4 % 5
          = 1 + 8 % 5
          = 1 + 3
          = 4
          = 4.0 (<code>varOne</code> is a double value, so whole numbers will have a decimal point as well)}}
( ) 4.6667 {{Incorrect because <code>varOne</code> will not only have one decimal point. Look at the process shown in the third answer choice.}}
( ) 6.667 {{Incorrect because the expression will evaluate to 4.0. Look at the process shown in the third answer choice.}}

||How is integer division in Java different from integer division in mathematics? ||
