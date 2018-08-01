>>Consider the following code segment:</p>
<pre><code class="java language-java">String varOne = "Hello World!";
String varTwo = "Java";
System.out.println(varOne.compareTo(varTwo));
What is printed as a result of executing this code segment?
</code></pre> <<

( ) A. 2 {{A is incorrect because 'H' comes before 'J', so the answer should be a negative value.}}
(x) B. -2 {{B is correct because compares the first letter of "Hello World" to the first letter of "Java". 
Since 'H' has a Unicode value of 72 and 'J' has a Unicode value of 74, the subtraction is 72 - 74 it will return -2.}}
( ) C. 0 {{C is incorrect because the Unicode value of 'H' and 'J' are not the same.}}
( ) D. 20 {{D is incorrect because the Unicode values for 'H' and 'J' are not 20 units apart.}}
( ) E. An error will be thrown. {{E is incorrect because the statements above will compile and run successfully.}}

||'H' only comes 2 characters before 'J'. ||
