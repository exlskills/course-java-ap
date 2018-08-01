>>What will the value of <code>varOne</code> be after the following expression is evaluated?
<code>double varOne = (5/3) + 2 * 4 % 5</code> <<

( ) A. 5.0 {{A is incorrect because the expression will evaluate to 4.0. Look at the process shown below.}}
( ) B. 4 {{B is incorrect because <code>varOne</code> is a <code>double</code> value.}}
(x) C. 4.0 {{C is correct because it follows the order of operation, which is: 
division/multiplication/modulus, addition/subtraction (left to right)
The process is shown below:
Expression: (5/3) + 2 * 4 % 5
          = 1 + 2 * 4 % 5
          = 1 + 8 % 5
          = 1 + 3
          = 4
          = 4.0 (<code>varOne</code> is a double value, so whole numbers will have a decimal point as well)}}
( ) D. 4.6667 {{D is incorrect because <code>varOne</code> will not only have one decimal point. Look at the process shown above.}}
( ) E. 6.667 {{E is incorrect because the expression will evaluate to 4.0. Look at the process shown above.}}

||How is integer division in Java different from integer division in mathematics? ||
