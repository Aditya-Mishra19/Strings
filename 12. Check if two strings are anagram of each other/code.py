def are_anagrams(str1, str2):
    return sorted(str1) == sorted(str2)

input_str1 = input("Enter the first string: ")
input_str2 = input("Enter the second string: ")
print("Are the strings anagrams? ", are_anagrams(input_str1, input_str2))
