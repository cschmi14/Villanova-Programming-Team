#include <stdio.h>
#include <stdlib.h>

int comparator(const void *p, const void *q) {
    return (*(int*)p-*(int*)q);
} 

bool containsDuplicate(int* nums, int numsSize){
    if (numsSize == 1) {
        return false;
    }
    qsort((void*)nums, numsSize, sizeof(nums[0]), comparator);
    int currNum = nums[0];
    for (int i = 1; i < numsSize; i++) {
        if (currNum < nums[i]) {
            currNum = nums[i];
        }
        else {
            return true;
        }
    }
    return false;
}