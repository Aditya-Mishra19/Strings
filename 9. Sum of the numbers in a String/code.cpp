#include <iostream>
#include <string>
using namespace std;

int sumOfNumbers(string s) {
    int sum = 0;
    string currentNum = "";

    for (char c : s) {
        if (isdigit(c)) {
            currentNum += c;
        } else if (!currentNum.empty()) {
            sum += stoi(currentNum);
            currentNum = "";
        }
    }

    if (!currentNum.empty()) {
        sum += stoi(currentNum);
    }

    return sum;
}

int main() {
    string input_str;
    cout << "Enter a string: ";
    getline(cin, input_str);
    cout << "Sum of numbers in the string: " << sumOfNumbers(input_str) << endl;
    return 0;
}
