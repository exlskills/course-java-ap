>>Consider the following code segment:
<pre><code class="java language-java">public void methodOne (int paramOne){
  if ((paramOne / 10) != 0){
    methodOne (paramOne / 10);
  }
  System.out.println(paramOne % 10);
}
</code></pre>
<p>Which of the following is printed as a result of the call <code>methodOne(123456)</code>? </p><<

( ) 16 {{Incorrect because "123456" is printed. Look at the process shown below.}}
( ) 56 {{Incorrect because "123456" is printed. Look at the process shown below.}}
(x) 123456 {{Correct because it accurately represents what the recursive method above prints. The process is shown below:<p>methodOne(123456)<code>if ((paramOne / 10) != 0) // true (STEP 1)</code><code>methodOne (paramOne / 10) // executes methodOne(12345) (STEP 2)</code><code>System.out.println(paramOne % 10); // prints "6" (STEP 16)</code></p><p>methodOne(12345)<code>if ((paramOne / 10) != 0) // true (STEP 3)</code><code>methodOne (paramOne / 10) // executes methodOne(1234) (STEP 4)</code><code>System.out.println(paramOne % 10); // prints "5" (STEP 15)</code></p><p>methodOne(1234)<code>if ((paramOne / 10) != 0) // true (STEP 5)</code><code>methodOne (paramOne / 10) // executes methodOne(123) (STEP 6)</code><code>System.out.println(paramOne % 10); // prints "4" (STEP 14)</code></p><p>methodOne(123)<code>if ((paramOne / 10) != 0) // true (STEP 7)</code><code>methodOne (paramOne / 10) // executes methodOne(12) (STEP 8)</code><code>System.out.println(paramOne % 10); // prints "3" (STEP 13)</code></p><p>methodOne(12)<code>if ((paramOne / 10) != 0) // true (STEP 9)</code><code>methodOne (paramOne / 10) // executes methodOne(1) (STEP 10 </code><code>System.out.println(paramOne % 10); // prints "2" (STEP 12)</code></p><p>methodOne(1)<code>if ((paramOne / 10) != 0) // false</code><code>methodOne (paramOne / 10) // not executed</code><code>System.out.println(paramOne % 10); // prints "1" (STEP 11)</code></p><p>Therefore, "123456" is printed after <code>methodOne(123456)</code> is executed.</p>}}
( ) 654321 {{Incorrect because "123456" is printed. Look at the process shown above.}}
( ) An infinite number of digits will be printed due to infinite recursion. {{Incorrect because "123456" is printed. Look at the process shown above.}}

||<code>methodOne()</code> is called a total of 5 times after the initial call.||