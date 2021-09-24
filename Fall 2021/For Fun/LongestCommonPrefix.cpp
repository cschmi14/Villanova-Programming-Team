#include <string>
class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string common = "";
        int min = strs[0].size();
        char currChar;
        for (int i = 1; i < strs.size(); i++) {
            if (strs[i].size() < min) {
                min = strs[i].size();
            }
        }
        for (int i = 0; i < min; i++) {
            currChar = strs[0][i];
            for (int j = 1; j < strs.size(); j++) {
                if (strs[j][i] != currChar) {
                    return common;
                }
            }
            common.push_back(currChar);
        }
        return common;
    }
};