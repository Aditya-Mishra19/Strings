def capitalize(string):
    string = list(string)
    size = len(string)
    for i in range(size):
        if i == 0 or i == size - 1:
            if string[i].islower():
                string[i] = string[i].upper()
        elif string[i] == ' ':
            if string[i - 1].islower():
                string[i - 1] = string[i - 1].upper()
            if string[i + 1].islower():
                string[i + 1] = string[i + 1].upper()
    return ''.join(string)

input_str = input("Enter a string: ")
print("String after capitalizing first and last character of each word:", capitalize(input_str))
