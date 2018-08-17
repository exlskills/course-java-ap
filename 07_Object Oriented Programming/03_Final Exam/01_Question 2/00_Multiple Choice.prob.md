>>Consider the following class declarations:

```
public class Earth {
  // methods not shown
}
public class Land extends Earth {
  // methods not shown
}
public class Ocean extends Earth {
  // methods not shown
}
public class Countries extends Land {
  // methods not shown
}
```

<p>Also consider the following variable declarations:</p>

```
Earth varOne;
Land varTwo;
Ocean varThree;
Countries varFour;
```

Which of the following code segments will not result in a compile time error?<<

( ) <pre><code>varTwo = new Ocean();</code></pre> {{Incorrect because <code>Ocean</code> is a subclass of <code>Earth</code>, so a reference to <code>Ocean</code> cannot be assigned to <code>Land</code> object .}}
( ) <pre><code>varThree = new Land();</code></pre> {{Incorrect because <code>Land</code> is a subclass of <code>Earth</code>, so a reference to <code>Land</code> cannot be assigned to <code>Ocean</code> object.}}
( ) <pre><code>varTwo = new Earth();</code></pre> {{Incorrect because <code>Earth</code> is not a subclass of <code>Land</code>.}}
( ) <pre><code>varFour = new Land();</code></pre> {{Incorrect because <code>Land</code> is not a subclass of <code>Countries</code>.}}
(x) <pre><code>varOne = new Land();</code></pre> {{Correct because <code>Land</code> is a subclass of <code>Earth</code>.}}

||<code>Ocean</code> and <code>Land</code> are subclasses of <code>Earth</code> and cannot be assigned to objects of class <code>Earth</code>. ||
