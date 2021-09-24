#include <unordered_map>
class Solution {
public:
    int firstUniqChar(string s) {
        unordered_map<char, int> occurrences;
        unordered_set<char> duplicates;
        for (int i = 0; i < s.size(); i++) {
            if (occurrences.count(s[i]) == 0 && duplicates.count(s[i]) == 0) {
                occurrences[s[i]] = 1;
            }
            else {
                occurrences.erase(s[i]);
                duplicates.insert(s[i]);
            }
        }
        for (int i = 0; i < s.size(); i++) {
            if (occurrences[s[i]] == 1) {
                return i;
            }
        }
        return -1;
    }
};