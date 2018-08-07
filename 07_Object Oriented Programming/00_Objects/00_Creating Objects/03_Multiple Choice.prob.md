>>Which statement would we use to create an object from ExampleClass? <<

( ) <pre><code>ExampleClass exampleClass = ExampleClass();</code></pre> {{Incorrect because the Java reserved word <code>new</code> is not used.}}
(x) <pre><code>ExampleClass exampleClass = new ExampleClass();</code></pre> {{Correct because it declares the variable <code>exampleClass</code> as a type of <code>ExampleClass</code> and creates an object.}}
( ) <pre><code>ExampleClass exampleClass = new ExampleClass;</code></pre>{{Incorrect because <code>new ExampleClass</code> is missing a set of parenthesis.}}
( ) <pre><code>ExampleClass exampleClass;</code></pre>{{Incorrect because it only declares a variable of the type <code>ExampleClass</code> and does not create the object.}}
( ) <pre><code>new ExampleClass() = exampleClass;</code></pre>{{Incorrect because the syntax is flipped and it should be <code>ExampleClass exampleClass = new ExampleClass();</code>.}}

||The Java reserved word <code>new</code> has to be used when creating an object. ||