def sum_of_numbers(s):
    num = 0
    current_num = ""
    for char in s:
        if char.isdigit():
            current_num += char
        elif current_num:
            num += int(current_num)
            current_num = ""
    if current_num:
        num += int(current_num)
    return num

input_str = input("Enter a string: ")
print("Sum of numbers in the string:", sum_of_numbers(input_str))
