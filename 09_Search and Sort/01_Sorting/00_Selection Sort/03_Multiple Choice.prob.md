>>Consider the following selection sort method:
<pre><code>public void selectionSort(int[] paramOne){
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
<p>Assume that <code>selectionSort</code> is called with the array {6, 3, 2, 5, 4, 1}. What will the value of <code>paramOne</code> be after three passes of the outer loop (i.e., when j = 2 at the point indicated by /* End of outer loop */)?</p><<

( ) {1, 2, 3, 4, 5, 6} {{Incorrect because the array shouldn't be fully sorted after three passes of the outer loop. View the step-by-step solution below.}}
(x) {1, 2, 3, 5, 4, 6} {{Correct because it accurately represents what the array will be when j = 2 at the point indicated by /* End of outer loop &#42;/. <p>The process is shown below. Use the comments to guide you through each step:</p> 
<p>When j = 0,<br/>
<code>int m = j;</code> // int m = 0<br/>
<code>int k = j + 1</code> // int k = 1<br/>
<code>if (paramOne[k] &lt; paramOne[m])</code> // Finds a value in the array that is smaller than the value at the index m between m and the last index (in this case, m = 5 because 1 is the smallest value)<br/>
<code>int temp = paramOne[m];</code> // int temp = 1<br/>
<code>paramOne[m] = paramOne[j];</code> // paramOne[5] = paramOne[0], which changes the fifth index of the array from 1 to 6<br/>
<code>paramOne[j] = temp;</code> // paramOne[0] = 1, which changes the zeroth index of the array from 6 to 1<br/>
<code>/* End of outer loop */ </code>// paramOne is now {1,3,2,5,4,6}</p>
<p>When j = 1,<br/>
<code>int m = j;</code> // int m = 1<br/>
<code>int k = j + 1</code> // int k = 2<br/>
<code>if (paramOne[k] &lt; paramOne[m])</code> // Finds a value in the array that is smaller than the value at the index m between m and the last index (in this case, m = 2 because 2 is the next smallest value)<br/>
<code>int temp = paramOne[m];</code> // int temp = 2<br/>
<code>paramOne[m] = paramOne[j];</code> // paramOne[2] = parmOne[1], which changes the second index of the array from 2 to 3<br/>
<code>paramOne[j] = temp;</code> // paramOne[1] = 2, which sets the first index of the array from 3 to 2.<br/>
<code>/* End of outer loop */</code> // paramOne is now {1,2,3,5,4,6}</p>
<p>When j = 2,<br/>
<code>int m = j;</code> // int m = 2<br/>
<code>int k = j + 1</code> // int k = 3<br/>
<code>if (paramOne[k] &lt; paramOne[m])</code> // Finds a value in the array that is smaller than the value at the index m between m and the last index (in this case, m = 2 because 3 is still the smallest value) <br/>
<code>int temp = paramOne[m];</code> // int temp = 3<br/>
<code>paramOne[m] = paramOne[j];</code> // paramOne[2] = 3, which doesn't change anything as paramOne[2] was already equal to 3.<br/>
<code>paramOne[j] = temp;</code> // paramOne[2] = 3, which doesn't change anything as paramOne[2] was already equal to 3<br/>
<code>/* End of outer loop */</code> // paramOne is still {1,2,3,5,4,6}</p> <p>Therefore, <code>paramOne</code> will be {1,2,3,5,4,6} when j = 2 at <code>/* End of outer loop */</code>.</p>}}
( ) {1, 2, 3, 6, 5, 4} {{Incorrect because the array should look like {1, 2, 3, 5, 4, 6} after three passes of the loop. View the step-by-step solution above.}}
( ) {1, 3, 2, 4, 5, 6} {{Incorrect because the array should look like {1, 2, 3, 5, 4, 6} after three passes of the loop. View the step-by-step solution above.}}
( ) {1, 3, 2, 5, 4, 6} {{Incorrect because the array should look like {1, 2, 3, 5, 4, 6} after three passes of the loop. View the step-by-step solution above.}}

||Selection sort finds the smallest value in the array as it proceeds and switches them to the front end of the array. ||
