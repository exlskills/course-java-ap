>>Consider the following selection sort method:</p>
<pre><code class="java language-java">public void selectionSort(int[] paramOne){
  for (int j = 0; j &lt; paramOne.length-1; j++){
    int m = j;
    for (int k = j + 1; k &lt; paramOne.length; k++){
      if (paramOne[k] &lt; paramOne[m]){
        m = k;
      }
    }
    int temp = paramOne[m];  
    paramOne[m] = paramOne[j];
    paramOne[j] = temp;
    /* End of outer loop */
  }
}
</code></pre>
<p>Assume that <code>selectionSort</code> is called with the array {6, 3, 2, 5, 4, 1}. 
What will the value of <code>paramOne</code> be after three passes of the outer loop (i.e., when j = 2 at the point indicated by /* End of outer loop */)? <<

( ) {1, 2, 3, 4, 5, 6} {{Incorrect because the array shouldn't be fully sorted after three passes of the outer loop. Look at the process shown within the second answer choice.}}
(x) {1, 2, 3, 5, 4, 6} {{Correct because it accurately represents what the array will be when j = 2 at the point indicated by <code>/* End of outer loop */</code>.
The process is shown below:
When j = 0,<br />
<code>int m = j // int m = 0;</code>
<code>int k = j + 1 // int k = 1;</code>
<code>/* checks to find the smallest value in the array after element k (in this case, m = 5 because 1 is the smallest value) */</code>
<code>if (paramOne[k] &lt; paramOne[m])</code>
<code>int temp = paramOne[m]; // int temp = 1</code>
<code>paramOne[m] = paramOne[j]; // paramOne[5] = 6</code>
<code>paramOne[j] = temp; // paramOne[0] = 1</code>
<code>/* End of outer loop */ 
</code>//paramOne = {1,3,2,5,4,6}`</p>
<p>When j = 1,<br />
<code>int m = j // int m = 1;</code>
<code>int k = j + 1 // int k = 2;</code>
<code>if (paramOne[k] &lt; paramOne[m])</code>
<code>int temp = paramOne[m]; // int temp = 2</code>
<code>paramOne[m] = paramOne[j]; // paramOne[2] = 3</code>
<code>paramOne[j] = temp; // paramOne[1] = 2</code>
<code>/* End of outer loop */</code><br />
<code>// paramOne = {1,2,3,5,4,6}</code></p>
<p>When j = 2,<br />
<code>int m = j // int m = 2;</code>
<code>int k = j + 1 // int k = 3;</code>
<code>if (paramOne[k] &lt; paramOne[m])</code>
<code>int temp = paramOne[m]; // int temp = 3</code>
<code>paramOne[m] = paramOne[j]; // paramOne[2] = 3</code>
<code>paramOne[j] = temp; // paramOne[2] = 3</code>
<code>/* End of outer loop */</code><br />
<code>// paramOne = {1,2,3,5,4,6}</code></p>
<p>Therefore, <code>paramOne</code> will be {1,2,3,5,4,6} when j = 2 at <code>/* End of outer loop */</code>}}
( ) {1, 2, 3, 6, 5, 4} {{Incorrect because the array should look like {1, 2, 3, 5, 4, 6} after three passes of the loop. Look at the process shown within the second answer choice.}}
( ) {1, 3, 2, 4, 5, 6} {{Incorrect because the array should look like {1, 2, 3, 5, 4, 6} after three passes of the loop. Look at the process shown within the second answer choice.}}
( ) {1, 3, 2, 5, 4, 6} {{Incorrect because the array should look like {1, 2, 3, 5, 4, 6} after three passes of the loop. Look at the process shown within the second answer choice.}}

||Selection sort finds the smallest value in the array as it proceeds and switches them to the front end of the array. ||
