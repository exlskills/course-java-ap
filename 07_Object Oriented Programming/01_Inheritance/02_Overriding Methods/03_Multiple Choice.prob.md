>>Consider the following class declarations:

```
public class Food{
  public void print(){
    System.out.print("Food");
  }
}

public class Bread extends Food
{
  public void print()
  {
    System.out.print("Bread");
  }
}
```

<p>What is printed as a result of executing the following code segment?</p>

```
Food varOne = new Bread();
varOne.print();
```

<<

( ) Food {{Incorrect because "Food" would be printed only if the <code>print()</code> method did not exist in the <code>Bread</code> class.}}
(x) Bread {{Correct because the method <code>print()</code> is overridden in the class <code>Bread</code> and <code>varOne</code> is an instance of <code>Bread</code>, causing "Bread" to be printed to the console.}}
( ) FoodBread {{Incorrect because only one of the <code>print()</code> methods will be called.}}
( ) BreadFood {{Incorrect because only one of the <code>print()</code> methods will be called.}}
( ) The code will result in a runtime error. {{incorrect because the code above will run and print "Bread"}}

||Only one of the print methods are called.||