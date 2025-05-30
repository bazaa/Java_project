# Java Variables

Variables in Java are containers that store data values. Here's an overview of the key concepts:

## Variable Declaration and Initialization

```java
// Declaration
int age;

// Declaration with initialization
int score = 95;

// Multiple variables of the same type
int x = 10, y = 20, z = 30;
```

## Data Types in Java

Java has several primitive data types:

### Integer types:
- **byte**: 8-bit (-128 to 127)
- **short**: 16-bit (-32,768 to 32,767)
- **int**: 32-bit (most common integer type)
- **long**: 64-bit (add 'L' suffix for literals, e.g., `long value = 100000000L;`)

### Floating-point types:
- **float**: 32-bit (add 'F' suffix, e.g., `float price = 19.99F;`)
- **double**: 64-bit (default for decimal values)

### Character type:
- **char**: Stores a single character using single quotes (e.g., `char grade = 'A';`)

### Boolean type:
- **boolean**: Stores true/false values

### Reference types:
- Objects, arrays, String, etc.

## Variable Naming Rules

- Can contain letters, digits, underscore (_), and dollar sign ($)
- Must begin with a letter, underscore, or dollar sign
- Cannot use reserved keywords
- Case-sensitive
- Should use camelCase by convention (e.g., `firstName`)

## Type Conversion

```java
// Implicit conversion (widening)
int myInt = 100;
long myLong = myInt; // Automatically converts int to long

// Explicit conversion (narrowing)
double myDouble = 9.78;
int myInt = (int) myDouble; // Manual casting, results in 9
```

## Constants

```java
// Using the final keyword creates a constant
final double PI = 3.14159;
```

## Variable Scope

- **Local variables**: Declared within methods, constructors, or blocks
- **Instance variables**: Declared in a class but outside methods
- **Static variables**: Declared with the static keyword, shared across all instances
