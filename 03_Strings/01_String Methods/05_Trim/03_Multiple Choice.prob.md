>>Which of the following will print the <code>String</code> "Hello"? <<

( )<pre><code>String varOne = "Hello World!"; System.out.println(varOne.trim()); </code></pre> {{Incorrect because it prints "Hello World!".}}
( )<pre><code>String varOne = " Hello Hello "; System.out.println(varOne.trim()); </code></pre> {{Incorrect because it prints "Hello Hello".}}
( )<pre><code>String varOne = " H e l l o "; System.out.println(varOne.trim()); </code></pre> {{Incorrect because it prints "H e l l o".}}
(x)<pre><code>String varOne = "   Hello   "; System.out.println(varOne.trim()); </code></pre> {{Correct because it prints the <code>String</code> "Hello!" without any spaces at the start and end of the <code>String</code>.}}

||The <code>trim()</code> method only removes the spaces at the start and the end of the <code>String</code>. ||
