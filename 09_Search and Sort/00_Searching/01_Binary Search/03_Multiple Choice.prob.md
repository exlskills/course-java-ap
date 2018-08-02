>>Given an array, which of the following condition must be true in order to search for a value using binary search?
<p>I. The values in the array must be integers.
II. The values in the array must be in sorted order.
III. The array cannot contain duplicate values. </p><<

( ) I only {{Incorrect because other data types such as <code>String</code> or <code>double</code> will also work with binary search.}}
(x) II only {{Correct because binary search with values that are not sorted in order will not work as intended.}}
( ) I and II {{Incorrect because other data types such as <code>String</code> or <code>double</code> will also work with binary search.}}
( ) II and III {{Incorrect because the array can have duplicate values as long as they are in sorted order.}}
( ) I, II and III. {{Incorrect because the array can have duplicate values as long as they are in sorted order.}}

||Binary search starts from the middle of the array, and the middle value should also be the median of the array. ||
