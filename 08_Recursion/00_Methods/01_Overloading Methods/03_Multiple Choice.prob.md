>>Consider the following code segment:

```
public class ExampleClass{
  public void calculateNum(int paramOne){
    /* implementations not shown */
  }
  public void calculateNum(int paramOne, int paramTwo){
    /* implementations not shown */
  }
  public void calculateNum(int paramOne, String paramTwo){
    /* implementations not shown */
  }
}
```

<p>Which of the following methods can be added to <code>ExampleClass</code> without causing a compile-time error?</p>
<p>I.</p>

```
public void calculateNum(int paramThree){
  /* implementation not shown */
}
```

<p>II.</p>

```
public void calculateNum(String paramOne, int paramTwo){
  /* implementation not shown */
}
```

<p>III.</p>

```
public void calculateNum(int paramOne, int paramTwo, String paramThree){
  /* implementation not shown */
}
```

<<

( ) I only {{Incorrect because the method in I would not work as <code>ExampleClass</code> already has a <code>calculateNum</code> method with one <code>int</code> parameter.}}
( ) I and II only {{Incorrect because the method in I would not work as <code>ExampleClass</code> already has a <code>calculateNum</code> method with one <code>int</code> parameter.}}
( ) I and III only {{Incorrect because the method in I would not work as <code>ExampleClass</code> already has a <code>calculateNum</code> method with one <code>int</code> parameter.}}
(x) II and III only {{Correct because the methods in II and III don't have the same parameters (in the exact same order) as the methods in <code>ExampleClass</code>.}}
( ) I, II and III {{Incorrect because the method in I would not work as <code>ExampleClass</code> already has a <code>calculateNum</code> method with one <code>int</code> parameter.}}

||You cannot have parameters with the same data type in the same order when overloading methods. ||
