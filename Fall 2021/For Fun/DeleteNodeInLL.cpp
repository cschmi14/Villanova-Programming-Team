 struct ListNode {
     int val;
     ListNode *next;
     ListNode(int x) : val(x), next(nullptr) {}
 };

class Solution {
public:
    void deleteNode(ListNode* node) {
        ListNode* newNext = node->next;
        node->val = newNext->val;
        node->next = newNext->next;
    }
};