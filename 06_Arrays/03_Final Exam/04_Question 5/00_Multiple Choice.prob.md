>>Consider the following code segment:</p>
<pre><code class="java language-java">ArrayList&lt;Integer&gt; varOne = new ArrayList&lt;Integer&gt;();
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
<p>What is printed as a result of executing the code segment? <<

( ) 18 {{incorrect because the remaining two values in the <code>ArrayList</code> add up to 9. Look at the process shown below.}}
( ) 16 {{incorrect because the remaining two values in the <code>ArrayList</code> add up to 9. Look at the process shown below.}}
(x) 9 {{correct because it accurately represents how the <code>ArrayList</code> methods change the <code>ArrayList</code>.
The process is shown below:
<code>ArrayList varOne = new ArrayList(); // varOne = []</code>
<code>varOne.add(7); // varOne = [7]</code>
<code>varOne.add(3); // varOne = [7, 3]</code>
<code>varOne.add(9); // varOne = [7, 3, 9]</code>
<code>varOne.set(1,2); // varOne = [7, 2, 9]</code>
<code>varOne.remove(2); // varOne = [7, 2]</code>}}
( ) 11 {{incorrect because the remaining two values in the <code>ArrayList</code> add up to 9. Look at the process shown above.}}
( ) 10 {{incorrect because the remaining two values in the <code>ArrayList</code> add up to 9. Look at the process shown above.}}

||The for statement at the end simply returns the sum of the elements inside the <code>ArrayList</code>. ||
