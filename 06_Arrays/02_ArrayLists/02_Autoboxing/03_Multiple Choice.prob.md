>>Consider the following code segment:</p>
<pre><code class="java language-java">ArrayList<Integer> varOne = new ArrayList<Integer>();
varOne.add(new Integer(1));
varOne.add(new Integer(2));
varOne.add(new Integer(3));
varOne.set(2, new Integer(4));
varOne.add(2, new Integer(5));
varOne.add(new Integer(6));
System.out.println(varOne);
</code></pre>
<p>What is printed as a result of executing the code segment? <<

(x) [1, 2, 5, 4, 6] {{Correct because it accurately represents how the ArrayList methods change the ArrayList.
The process is shown below:
<code>ArrayList varOne = new ArrayList(); // varOne = []</code>
<code>varOne.add(new Integer(1)); // varOne = [1]</code>
<code>varOne.add(new Integer(2)); // varOne = [1, 2]</code>
<code>varOne.add(new Integer(3)); // varOne = [1, 2, 3]</code>
<code>varOne.set(2, new Integer(4)); // varOne = [1, 2, 4]</code>
<code>varOne.add(2, new Integer(5)); // varOne = [1, 2, 5, 4]</code>
<code>varOne.add(new Integer(6)); // varOne = [1, 2, 5, 4, 6]</code></p>
<p>Therefore, "[1, 2, 5, 4, 6]" is printed.}}
( ) [1, 5, 2, 4, 6]{{Incorrect because "[1, 2, 5, 4, 6]" is printed. Look at the process shown within the first answer choice.}}
( ) [1, 2, 4, 5, 6]{{Incorrect because "[1, 2, 5, 4, 6]" is printed. Look at the process shown within the first answer choice.}}
( ) [1, 2, 3, 4, 5]{{Incorrect because "[1, 2, 5, 4, 6]" is printed. Look at the process shown within the first answer choice.}}
( ) An error would occur.{{Incorrect because you can use <code>new Integer(1)</code> instead of just "1" if you don't want to take advantage of auto-boxing.}}

||<code>varOne.add(new Integer(1))</code> is the same as <code>varOne.add(1)</code>. ||
