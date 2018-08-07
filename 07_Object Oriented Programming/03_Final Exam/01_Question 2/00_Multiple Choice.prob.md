>>Consider the following class declarations:
<pre><code>public class Earth {
  // methods not shown
}
</code></pre>
<pre><code>public class Land extends Earth {
  // methods not shown
}
</code></pre>
<pre><code>public class Ocean extends Earth {
  // methods not shown
}
</code></pre>
<pre><code>public class Countries extends Land {
  // methods not shown
}
</code></pre>
<p>Also consider the following variable declarations:</p>
<pre><code>Earth varOne;</code>
<code>Land varTwo;</code>
<code>Ocean varThree;</code>
<code>Countries varFour;</code></pre>
<p>Which of the following code segments will not result in a compile time error?</p><<

( ) <pre><code>varTwo = new Ocean();</code></pre> {{Incorrect because <code>Ocean</code> is a subclass of <code>Earth</code>, so a reference to <code>Ocean</code> cannot be assigned to <code>Land</code> object .}}
( ) <pre><code>varThree = new Land();</code></pre> {{Incorrect because <code>Land</code> is a subclass of <code>Earth</code>, so a reference to <code>Land</code> cannot be assigned to <code>Ocean</code> object.}}
( ) <pre><code>varTwo = new Earth();</code></pre> {{Incorrect because <code>Earth</code> is not a subclass of <code>Land</code>.}}
( ) <pre><code>varFour = new Land();</code></pre> {{Incorrect because <code>Land</code> is not a subclass of <code>Countries</code>.}}
(x) <pre><code>varOne = new Land();</code></pre> {{Correct because <code>Land</code> is a subclass of <code>Earth</code>.}}

||<code>Ocean</code> and <code>Land</code> are subclasses of <code>Earth</code> and cannot be assigned to objects of class <code>Earth</code>. ||
