>>Given three variables and their values below, which of the following boolean expressions evaluate to true?
<code>boolean varOne = false;</code>
<code>int varTwo  = 2;</code>
<code>int varThree = 20;</code> <<

[x] <pre><code>varThree &gt; Two</code></pre> {{ selected: Correct because 20 is greater than 2.}, { unselected: Correct because 20 is greater than 2.}}
[ ] <pre><code>varTwo &gt; varThree</code></pre> {{ selected: Incorrect because 2 is not greater than 20.}, { unselected: Incorrect because 2 is not greater than 20.}}
[x] <pre><code>!varOne</code></pre> {{ selected: Correct because the logical complement(!) changes false to true.}, { unselected: Correct because the logical complement(!) changes false to true.}}
[ ] <pre><code>varThree + varTwo &gt; varOne</code></pre> {{ selected: Incorrect because you cannot compare <code>boolean</code> and <code>int</code> values using '&lt;'.}, { unselected: Incorrect because you cannot compare <code>boolean</code> and <code>int</code> values using '&lt;'.}}
[ ] <pre><code>!varTwo</code></pre> {{ selected: Incorrect because you cannot use the logical complement(!) on an <code>int</code> value.}, { unselected: Incorrect because you cannot use the logical complement(!) on an <code>int</code> value.}}

||You cannot compare <code>int</code> values with <code>boolean</code> values using relational operators. ||
