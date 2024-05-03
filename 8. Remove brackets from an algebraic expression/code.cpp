#include <iostream>
#include <string>
using namespace std;

string solve(string s) {
    string res = "";
    for (char c : s) {
        if (c == '(' || c == ')') {
            continue;
        }
        res += c;
    }
    return res;
}

int main() {
    string input_str;
    cout << "Enter a string: ";
    getline(cin, input_str);
    cout << "Result after removing parentheses: " << solve(input_str) << endl;
    return 0;
}
