class Solution {
public:
    vector<double> convertTemperature(double celsius) {
        return std::vector<double>{celsius + 273.15, celsius * 1.80 + 32.00};
    }
};