def solve(s):
    res = ""
    for c in s:
        if c == '(' or c == ')':
            continue
        res += c 
    return res

input_expr = input("Enter an algebraic expression: ")
print("Expression after removing brackets:", solve(input_expr))
