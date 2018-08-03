>>Consider the following code segment:
<pre><code class="java language-java">if (varOne &gt; 0){
  varOne = -varOne;     
} 
if (varOne &lt; 0){
 varOne = 0;    
}
</code></pre>
<p>Which of the following is this code segment equivalent to?</p><<

( ) <pre><code class="java language-java">if (varOne &gt; 0){<br/>  varOne = 0;<br/>} </code></pre> {{Incorrect because even if <code>varOne</code> is less than 0, <code>varOne</code> will still equal 0 after the code segment in the question is executed.}}
( ) <pre><code class="java language-java">if (varOne &lt; 0){<br/>  varOne = 0;<br/>} </code></pre> {{Incorrect because even if <code>varOne</code> is greater than 0, <code>varOne</code> will still equal 0 after the code segment in the question is executed.}}
(x) <code>varOne = 0;</code> {{Correct because the code segment from the question always results in setting <code>varOne</code> to 0.}}
( ) <pre><code class="java language-java">if (varOne &gt; 0){<br/>  varOne = -varOne;<br/>} </code></pre> {{Incorrect because it lacks the functions of the second <code>if else</code> statement that exists in the code segment from the question.}}
( ) <pre><code class="java language-java">if (varOne &lt; 0){<br/>  varOne = 0;<br/>} else {<br/>  varOne = -1;<br/>} </code></pre> {{Incorrect because this answer choice flips the order of the <code>if else</code> statements.}}

||When <code>varOne</code> starts out to be a positive number, it is reassigned to a negative number before executing the second if statement. ||
