#include <iostream>
#include <string>
using namespace std;

void countCharacters(string s, int& vowels, int& consonants, int& spaces) {
    vowels = 0;
    consonants = 0;
    spaces = 0;
    for (char c : s) {
        if (tolower(c) == 'a' || tolower(c) == 'e' || tolower(c) == 'i' || tolower(c) == 'o' || tolower(c) == 'u') {
            vowels++;
        } else if (isalpha(c)) {
            consonants++;
        } else if (isspace(c)) {
            spaces++;
        }
    }
}

int main() {
    string input_str;
    cout << "Enter a string: ";
    getline(cin, input_str);
    int vowels, consonants, spaces;
    countCharacters(input_str, vowels, consonants, spaces);
    cout << "Vowels: " << vowels << endl;
    cout << "Consonants: " << consonants << endl;
    cout << "White spaces: " << spaces << endl;
    return 0;
}
