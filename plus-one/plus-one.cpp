class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        vector<int> temp(digits.size() + 1);
        for (int i = digits.size() - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        temp[0] = 1;
        return temp;
    }
};