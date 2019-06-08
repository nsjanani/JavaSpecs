<h1> Java Specs: </h1>
(Please refer the examples matching the same file name)

<h4>Declaration Order</h4> (Example File Name: DeclartionOrder)
<ul>
<li> Spec #1: Order in which a constructor, methods and variables are defined inside a class doesn't matter at all</li>
<li> Spec #2: Order in which variables are defined does matter inside a method</li>        
</ul>

<h4> Variable Scope: </h4> (Example File Name: VariableScope)
<ul>
<li> Spec #1: Starts from the place where it has been defined and ends at the curly brace </li>
</ul>

<h4> Conversion: </h4> 
(Example File Name: Conversion)
In a overloaded world, the priorities for the conversion in order are:
<ul>
<li> Spec #1: Widening (Converting a primitive to higher order primitive) </li>
<li> Spec #2: Boxing (Converting a primitive to its corresponding reference wrapper) </li>
<li> Spec #3: Var-args </li> 
</ul>

Additional Rules:
<ul>
<li> Spec #4: Widening and boxing can't happen together (In other words, widening followed by boxing is not possible) </li>
<li> Spec #5: Boxing followed by Widening is acceptable </li>
</ul>

<h4> Operator Evaluation: </h4> (Example File Name: Operator Evaluation)
<ul>
<li> Spec #1: byte, short and char produce only int results </li>
<li> Spec #2: Evaulation of an expression is always from left to right </li>
</ul>