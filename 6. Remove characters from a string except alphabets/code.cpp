#include <iostream>
#include <string>
using namespace std;

string removeNonAlphabets(string s) {
    string result = "";
    for (char c : s) {
        if (isalpha(c)) {
            result += c;
        }
    }
    return result;
}

int main() {
    string input_str;
    cout << "Enter a string: ";
    getline(cin, input_str);
    cout << "String after removing non-alphabetic characters: " << removeNonAlphabets(input_str) << endl;
    return 0;
}
