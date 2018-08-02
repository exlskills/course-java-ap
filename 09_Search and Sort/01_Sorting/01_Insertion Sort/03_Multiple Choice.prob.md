>>Consider the following insertion sort method:
<pre><code class="java language-java">public void insertionSort(int[] paramOne){
  for (int j = 1; j &lt; paramOne.length; j++)
  {
    int insertItem = paramOne[j];
    int k = j - 1;

    while (k &gt;= 0 &amp;&amp; insertItem &lt; paramOne[k]){
      paramOne[k + 1] = paramOne[k];
      k—-;
    }
    paramOne[k + 1] = insertItem;
    /* end of for loop */
  }
}
</code></pre>
<p>Assume that <code>insertionSort</code> is called with the array {5,4,3,2,1}.
What will the value of <code>paramOne</code> be after two passes of the outer loop (i.e., when j = 2 at the point indicated by /* End of outer loop */)?</p><<

( ) {5, 3, 4, 2, 1} {{Incorrect because {3,4,5,2,1} is the value of <code>paramOne</code> after two passes of the loop. Look at the process within the fourth answer choice.}}
( ) {3, 5, 2, 3, 1} {{Incorrect because {3,4,5,2,1} is the value of <code>paramOne</code> after two passes of the loop. Look at the process within the fourth answer choice.}}
( ) {2, 3, 4, 5, 1} {{Incorrect because {3,4,5,2,1} is the value of <code>paramOne</code> after two passes of the loop. Look at the process within the fourth answer choice.}}
( ) {3, 2, 1, 4, 5} {{Incorrect because {3,4,5,2,1} is the value of <code>paramOne</code> after two passes of the loop. Look at the process within the fourth answer choice.}}
(x) {3, 4, 5, 2, 1} {{Correct because it accurately represents what the array will be when j = 2 at the point indicated by <code>/* End of outer loop */</code>.
The process is shown below:
<p>j = 1<br />
<code>int insertItem = paramOne[j]; // int insertItem = 4</code>
<code>int k = j - 1; // int k = 0</code>
<code>while (k &gt;= 0 &amp;&amp; insertItem &lt; paramOne[k]) // finds the largest value in the array before index 1 (in this case it will be 5)</code>
<code>paramOne[k + 1] = paramOne[k]; // paramOne[1] = 5</code>
<code>k--; // int k = -1</code>
<code>paramOne[k + 1] = insertItem; // paramOne[0] = 4</code>
<code>/* End of outer loop */</code>
<code>// paramOne = {4,5,3,2,1}</code></p>
<p>j = 2<br />
<code>int insertItem = paramOne[j]; // int insertItem = 3</code>
<code>int k = j - 1; // int k = 1</code>
<code>while (k &gt;= 0 &amp;&amp; insertItem &lt; paramOne[k]) // finds the largest value in the array before index 2 (in this case it will be 5)</code>
<code>paramOne[k + 1] = paramOne[k]; // paramOne[2] = 5 and paramOne[1] = 4</code>
<code>k--; // int k = -1</code>
<code>paramOne[k + 1] = insertItem; // paramOne[0] = 3</code>
<code>/* End of outer loop */</code><br />
<code>// paramOne = {3,4,5,2,1}</code></p>
<p>Therefore, <code>paramOne</code> will be {3, 4, 5, 2, 1} when j = 2 at <code>/* End of outer loop */</code></p>}}

||Insertion sort compares two values to ensure that the smaller value comes before the larger one. ||
