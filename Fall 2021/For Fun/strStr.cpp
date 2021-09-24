class Solution {
public:
    int strStr(string haystack, string needle) {
        int count = 0;
        int index = 0;
        if (needle.size() > haystack.size()) {
            return -1;
        }
        if (haystack.size() == 0 && needle.size() == 0) {
            return 0;
        }
        if (needle.size() == 0) {
            return 0;
        }
        for (int i = 0; i < haystack.size() - needle.size() + 1; i++) {
            index = i;
            count = 0;
            while (haystack[index] == needle[count]) {
                count++;
                index++;
                if (count == needle.size()) {
                    return i;
                }
            }
        }
        return -1;
    }
};