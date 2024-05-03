#include <iostream>
using namespace std;

int asciiValue(char c) {
    return int(c);
}

int main() {
    char input_char;
    cout << "Enter a character: ";
    cin >> input_char;
    cout << "ASCII value: " << asciiValue(input_char) << endl;
    return 0;
}
