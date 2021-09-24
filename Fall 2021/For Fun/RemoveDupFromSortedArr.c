
int removeDuplicates(int* nums, int numsSize){
    if (numsSize == 0) {
        return 0;
    }
    int arr[numsSize];
    int currNum = nums[0];
    int index = 0;
    arr[index] = currNum;
    int count = 1;
    for (int i = 1; i < numsSize; i++)  {
        if (nums[i] > currNum) {
            currNum = nums[i];
            index++;
            arr[index] = currNum;
            count++;
        }
    }
    for (int i = 0; i < numsSize; i++)  {
        nums[i] = arr[i];
    }
    return count;
}