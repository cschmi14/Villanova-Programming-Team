var isPowerOfThree = function(n) {
    if (n == 1) {
        return true;
    }
    while (true) {
        n /= 3;
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
    }
};

print(isPowerOfThree(27));