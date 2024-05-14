s=(2,5,8)
s_append = s + (8, 16, 67)
print(s_append)
print(str(len(s_append)))
print(s)


# Let's start by defining some variables and working with operators.

# Variables hold data. You can assign values to variables like this:
x = 5
y = 3

# Arithmetic operators: +, -, *, /, % (addition, subtraction, multiplication, division, modulo)
addition_result = x + y
subtraction_result = x - y
multiplication_result = x * y
division_result = x / y
modulo_result = x % y


# Let's print the results to the console.
print("Addition Result:", addition_result)
print("Subtraction Result:", subtraction_result)
print("Multiplication Result:", multiplication_result)
print("Division Result:", division_result)
print("Modulo Result:", modulo_result)

# Now, let's work with strings.

# Strings are sequences of characters enclosed in single (' ') or double (" ") quotes.
name = "John"
greeting = 'Hello, '

# You can concatenate strings using the + operator.
full_greeting = greeting + name

# You can also use the * operator to repeat a string.
repeated_greeting = greeting * 3

# Let's print the string results.
print("Full Greeting:", full_greeting)
print("Repeated Greeting:", repeated_greeting)

# You can access individual characters in a string using indexing.
first_character = name[0]  # Indexing starts at 0
print("First Character of Name:", first_character)

# You can find the length of a string using the len() function.
name_length = len(name)
print("Length of Name:", name_length)

# Strings can be sliced to extract substrings.
substring = name[1:3]  # This extracts characters at index 1 and 2 (up to, but not including 3).
print("Substring:", substring)

# You can also check if a substring exists in a string using the 'in' keyword.
contains_e = 'e' in name
print("Contains 'e' in Name:", contains_e)


x=5
y=4

is_equal = x == y   # Checks if x is equal to y, result: False
not_equal = x != y  # Checks if x is not equal to y, result: True
greater_than = x > y  # Checks if x is greater than y, result: True
less_than = x < y     # Checks if x is less than y, result: False
greater_equal = x >= y  # Checks if x is greater than or equal to y, result: True
less_equal = x <= y     # Checks if x is less than or equal to y, result: False

# Printing the results
print("x:", x)
print("y:", y)
print("x == y:", is_equal)
print("x != y:", not_equal)
print("x > y:", greater_than)
print("x < y:", less_than)
print("x >= y:", greater_equal)
print("x <= y:", less_equal)


# Logical Operators
c = True
d = False

# Logical AND
result_and = c and d  # False because both a and b are not True

# Logical OR
result_or = c or d  # True because at least one of a and b is True

# Logical NOT
result_not_c = not c  # False because the NOT of True is False
result_not_d = not d  # True because the NOT of False is True

# Printing the results
print("c:", c)
print("d:", d)
print("c and d:", result_and)
print("c or d:", result_or)
print("not c:", result_not_c)
print("not d:", result_not_d)

# Define two integers
a = 5  # binary: 0101
b = 3  # binary: 0011

# Bitwise AND
result_and = a & b  # binary result: 0001, decimal result: 1

# Bitwise OR
result_or = a | b  # binary result: 0111, decimal result: 7

# Bitwise XOR
result_xor = a ^ b  # binary result: 0110, decimal result: 6

# Bitwise NOT
result_not_a = ~a  # binary result: 1010 (in two's complement form), decimal result: -6

# Left Shift
left_shifted = a << 2  # binary result: 10100, decimal result: 20

# Right Shift
right_shifted = a >> 1  # binary result: 0010, decimal result: 2

# Print results
print("Bitwise AND:", result_and)
print("Bitwise OR:", result_or)
print("Bitwise XOR:", result_xor)
print("Bitwise NOT of a:", result_not_a)
print("Left Shift:", left_shifted)
print("Right Shift:", right_shifted)