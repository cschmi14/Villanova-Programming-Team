#include <iostream>

using namespace std;

int main() {
    int a, b, c, l;
    cin >> a >> b >> c >> l;
    int count = 0;
    for (int numA = 0; numA <= l / a; numA++)
        for (int numB = 0; numB <= l / b; numB++)
            for (int numC = 0; numC <= l / c; numC++)
                if (numA * a + numB * b + numC * c == l) {
                    cout << numA << " " << numB << " " << numC << "\n";
                    count++;
                }
    if (count == 0)
        cout << "impossible\n";
    return 0;
}
