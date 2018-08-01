>>Consider the following code segment:</p>
<pre><code class="java language-java">ExampleClass exampleClassOne = new ExampleClass();
ExampleClass exampleClassTwo = new ExampleClass();
ExampleClass exampleClassThree = exampleClassTwo;
</code></pre>
<p>After this code is executed, which of the following statements will evaluate to TRUE?</p>
<p>I.   <code>exampleClassOne.equals(exampleClassThree)</code>
II.  <code>exampleClassOne == exampleClassTwo</code>
III. <code>exampleClassOne == exampleClassThree</code></p>
<h1 id="qasb">!QAS-B</h1> <<

( ) A. I {{A is incorrect because the reference between <code>exampleClassOne</code> and <code>exampleClassThree</code> is different.}}
( ) B. II {{B is incorrect because the reference between <code>exampleClassOne</code> and <code>exampleClassTwo</code> is different.}}
( ) C. III {{C is incorrect because the reference between <code>exampleClassOne</code> and <code>exampleClassThree</code> is different.}}
( ) D. I, II, III {{D is incorrect because the reference between <code>exampleClassOne</code> and <code>exampleClassTwo</code> is different.}}
(x) E. None of the above. {{E is correct because only <code>exampleClassTwo</code> and <code>exampleClassThree</code> have the same reference.}}

||Which objects have the same reference? ||
