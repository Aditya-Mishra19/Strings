def calculate_frequency(s):
    freq = {}
    for char in s:
        freq[char] = freq.get(char, 0) + 1
    return freq

input_str = input("Enter a string: ")
frequency = calculate_frequency(input_str)
print("Frequency of characters in the string:")
for char, count in frequency.items():
    print(f"{char}{count}", end=" ")
