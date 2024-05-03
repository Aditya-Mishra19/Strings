#include <iostream>
#include <string>
using namespace std;

string removeVowels(string s) {
    string vowels = "aeiouAEIOU";
    string result = "";
    for (char c : s) {
        if (vowels.find(c) == string::npos) {
            result += c;
        }
    }
    return result;
}

int main() {
    string input_str;
    cout << "Enter a string: ";
    getline(cin, input_str);
    cout << "String after removing vowels: " << removeVowels(input_str) << endl;
    return 0;
}
