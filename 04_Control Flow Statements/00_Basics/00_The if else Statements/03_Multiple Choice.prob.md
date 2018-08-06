>>Consider the following code segment:
```
if (varOne &gt; 0){
  varOne = -varOne;     
} 
if (varOne &lt; 0){
 varOne = 0;    
}
```
<p>Which of the following is this code segment equivalent to?</p><<

( )
```
if (varOne &gt; 0){
  varOne = 0;
}
```
{{Incorrect because even if <code>varOne</code> is less than 0, <code>varOne</code> will still equal 0 after the code segment in the question is executed.}}
( ) 
```
if (varOne &lt; 0){
  varOne = 0;
} 
``` 
{{Incorrect because even if <code>varOne</code> is greater than 0, <code>varOne</code> will still equal 0 after the code segment in the question is executed.}}
(x) <pre><code>varOne = 0;</code></pre> {{Correct because the code segment from the question always results in setting <code>varOne</code> to 0.}}
( ) 
```
if (varOne &gt; 0){
  varOne = -varOne;
} 
```
{{Incorrect because it lacks the functions of the second <code>if else</code> statement that exists in the code segment from the question.}}
( ) 
```
if (varOne &lt; 0){
  varOne = 0;
} else {
  varOne = -1;
} 
```
{{Incorrect because this answer choice flips the order of the <code>if else</code> statements.}}

||When <code>varOne</code> starts out to be a positive number, it is reassigned to a negative number before executing the second if statement. ||
