>>Replace the for loop below with a for-each loop.</p>
<pre><code class="java language-java">int[] varOne = {1, 2, 3, 4, 5, 6};
int sum = 0;
for (int index = 0; index &lt; varOne.length; index++){
  sum += varOne[index];
}
return sum;
</code></pre> <<

= the correct answer

||The for-each loop must include a colon between the local variable as well as <code>varOne</code>. ||
