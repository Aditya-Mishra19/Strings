def remove_vowels(s):
    vowels = "aeiouAEIOU"
    return "".join(char for char in s if char not in vowels)

input_str = input("Enter a string: ")
print("String after removing vowels:", remove_vowels(input_str))
