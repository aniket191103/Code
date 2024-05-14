#include <iostream>
#include <fstream>
#include <cctype>

bool isNumber(const std::string& str) {
    for (char c : str) {
        if (!isdigit(c)) {
            return false;
        }
    }
    return true;
}

int main() {
    std::ifstream file("input.txt");
    if (!file) {
        std::cerr << "Error: File 'input.txt' does not exist." << std::endl;
        return 1;
    }

    int sum = 0;
    int count = 0;
    std::string str;

    while (file >> str) {
        if (isNumber(str)) {
            sum += std::stoi(str);
            count++;
        }
    }

    if (count == 0) {
        std::cerr << "Error: No valid numbers found in the file." << std::endl;
        return 1;
    }

    double average = static_cast<double>(sum) / count;
    std::cout << "The average of the numbers in the file is: " << average << std::endl;

    return 0;
}

