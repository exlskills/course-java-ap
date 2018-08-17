>>Consider the following code segment:

```
int varOne = 0;
int varTwo = 10;
varOne = --varTwo;
System.out.println("varOne: " + varOne + " varTwo: " + varTwo);
```

What is printed as a result of executing this code segment?<<

( ) varOne: 9 varTwo: 11 {{Incorrect because the value of <code>varTwo</code> cannot increase from any of the statements above.}}
( ) varOne: 0 varTwo: 9 {{Incorrect because the value of <code>varOne</code> changes to 9.}}
( ) varOne: 10 varTwo: 9 {{Incorrect because <code>varOne</code> is assigned to the value 9, not 10.}}
(x) varOne: 9 varTwo: 9 {{Correct because <code>--varTwo</code> performs the decrement operation before returning the current value of <code>varTwo</code>. Therefore, <code>varOne</code> is assigned to the new value of <code>varTwo</code>, making <code>varOne</code> also equal to 9.}}

||How does <code>—-varTwo</code> differ from <code>varTwo—</code>? ||
