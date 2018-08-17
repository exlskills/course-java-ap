>>Consider the following code segment:

```
String varOne = "Hello World!";
System.out.println(varOne.indexOf('W'));
```

What is printed as a result of executing this code segment?<<

( ) 4 {{Incorrect because the 4th index of "Hello World!" is 'o'.}}
( ) 5 {{Incorrect because the 5th index of "Hello World!" contains a space.}}
(x) 6 {{Correct because the character 'W' exists in the 6th index of "Hello World!".}}
( ) 7 {{Incorrect because the 7th index of "Hello World!" is 'o'.}}
( ) An error will be thrown {{Incorrect because an error would be thrown only if the input of the <code>indexOf()</code> method was not a character. Even if the character does not exist in the String, the method will still return -1, and will not cause an error.}}

||The space between the two words in the <code>String</code> counts as a character. ||
