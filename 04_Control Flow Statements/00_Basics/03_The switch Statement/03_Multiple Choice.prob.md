>>What is the value of <code>varTwo</code> after the following switch statement is executed?
<pre><code>int varOne = 3;
int varTwo = 4;
switch (varOne+3){
  case 6:
    varTwo = 0;
  case 7:
    varTwo = 1;
  default:
    varTwo += 1;
}
</code></pre><<

( ) 1 {{Incorrect because the statement <code>varTwo += 1</code> is also executed because the <code>break;</code> statement does not exist.}}
(x) 2 {{Correct because after executing the statement <code>varTwo = 0;</code>, the program continues
to execute the statements <code>varTwo = 1;</code> and <code>varTwo += 1;</code> because the <code>break;</code> statement does not exist.}}
( ) 3 {{Incorrect because it is not possible for the statements above to make <code>varTwo</code> equal to 3.}}
( ) 4 {{Incorrect because it is not possible for the statements above to make <code>varTwo</code> equal to 3.}}
( ) 0 {{Incorrect because the statements after case 6 are also executed due to the lack of the <code>break;</code> statement.}}

||The switch statement does not have any <code>break;</code> statements, so every case including the default case is executed. ||
