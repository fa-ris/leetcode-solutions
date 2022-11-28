class Solution {
public:
    struct sorter {
        bool operator()(const std::pair<std::string, int> &p1, const std::pair<std::string, int> &p2) {
            return p1.second > p2.second;
        }
    };
    vector<string> sortPeople(vector<string>& names, vector<int>& heights) {
        std::vector<std::pair<std::string, int>> v;
        for (int i = 0; i < names.size(); i++) {
            auto p = std::pair<std::string, int>(names.at(i), heights.at(i));
            v.push_back(p);
        }
        std::sort(v.begin(), v.end(), sorter());
        vector<std::string> fin;
        for (auto p : v) {
            fin.push_back(p.first);
        }
        return fin;
    }
};