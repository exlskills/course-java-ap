>>Consider the following code segment:

```
ExampleClass exampleClassOne = new ExampleClass();
ExampleClass exampleClassTwo = new ExampleClass();
ExampleClass exampleClassThree = exampleClassTwo;
```

<p>After this code is executed, which of the following statements will evaluate to TRUE?</p>
<p>I.   <code>exampleClassOne.equals(exampleClassThree)</code><br/>
II.  <code>exampleClassOne == exampleClassTwo</code><br/>
III. <code>exampleClassOne == exampleClassThree</code></p>
<<

( ) I {{Incorrect because the reference between <code>exampleClassOne</code> and <code>exampleClassThree</code> is different.}}
( ) II {{Incorrect because the reference between <code>exampleClassOne</code> and <code>exampleClassTwo</code> is different.}}
( ) III {{Incorrect because the reference between <code>exampleClassOne</code> and <code>exampleClassThree</code> is different.}}
( ) I, II, III {{Incorrect because the reference between <code>exampleClassOne</code> and <code>exampleClassTwo</code> is different.}}
(x) None of the above. {{Correct because only <code>exampleClassTwo</code> and <code>exampleClassThree</code> have the same reference.}}

||Which objects have the same reference? ||
