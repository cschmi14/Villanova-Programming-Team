#include <string>
#include <algorithm>
using namespace std;
class Solution {
public:
    bool isPalindrome(string s) {
        string copy = "";
        for (int i = 0; i < s.size(); i++) {
            if (s[i] <= 90 && s[i] >= 65) {
                copy.push_back(s[i]);
            }
            else if (s[i] >= 97 && s[i] <= 122) {
                copy.push_back(s[i]);
            }
            else if (s[i] >= 48 && s[i] <= 57) {
                copy.push_back(s[i]);
            }
        }
        s = copy;
        int n = s.size();
        for (int i = 0; i < n / 2; i++) {
            if (tolower(s[i]) != tolower(s[n - 1 - i])) {
                return false;
            }
        }
        return true;
    }
};