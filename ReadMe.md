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

<h4> Operators: </h4> 
<h5> Operator Evaluation: </h5> (Example File Name: OperatorEvaluation)
<ul>
<li> Spec #1: byte, short and char produce only int results </li>
<li> Spec #2: Evaulation of an expression is always from left to right </li>
</ul>

<h5> Bitwise Operators: </h5> (Example File Name: BitwiseOperators)
<ul>
<li> Spec #1: & (AND) - Operates on a binary operator
    <ol> 
    <li>1 & 1 = 1 </li>
    <li>1 & anything = 0 </li>
    </ol>
</li>
<li> Spec #2: | (OR) - Operates on a binary operator
    <ol>
    <li>0 | 0 = 0</li>
     <li>1 & anything = 1 </li>
    </ol>
</li>
<li> Spec #3: ^ (XOR) - Operates on a binary operator
    <ol>
    <li>1 ^ 0 = 1</li>
    <li>0 ^ 1 = 1 </li>
    <li>0 ^ 0 = 0 </li>
    <li>1 ^ 1 = 0 </li>
    </ol>
</li>
<li> Spec #4: ~ (Complement) - Operates on a unary operator
    <ol>
    <li>~1 = 0</li>
    <li>~0 = 1</li>
    <li> Note: Compiler will give 2’s complement of the result of that complemented number</li>
    </ol>
</li>
</ul>