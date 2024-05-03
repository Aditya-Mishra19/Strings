#include <iostream>
#include <algorithm>
using namespace std;

void reverseString(string& s) {
    reverse(s.begin(), s.end());
}

int main() {
    string input_str;
    cout << "Enter a string: ";
    getline(cin, input_str);
    reverseString(input_str);
    cout << "Reversed string: " << input_str << endl;
    return 0;
}
