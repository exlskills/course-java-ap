>>Consider the following insertion sort method:
<pre><code>public void insertionSort(int[] paramOne){
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

( ) {5, 3, 4, 2, 1} {{Incorrect because {3,4,5,2,1} is the value of <code>paramOne</code> after two passes of the loop. The correct process is shown with the right answer, {3,4,5,2,1}.}}
( ) {3, 5, 2, 3, 1} {{Incorrect because {3,4,5,2,1} is the value of <code>paramOne</code> after two passes of the loop. The correct process is shown with the right answer, {3,4,5,2,1}.}}
( ) {2, 3, 4, 5, 1} {{Incorrect because {3,4,5,2,1} is the value of <code>paramOne</code> after two passes of the loop. The correct process is shown with the right answer, {3,4,5,2,1}.}}
( ) {3, 2, 1, 4, 5} {{Incorrect because {3,4,5,2,1} is the value of <code>paramOne</code> after two passes of the loop. The correct process is shown with the right answer, {3,4,5,2,1}.}}
(x) {3, 4, 5, 2, 1} {{Correct because it accurately represents what the array will be when j = 2 at the point indicated by <code>/* End of outer loop */</code>.
<p>The process is shown below. Use the comments to guide you through each step:</p>
<p>j = 1<br/>
<code>int insertItem = paramOne[j];</code> // int insertItem = 4<br/>
<code>int k = j - 1;</code> // int k = 0<br/>
<code>while (k &gt;= 0 &amp;&amp; insertItem &lt; paramOne[k])</code> // Finds the largest value in the array before index 1 (in this case it will be 5)<br/>
<code>paramOne[k + 1] = paramOne[k];</code> // paramOne[1] = paramOne[0], which changes the first index of the array from 4 to 5<br/>
<code>k--;</code> // int k = -1<br/>
<code>paramOne[k + 1] = insertItem;</code> // paramOne[0] = 4</code><br/>
<code>/* End of outer loop */</code> // paramOne is now {4,5,3,2,1}</p>
<p>j = 2<br/>
<code>int insertItem = paramOne[j];</code> // int insertItem = 3<br/>
<code>int k = j - 1;</code> // int k = 1<br/>
<code>while (k &gt;= 0 &amp;&amp; insertItem &lt; paramOne[k])</code> // Finds the largest value in the array before index 2 (in this case it will be 5)<br/>
<code>paramOne[k + 1] = paramOne[k];</code> // paramOne[2] = 5 and paramOne[1] = 4<br/>
<code>k--;</code> // int k = -1<br/>
<code>paramOne[k + 1] = insertItem;</code> // paramOne[0] = 3<br/>
<code>/* End of outer loop */</code> // paramOne is now {3,4,5,2,1}</p>
<p>Therefore, <code>paramOne</code> will be {3, 4, 5, 2, 1} when j = 2 at <code>/* End of outer loop */</code></p>}}

||Insertion sort compares two values to ensure that the smaller value comes before the larger one. ||
