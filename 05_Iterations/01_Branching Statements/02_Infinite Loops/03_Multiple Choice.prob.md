>>Which of the following is an example of an infinite loop? <<

( ) <pre><code class="java language-java">int varOne = 5;
while (varOne &gt; 0) {
  System.out.println("Java");
  varOne--;
}
</code></pre> {{incorrect because the while loop terminates after "Java" is printed 5 times.}}
( ) <pre><code class="java language-java">int varOne = 5;
while (varOne != 3) {
  System.out.println("Java");
  varOne--;
}
</code></pre> {{incorrect because the while loop terminates after "Java" is printed 2 times.}}
( ) <pre><code class="java language-java">int varOne = 5;
while (varOne &lt; 15) { 
  System.out.println("Java");
  varOne++;
}
</code></pre> {{incorrect because the while loop terminates after "Java" is printed 10 times.}}
( ) <pre><code class="java language-java">int varOne = 5;
while (varOne &lt; 0) {
  System.out.println("Java");
  varOne--;
}
</code></pre> {{incorrect because the while loop never executed as 5 is not smaller than 0.}}
(x) <pre><code class="java language-java">int varOne = 5;
while (varOne &gt; 0) {
  System.out.println("Java");
  varOne++;
}
</code></pre> {{correct because <code>varOne</code> will always be greater than 0 if the value keeps increasing by 1 as the while loop executes itself.}}

||Which one of the conditions inside the while statements above is never going to be true? ||
