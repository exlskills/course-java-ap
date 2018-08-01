>>Consider the following class declarations:</p>
<pre><code class="java language-java">public class Food{
  public void print(){
    System.out.print("Food");
  }
}
</code></pre>
<pre><code class="java language-java">public class Bread extends Food
{
  public void print()
  {
    System.out.print("Bread");
  }
}
</code></pre>
<p>What is printed as a result of executing the following code segment?
<code>Food varOne = new Bread();</code>
<code>varOne.print();</code> <<

( ) Food {{incorrect because "Food" would be printed only if the <code>print()</code> method did not exist in the <code>Bread</code> class.}}
(x) Bread {{correct because the method <code>print()</code> is overridden in the class <code>Bread</code> and <code>varOne</code> is an instance of <code>Bread</code>, causing "Bread" to be printed to the console.}}
( ) FoodBread {{incorrect because only one of the <code>print()</code> methods will be called.}}
( ) BreadFood {{incorrect because only one of the <code>print()</code> methods will be called.}}
( ) The code will result in a runtime error. {{incorrect because the code above will run and print "Bread"}}

||Only one of the print methods are called. ||
