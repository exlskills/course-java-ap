>>Consider the following code segment:
<pre><code>char varOne = 'a';
switch (varOne){
  case 'a':
  case 'A':
    System.out.print(varOne);
    break;
  case 'b':
  case 'B':
    System.out.println(varOne);
    break.;
  case 'c':
  case 'C':
    System.out.print(varOne);
    break;
  case 'd';
  case 'D':
    System.out.print(varOne);
</code></pre>
<p>What is printed as a result of executing this code segment?</p> <<

(x) a {{Correct because <code>case 'a'</code> does not have a <code>break;</code> statement, so the statements under <code>case 'A'</code> will be executed.}}
( ) aa {{Incorrect because the <code>break;</code> statement under <code>case 'A'</code> will cause the program to exit the switch statement.}}
( ) ab {{Incorrect because the value of <code>varOne</code> is always 'a' and will not change to 'b'}}
( ) abc {{Incorrect because the value of <code>varOne</code> is always 'a' and will not change to 'b' or 'c'}}
( ) abcd {{Incorrect because the value of <code>varOne</code> is always 'a' and will not change to 'b', 'c' or 'd'.}}

||Where is the first <code>break;</code> statement in the switch statement located? ||