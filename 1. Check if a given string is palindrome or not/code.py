def isPalindrome(s):
    start, end = 0, len(s) - 1 
    while start <= end:
        if s[start] != s[end]:
            return "Not a Palindrome"
        start += 1 
        end -= 1
    return "Its a Palindrome"

givenStr = input()
print(isPalindrome(givenStr))