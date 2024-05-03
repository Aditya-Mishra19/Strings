def count_characters(s):
    vowels = 0
    consonants = 0
    spaces = 0
    for char in s:
        if char.lower() in 'aeiou':
            vowels += 1
        elif char.isalpha():
            consonants += 1
        elif char.isspace():
            spaces += 1
    return vowels, consonants, spaces

input_str = input("Enter a string: ")
vowels, consonants, spaces = count_characters(input_str)
print("Vowels:", vowels)
print("Consonants:", consonants)
print("White spaces:", spaces)
