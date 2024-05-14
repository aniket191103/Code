#include <iostream>
#include <fstream>
#include <vector>
#include <sstream>
#include <stdexcept>

double calculateAverage(const std::vector<double>& numbers) {
    if (numbers.empty()) {
        throw std::invalid_argument("No numbers to calculate the average");
    }
    double sum = 0;
    for (const auto& num : numbers) {
        sum += num;
    }
    return sum / numbers.size();
}

std::vector<double> readNumbersFromFile(const std::string& fileName) {
    std::ifstream file(fileName);
    if (!file) {
        throw std::runtime_error("File not found");
    }

    std::vector<double> numbers;
    std::string line;
    while (std::getline(file, line)) {
        std::istringstream iss(line);
        std::string word;
        while (iss >> word) {
            try {
                numbers.push_back(std::stod(word));
            } catch (const std::invalid_argument&) {
                std::cerr << "Warning: '" << word << "' is not a valid number and will be skipped\n";
            }
        }
    }
    return numbers;
}

int main() {
    try {
        std::vector<double> numbers = readNumbersFromFile("numbers.txt");
        std::cout << "The average is: " << calculateAverage(numbers) << std::endl;
    } catch (const std::exception& e) {
        std::cerr << "Error: " << e.what() << std::endl;
    }

    return 0;
}