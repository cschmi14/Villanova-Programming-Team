class RomanToInteger {
    public int romanToInt(String s) {
        char c1;
        int num1 = 0;
        char c2;
        int num2 = 0;
        int total = 0;
        boolean last = false;
        for (int i = 0; i < s.length() - 1; i++) {
            c1 = s.charAt(i);
            switch (c1) {
                case ('I') : {
                    num1 = 1;
                    break;
                }
                    case ('V') : {
                    num1 = 5;
                    break;
                }
                    case ('X') : {
                    num1 = 10;
                    break;
                }
                    case ('L') : {
                    num1 = 50;
                    break;
                }
                    case ('C') : {
                    num1 = 100;
                    break;
                }
                    case ('D') : {
                    num1 = 500;
                    break;
                }
                    case ('M') : {
                    num1 = 1000;
                    break;
                }
            }
            
            c2 = s.charAt(i + 1);
            switch (c2) {
                case ('I') : {
                    num2 = 1;
                    break;
                }
                    case ('V') : {
                    num2 = 5;
                    break;
                }
                    case ('X') : {
                    num2 = 10;
                    break;
                }
                    case ('L') : {
                    num2 = 50;
                    break;
                }
                    case ('C') : {
                    num2 = 100;
                    break;
                }
                    case ('D') : {
                    num2 = 500;
                    break;
                }
                    case ('M') : {
                    num2 = 1000;
                    break;
                }
            }
            
            if (num1 >= num2) {
                total += num1;
            }
            else {
                if (i == s.length() - 2) {
                    last = true;
                }
                total += num2 - num1;
                i++;
            }
            
        }
        c2 = s.charAt(s.length() - 1);
        if (!last) {
                switch (c2) {
                    case ('I') : {
                        num2 = 1;
                        break;
                    }
                        case ('V') : {
                        num2 = 5;
                        break;
                    }
                        case ('X') : {
                        num2 = 10;
                        break;
                    }
                        case ('L') : {
                        num2 = 50;
                        break;
                    }
                        case ('C') : {
                        num2 = 100;
                        break;
                    }
                        case ('D') : {
                        num2 = 500;
                        break;
                    }
                        case ('M') : {
                        num2 = 1000;
                        break;
                    }
                }
            total += num2;
        }
        
        return total;
    }
}
