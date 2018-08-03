>>Consider the following code segment:
<pre><code>ArrayList&lt;Integer&gt; varOne = new ArrayList&lt;Integer&gt;();
int sum = 0;
varOne.add(7);
varOne.add(3);
varOne.add(9);
varOne.set(1,2);
varOne.remove(2);
for(int index = 0; index &lt; varOne.size(); index++){
  sum += varOne.get(index);
}
System.out.println(sum);
</code></pre>
<p>What is printed as a result of executing the code segment? </p><<

( ) 18 {{Incorrect because the remaining two values in the <code>ArrayList</code> add up to 9. View the step-by-step solution for the question by selecting the correct answer, 9.}}
( ) 16 {{Incorrect because the remaining two values in the <code>ArrayList</code> add up to 9. View the step-by-step solution for the question by selecting the correct answer, 9.}}
(x) 9 {{Correct because it accurately represents how the <code>ArrayList</code> methods change the <code>ArrayList</code>.
<p>The process is shown below. Use the comments to guide you through each step:<br/>
<code>ArrayList varOne = new ArrayList();</code> <br/>
// varOne now looks like this: []<br/>
<code>varOne.add(7);</code><br/>
// varOne now looks like this: [7]<br/>
<code>varOne.add(3);</code><br/> 
// varOne now looks like this: [7,3]<br/>
<code>varOne.add(9);</code><br/>
// varOne now looks like this: [7, 3, 9]<br/>
<code>varOne.set(1,2);</code><br/>
// varOne now looks like this: [7, 2, 9]<br/>
<code>varOne.remove(2);</code><br/>
// varOne now looks like this: [7, 2]<br/>
The <code>for</code> statement then adds all the elements of <code>varOne</code>, resulting in 9.</p>}}
( ) 11 {{Incorrect because the remaining two values in the <code>ArrayList</code> add up to 9. View the step-by-step solution for the question by selecting the correct answer, 9.}}
( ) 10 {{Incorrect because the remaining two values in the <code>ArrayList</code> add up to 9. View the step-by-step solution for the question by selecting the correct answer, 9.}}

||The <code>for</code> statement at the end simply returns the sum of the elements inside the <code>ArrayList</code>. ||
