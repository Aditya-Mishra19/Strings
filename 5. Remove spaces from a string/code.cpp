#include <iostream>
#include <string>
using namespace std;

string removeSpaces(string s) {
    string result = "";
    for (char c : s) {
        if (c != ' ') {
            result += c;
        }
    }
    return result;
}

int main() {
    string input_str;
    cout << "Enter a string: ";
    getline(cin, input_str);
    cout << "String after removing spaces: " << removeSpaces(input_str) << endl;
    return 0;
}
