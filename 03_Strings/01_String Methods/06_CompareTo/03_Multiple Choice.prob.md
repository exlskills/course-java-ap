>>Consider the following code segment:
<pre><code class="java language-java">String varOne = "Hello World!";
String varTwo = "Java";
System.out.println(varOne.compareTo(varTwo));
</code></pre>
<p>What is printed as a result of executing this code segment?</p><<

( ) 2 {{Incorrect because 'H' comes before 'J', so the answer should be a negative value.}}
(x) -2 {{Correct because compares the first letter of "Hello World" to the first letter of "Java". 
Since 'H' has a Unicode value of 72 and 'J' has a Unicode value of 74, the subtraction is 72 - 74, and it will return -2.}}
( ) 0 {{Incorrect because the Unicode value of 'H' and 'J' are not the same.}}
( ) 20 {{Incorrect because the Unicode values for 'H' and 'J' are not 20 units apart.}}
( ) An error will be thrown. {{Incorrect because the statements above will compile and run successfully.}}

||'H' only comes 2 characters before 'J'. ||
