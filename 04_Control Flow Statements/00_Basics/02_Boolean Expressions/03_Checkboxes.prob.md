>>Given three variables and their values below, which of the following boolean expressions evaluate to true?
<code>boolean varOne = false;</code>
<code>int varTwo  = 2;</code>
<code>int varThree = 20;</code> <<

[x] <code>varThree &gt; Two</code> {{ selected: correct because 20 is greater than 2.}, { unselected: correct because 20 is greater than 2.}}
[ ] <code>varTwo &gt; varThree</code> {{ selected: incorrect because 2 is not greater than 20.}, { unselected: incorrect because 2 is not greater than 20.}}
[x] <code>!varOne</code> {{ selected: correct because the logical complement(!) changes false to true.}, { unselected: correct because the logical complement(!) changes false to true.}}
[ ] <code>varThree + varTwo &gt; varOne</code> {{ selected: incorrect because you cannot compare <code>boolean</code> and <code>int</code> values using '&lt;'.}, { unselected: incorrect because you cannot compare <code>boolean</code> and <code>int</code> values using '&lt;'.}}
[ ] <code>!varTwo</code> {{ selected: incorrect because you cannot use the logical complement(!) on an <code>int</code> value.}, { unselected: incorrect because you cannot use the logical complement(!) on an <code>int</code> value.}}

||You cannot compare integer values with boolean values using relational operators. ||
