class Solution {
public:
    bool isAnagram(string s, string t) {
        unordered_map<char, int> occurrencesS;
        unordered_map<char, int> occurrencesT;
        if (s.size() != t.size()) {
            return false;
        }
        for (int i = 0; i < s.size(); i++) {
            if (occurrencesS.count(s[i]) == 0) {
                occurrencesS[s[i]] = 1;
            }
            else {
                occurrencesS[s[i]]++;
            }
        }
        for (int i = 0; i < t.size(); i++) {
            if (occurrencesT.count(t[i]) == 0) {
                occurrencesT[t[i]] = 1;
            }
            else {
                occurrencesT[t[i]]++;
            }
        }
        for (int i = 0; i < s.size(); i++) {
            if (!(occurrencesS[s[i]] == occurrencesT[s[i]])) {
                return false;
            }
        }
        return true;
    }
};