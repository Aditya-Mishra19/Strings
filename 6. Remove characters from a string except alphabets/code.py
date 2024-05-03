def remove_non_alphabets(s):
    return ''.join(char for char in s if char.isalpha())

input_str = input("Enter a string: ")
print("String after removing non-alphabetic characters:", remove_non_alphabets(input_str))
