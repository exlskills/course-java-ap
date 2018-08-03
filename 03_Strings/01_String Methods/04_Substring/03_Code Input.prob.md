>>Complete the method <code>removeStartEnd</code> so that it satisfies the following condition:<br/>
Returns a version of the input without the first and last char.
<p>Assume the length of the input is always larger than 2.
Use <code>substring()</code> when writing your response.<br/>
For example:<br/>
<code>removeStartEnd("Hello")</code> should return "ell"<br/>
<code>removeStartEnd("Java")</code> should return "av"<br/>
<code>removeStartEnd("Coding")</code> should return "odin"</p><<

= #!exl::repl('index.prob.repl.yaml')

||<code>substring(x,y)</code> method includes the character at index 'x' but excludes the character at index 'y'. ||
