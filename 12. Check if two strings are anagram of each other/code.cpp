#include <iostream>
#include <algorithm>
using namespace std;

bool areAnagrams(string s1, string s2) {
    sort(s1.begin(), s1.end());
    sort(s2.begin(), s2.end());
    return s1 == s2;
}

int main() {
    string input_str1, input_str2;
    cout << "Enter the first string: ";
    cin >> input_str1;
    cout << "Enter the second string: ";
    cin >> input_str2;
    cout << "Are the strings anagrams? " << (areAnagrams(input_str1, input_str2) ? "true" : "false") << endl;
    return 0;
}
