#include <iostream>
#include <unordered_map>
using namespace std;

void calculateFrequency(string s) {
    unordered_map<char, int> freq;
    for (char c : s) {
        freq[c]++;
    }
    cout << "Frequency of characters in the string:" << endl;
    for (auto& p : freq) {
        cout << p.first << p.second << " ";
    }
}

int main() {
    string input_str;
    cout << "Enter a string: ";
    getline(cin, input_str);
    calculateFrequency(input_str);
    return 0;
}
