>>Consider the following code segment:
<pre><code>ArrayList&lt;String&gt; varOne = new ArrayList&lt;String&gt;();
varOne.add("Java");
varOne.add("C++");
varOne.add("Python");
varOne.set(2, "HTML");
varOne.add(1, "JavaScript");
varOne.remove(3);
System.out.println(varOne);
</code></pre>
<p>What is printed as a result of executing the code segment?</p><<

(x) [Java, JavaScript, C++] {{Correct because it accurately represents how the <code>ArrayList</code> methods change the <code>ArrayList</code>. 
<p>The process is shown below. Use the comments to guide you through each step:</p> <code>ArrayList varOne = new ArrayList();</code><br/>// varOne now looks like this: []<br/> <code>varOne.add("Java");</code><br/> // varOne now looks like this: [Java]<br/> <code>varOne.add("C++");</code><br/> // varOne now looks like this: [Java, C++]<br/><code>varOne.add("Python");</code><br/> // varOne now looks like this: [Java, C++, Python]<br/><code>varOne.set(2, "HTML");</code><br/> // varOne now looks like this: [Java, C++, HTML]<br/><code>varOne.add(1, "JavaScript");</code><br/> // varOne now looks like this: [Java, JavaScript, C++, HTML]<br/><code>varOne.remove(3);</code><br/> // varOne now looks like this: [Java, JavaScript, C++] <p>Therefore, "[Java, JavaScript, C++]" is printed. Note that <code>ArrayList</code> can be printed directly to the console unlike arrays.</p>}}
( ) [Java, JavaScript, HTML] {{Incorrect because "HTML" is removed from the <code>ArrayList</code>. View the step-by-step solution for the question by selecting the correct answer, [Java, JavaScript, C++].}}
( ) [Java, HTML, JavaScript] {{Incorrect because "HTML" is removed from the <code>ArrayList</code>. View the step-by-step solution for the question by selecting the correct answer, [Java, JavaScript, C++].}}
( ) [JavaScript, Java, C++] {{Incorrect because the order of the elements are incorrect. View the step-by-step solution for the question by selecting the correct answer, [Java, JavaScript, C++].}}
( ) An error would occur. {{Incorrect because an error would not occur due to the proper use of these methods.}}

||<code>set(x)</code> changes the value of the element at index 'x'. ||
