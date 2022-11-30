class Solution {
public:
    int countAsterisks(string s) {
        bool is_line = true;
        int fin = 0;
        for (int i = 0; i < s.size(); i++) {
            if (s[i] == '|' && !is_line) {
                is_line = true;
            } else if (s[i] == '|' && is_line) {
                is_line = false;
            } else if (!is_line) {
                continue;
            } else if (is_line) {
                if (s[i] == '*') {
                    fin++;
                }
            }
        }
        return fin;
    }
};