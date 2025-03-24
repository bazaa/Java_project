## Data Types in Java

### Primitive Data Types
Java has 8 primitive data types:

#### Integer Types
* **byte**
    * 8-bit signed integer
    * Range: -128 to 127
    * Example: `byte b = 10;`

* **short**
    * 16-bit signed integer
    * Range: -32,768 to 32,767
    * Example: `short s = 5000;`

* **int**
    * 32-bit signed integer
    * Range: -2³¹ to 2³¹-1
    * Default choice for integers
    * Example: `int i = 100000;`

* **long**
    * 64-bit signed integer
    * Range: -2⁶³ to 2⁶³-1
    * Requires 'L' or 'l' suffix for literals
    * Example: `long l = 100000000L;`

#### Floating-Point Types
* **float**
    * 32-bit floating-point
    * Requires 'F' or 'f' suffix for literals
    * Example: `float f = 234.5f;`

* **double**
    * 64-bit floating-point
    * Default for decimal values
    * Example: `double d = 123.456;`

#### Character Type
* **char**
    * 16-bit Unicode character
    * Range: 0 to 65,535
    * Enclosed in single quotes
    * Example: `char c = 'A';`
    * Can also use Unicode: `char c = '\u0041';` (A)

#### Boolean Type
* **boolean**
    * Represents true or false
    * Example: `boolean isJavaFun = true;`

### Reference Data Types
* **String**: Sequence of characters
    * Example: `String name = "Java";`

* **Arrays**: Collection of similar data types
    * Example: `int[] numbers = {1, 2, 3, 4, 5};`

* **Classes**: User-defined types
    * Example: `Student s = new Student();`

* **Interfaces**: Abstract types
    * Example: `List<String> names = new ArrayList<>();`

### Default Values
| Data Type | Default Value |
|-----------|---------------|
| byte      | 0             |
| short     | 0             |
| int       | 0             |
| long      | 0L            |
| float     | 0.0f          |
| double    | 0.0d          |
| char      | '\u0000'      |
| boolean   | false         |
| Reference | null          |