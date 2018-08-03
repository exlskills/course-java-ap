>>Which of the following correctly iterates over the elements of the array varOne and prints each value one time?<br/>
<code>int[] varOne = {90, 87, 94, 100, 83, 72, 78, 100, 91};</code> <<

(x) <pre><code>for (int index = 0; index &lt; varOne.length; index++){<br/>  System.out.print(varOne[index] + " ");<br/>} </code></pre> {{Correct because it constructs a for loop and only prints one value for each iteration.}}
( ) <pre><code>for (int index = 0; index &lt; varOne.size; index++){<br/>  System.out.print(varOne[index] + " ")<br/>} </code></pre> {{Incorrect because "size" is not the right term when trying to get the length of an array.}}
( ) <pre><code>for (int index = 0; index &lt; varOne.size(); index++){<br/>  System.out.print(varOne[index] + " ");<br/>} </code></pre> {{Incorrect because <code>size()</code> is not the right method to use when trying to get the length of an array.}}
( ) <pre><code>for (int index = 0; index &lt; varOne.length(); index++){<br/>  System.out.print(varOne[index] + " ");<br/>} </code></pre> {{Incorrect because <code>length</code> is a property of an array, not a method.}}
( ) <pre><code>for (int index = 0; index &lt; varOne.length; index++){<br/>  System.out.print(varOne);<br/>} </code></pre> {{Incorrect because it prints the entire array each time the for loop is executed.}}

||"array.length" is used when determining the length of an array. ||