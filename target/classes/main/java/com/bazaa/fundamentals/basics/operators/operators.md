## Java Operators

### Arithmetic Operators
* **+** : Addition
    * `int sum = 5 + 3;  // 8`
* **-** : Subtraction
    * `int diff = 5 - 3;  // 2`
* **\*** : Multiplication
    * `int product = 5 * 3;  // 15`
* **/** : Division
    * `int quotient = 10 / 3;  // 3`
    * `double exactQuotient = 10.0 / 3.0;  // 3.3333...`
* **%** : Modulus (remainder)
    * `int remainder = 10 % 3;  // 1`
* **++** : Increment
    * `int i = 5; i++;  // i becomes 6`
    * `int j = 5; int k = ++j;  // j and k both become 6 (pre-increment)`
    * `int m = 5; int n = m++;  // m becomes 6, n becomes 5 (post-increment)`
* **--** : Decrement
    * `int i = 5; i--;  // i becomes 4`
    * Pre and post decrement work similarly to increment

### Assignment Operators
* **=** : Simple assignment
    * `int a = 5;`
* **+=** : Add and assign
    * `int a = 5; a += 3;  // a becomes 8`
* **-=** : Subtract and assign
    * `int a = 5; a -= 3;  // a becomes 2`
* **\*=** : Multiply and assign
    * `int a = 5; a *= 3;  // a becomes 15`
* **/=** : Divide and assign
    * `int a = 6; a /= 3;  // a becomes 2`
* **%=** : Modulus and assign
    * `int a = 7; a %= 3;  // a becomes 1`

### Comparison Operators
* **==** : Equal to
    * `boolean isEqual = (5 == 5);  // true`
* **!=** : Not equal to
    * `boolean notEqual = (5 != 6);  // true`
* **>** : Greater than
    * `boolean greaterThan = (5 > 3);  // true`
* **<** : Less than
    * `boolean lessThan = (5 < 8);  // true`
* **>=** : Greater than or equal to
    * `boolean greaterEqual = (5 >= 5);  // true`
* **<=** : Less than or equal to
    * `boolean lessEqual = (5 <= 5);  // true`

### Logical Operators
* **&&** : Logical AND
    * `boolean result = (5 > 3) && (8 > 5);  // true`
* **||** : Logical OR
    * `boolean result = (5 > 8) || (8 > 5);  // true`
* **!** : Logical NOT
    * `boolean result = !(5 > 8);  // true`

### Bitwise Operators
* **&** : Bitwise AND
    * `int result = 5 & 3;  // 1`
* **|** : Bitwise OR
    * `int result = 5 | 3;  // 7`
* **^** : Bitwise XOR
    * `int result = 5 ^ 3;  // 6`
* **~** : Bitwise Complement
    * `int result = ~5;  // -6`
* **<<** : Left Shift
    * `int result = 5 << 1;  // 10`
* **>>** : Right Shift
    * `int result = 5 >> 1;  // 2`
* **>>>** : Unsigned Right Shift
    * `int result = -5 >>> 1;  // 2147483645`

### Ternary Operator
* **?:** : Conditional operator
    * `int max = (a > b) ? a : b;  // assigns the larger value to max`

### Operator Precedence
1. Postfix operators (`expr++`, `expr--`)
2. Prefix operators (`++expr`, `--expr`, `+expr`, `-expr`, `~`, `!`)
3. Multiplicative (`*`, `/`, `%`)
4. Additive (`+`, `-`)
5. Shift (`<<`, `>>`, `>>>`)
6. Relational (`<`, `>`, `<=`, `>=`, `instanceof`)
7. Equality (`==`, `!=`)
8. Bitwise AND (`&`)
9. Bitwise XOR (`^`)
10. Bitwise OR (`|`)
11. Logical AND (`&&`)
12. Logical OR (`||`)
13. Ternary (`? :`)
14. Assignment (`=`, `+=`, `-=`, etc.)