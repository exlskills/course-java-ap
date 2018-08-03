>>Given the fact that variable flightTime is larger that 60, which of the following can be used to replace <code>/* missing code */</code> so that the flightTime can be displayed in hours and minutes?
<pre><code class="java language-java">public class TestClass()
{
  int flightTime = 130;
  int minutes = 0;
  int hours = 0;

  public static void main (String[] args)
  {
    /* missing code */
    System.out.println("The flightTime is " + hours + " hours and " + minutes + " minutes long.");
  }
}
</code></pre> <<

( ) <code>minutes = flightTime % 60;</code> {{Incorrect because the <code>hours</code> variable is not touched and remains at 0.}}
(x) <pre><code class="java language-java">hours = hours + flightTime / 60;<br/>minutes = flightTime % 60; </code></pre> {{Correct because <code>hours = hours + flightTime / 60</code> accurately returns the number of hours by truncating the decimal and <code>minutes = flightTime%60</code> accurately returns the number of minutes by taking the remainder of the division.}}
( ) <pre><code class="java language-java">hours = hours + flightTime % 60;<br/>minutes = flightTime / 60; </code></pre> {{Incorrect because the wrong arithmetic operators are used when calculating <code>hours</code> and <code>minutes</code>.}}
( ) <code>minutes = flightTime + flightTime % 60;</code> {{Incorrect because the <code>hours</code> variable is not touched and remains at 0. Also, <code>minutes</code> will become a larger value than <code>flightTime</code>, which does not make sense.}}
( ) <code>hours = flightTime / 60;</code> {{Incorrect because the <code>minutes</code> variable is not touched and remains at 0.}}

||Mathematically, how can you get the number of hours from number that only represents minutes? ||
