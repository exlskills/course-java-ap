>>Which of the following is an example of an infinite loop? <<

( ) <pre><code>int varOne = 5;<br/>while (varOne &gt; 0){<br/>  System.out.println("Java");<br/>  varOne--;<br/>} </code></pre> {{Incorrect because the <code>while</code> loop terminates after "Java" is printed 5 times.}}
( ) <pre><code>int varOne = 5;<br/>while (varOne != 3){<br/>  System.out.println("Java");<br/>  varOne--;<br/>} </code></pre> {{Incorrect because the <code>while</code> loop terminates after "Java" is printed 2 times.}}
( ) <pre><code>int varOne = 5;<br/>while (varOne &lt; 15){<br/>  System.out.println("Java");<br/>  varOne++;<br/>} </code></pre> {{Incorrect because the <code>while</code> loop terminates after "Java" is printed 10 times.}}
( ) <pre><code>int varOne = 5;<br/>while (varOne &lt; 0){<br/>  System.out.println("Java");<br/>  varOne--;<br/>} </code></pre> {{Incorrect because the <code>while</code> loop never executed as 5 is not smaller than 0.}}
(x) <pre><code>int varOne = 5;<br/>while (varOne &gt; 0){<br/>  System.out.println("Java");<br/>  varOne++;<br/>} </code></pre> {{Correct because <code>varOne</code> will always be greater than 0 if the value keeps increasing by 1 as the <code>while</code> loop executes itself.}}

||Which one of the conditions inside the <code>while</code> loops above is never going to be true? ||