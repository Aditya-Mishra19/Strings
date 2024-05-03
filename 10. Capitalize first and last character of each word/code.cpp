#include <iostream>
#include <cctype>
using namespace std;

void capitalize(string& str) {
    int size = str.length();
    for (int i = 0; i < size; i++) {
        if (i == 0 || i == (size - 1)) {
            if (islower(str[i]))
                str[i] = toupper(str[i]);
        } else if (str[i] == ' ') {
            if (islower(str[i - 1]))
                str[i - 1] = toupper(str[i - 1]);
            if (islower(str[i + 1]))
                str[i + 1] = toupper(str[i + 1]);
        }
    }
}

int main() {
    string str;
    cout << "Enter a string: ";
    getline(cin, str);
    capitalize(str);
    cout << "String after capitalizing the first and last letter of each word: " << endl;
    cout << str << endl;
    return 0;
}
