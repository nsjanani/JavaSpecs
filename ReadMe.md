<h1> Java Specs: </h1>
(Please refer the examples matching the same file name)

<h4>Declaration Order</h4> (Example File Name: DeclartionOrder.java)
<ul>
<li> Spec #1: Order in which a constructor, methods and variables are defined inside a class doesn't matter at all</li>
<li> Spec #2: Order in which variables are defined does matter inside a method</li>        
</ul>

<h4> Variable Scope: </h4> (Example File Name: VariableScope)
<ul>
<li> Spec #1: Starts from the place where it has been defined and ends at the curly brace </li>
</ul>

<h4> Conversion: </h4> 
(Example File Name: Conversion.java)
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
<h5> Operator Evaluation: </h5> (Example File Name: OperatorEvaluation.java)
<ul>
<li> Spec #1: byte, short and char produce only int results </li>
<li> Spec #2: Evaulation of an expression is always from left to right </li>
</ul>

<h5> Bitwise Operators: </h5> (Example File Name: BitwiseOperators.java)
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

<h5> Shift Operators: </h5> (Example File Name: ShiftOperators.java)
<ul>
<li> Spec #1: >> (Signed Right Shift) 
    <ol> 
    <li>Shifts the bits of the number to the right by 1 and fills 0 on the left</li>
    <li>Having the effect of divide the number by 2</li>
    <li>Preserves the sign of the initial number</li>
    </ol>
</li>
<li> Spec #2: >>> (Unsigned Right Shift)
    <ol>
    <li>Shifts the bits of the number to the right by 1 and fills 0 on the left</li>
    <li>Doesn't preserve the sign of the initial number</li>
    </ol>
</li>
<li> Spec #3: >> (Left Shift)
    <ol>
    <li>Shifts the bits of the number to the left by 1 and fills 0 on the left</li>
    </ol>
</li>
<li> Spec #4: There is nothing called Signed/Unsigned Left Shift, as they both are identical
    <ol>
    <li>Here is why ? </li>
    <li>For signed shift operators. MSB (Most Significant Bit) is the place to store the sign values (‘1s’ for negative values, and ‘0s’ for positive values).</li>
    <li>In Left shift operation the LSBs (Least Significant Bit) get’s vacant, as the binary bits are sifted to the Left. And, it doesn’t matter whether the left operand is +ve or -ve, you can’t fill in the sign value for the vacant places at the LSB.</li>
    </li>Therefore, there is no need for the Unsigned Left Shift Operator (<<<) in Java. Because the Left Shift Operator (<<) does the Job.</li>
   </ol>
</li>
</ul>

<h5> Promoting Operands: </h5> (Example File Name: PromotingOperands.java)
<ul>
<li>Spec #1: If either of the operand is double, the result is promoted to double</li>
<li>Spec #2: Else If either of the operand is float, the result is promoted to float</li>
<li>Spec #3: Else If either of the operand is long, the result is promoted to long</li>
<li>Spec #4: Else If either of the operand is int, the result is promoted to int</li>
<li>Spec #5: The original values is not affected by this promotion</li>
</ul>

<h6> Assignement Operators: </h5> (Example File Name: AssignementOperators.java)
<ul>
<li>Spec #1: Avoids extra typing</li>
<li>Spec #2: Explicit cast for data types less than int - example - short</li>
<li>Spec #3: Unambiguity</li>
<li>Spec #4: Assignment Operators --> +=, -=, *=, /=, %=, &=. |=, ^=, >>=, >>>=, <<=</li>
</ul>