>>Consider the following statement:<br/>
<code>System.out.println("Hello" + 1 + 2 + 3);</code><br/>
What is printed as a result of executing this statement? <<

(x) Hello123 {{Correct because Java rules for expressions state that if one operand of the '+' operator is a <code>String</code> and the other isn't, then the one that isn't a <code>String</code> is converted into a <code>String</code>. Therefore, '1', '2', '3' are considered as a <code>String</code> during the evaluation of the expression.}}
( ) Hello6 {{Incorrect because '1', '2', '3' are considered as a <code>String</code> during the evaluation of the expression.}}
( ) Hello 1 2 3 {{Incorrect because the print statement does not include spaces.}}
( ) Hello 123 {{Incorrect because the print statement does not include spaces.}}

||There are no spaces inside the brackets of <code>System.out.println()</code>. ||
