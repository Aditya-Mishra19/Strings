#include <bits/stdc++.h>
using namespace std;
bool isPalindrome(string s) {
    int start = 0, end = s.length() - 1;
    while (start <= end) {
        if (s[start] != s[end]) {
            return false;
        }
        start++;
        end--;
    }
    return true;
}
int main() {
    string givenStr;
    cout << "Enter a string: ";
    cin >> givenStr;
    if (isPalindrome(givenStr)) {
        cout << "It's a Palindrome" << endl;
    } else {
        cout << "Not a Palindrome" << endl;
    }
    return 0;
}
