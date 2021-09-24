class PlusOne {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1]++;
            return digits;
        }
        else {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] != 9) {
                    digits[i]++;
                    return digits;
                }
                else {
                    digits[i] = 0;
                }
            }  
        }
        int[] digits2 = new int[digits.length + 1];
        digits2[0] = 1;
        for (int i = 1; i < digits.length + 1; i++) {
            digits2[i] = 0;
        }
        return digits2;
    }
}