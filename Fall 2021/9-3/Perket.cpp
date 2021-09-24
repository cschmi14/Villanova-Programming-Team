#include <iostream>
#include <cstdlib>

using namespace std;

int main() {

    int size, min;
    cin >> size;
    int ingredients[size][2];
    int sumSour = 1;
    int sumBitter = 0;
    int difference;
    int second = 0;
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < 2; j++) {
            cin >> ingredients[i][j];
        }
    }
    min = abs(ingredients[0][0] - ingredients[0][1]);
    for (int i = 0; i < size; i++) {
        second = i;
        while (second < size) {
            if (second != i) {
                sumSour *= ingredients[i][0];
                sumBitter += ingredients[i][1];
            }
            for (int j = second; j < size; j++) {
                sumSour *= ingredients[j][0];
                sumBitter += ingredients[j][1];
                difference = abs(sumSour - sumBitter);
                printf("info: %d %d \n", sumSour, sumBitter);
                if (difference < min) {
                    min = difference;
                }
            }
            second++;
            sumSour = 1;
            sumBitter = 0;
        }
        sumSour = 1;
        sumBitter = 0;
    }
    printf("%d", min);

}

void printCombination(int arr[], int n, int r)
{
    // A temporary array to store
    // all combination one by one
    int data[r];

    // Print all combination using
    // temporary array 'data[]'
    combinationUtil(arr, data, 0, n-1, 0, r);
}

/* arr[] ---> Input Array
data[] ---> Temporary array to
store current combination
start & end ---> Staring and
Ending indexes in arr[]
index ---> Current index in data[]
r ---> Size of a combination to be printed */
void combinationUtil(int arr[], int data[],
                    int start, int end,
                    int index, int r)
{
    // Current combination is ready
    // to be printed, print it
    if (index == r)
    {
        for (int j = 0; j < r; j++)
            cout << data[j] << " ";
        cout << endl;
        return;
    }

    // replace index with all possible
    // elements. The condition "end-i+1 >= r-index"
    // makes sure that including one element
    // at index will make a combination with
    // remaining elements at remaining positions
    for (int i = start; i <= end &&
        end - i + 1 >= r - index; i++)
    {
        data[index] = arr[i];
        combinationUtil(arr, data, i+1,
                        end, index+1, r);
    }
}
