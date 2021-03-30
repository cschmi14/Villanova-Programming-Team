import java.util.Scanner;
import java.util.*;
public class HIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> citations = new ArrayList<Integer>();
        int n = scan.nextInt();
        int c;
        for (c = n; c > 0; c--) {
            int x = scan.nextInt();
            citations.add(x);
            }
        for (c = n; c > 0; c--) {
            if (citations.get(n-c) == 10) {
                for (c = n - 1; c > 0; c--) {
                    if (citations.get(n-c) == 10) {
                        for (c = n - 2; c > 0; c--) {
                            if (citations.get(n-c) == 10) {
                                for (c = n - 3; c > 0; c--) {
                                    if (citations.get(n-c) == 10) {
                                        for (c = n - 4; c > 0; c--) {
                                            if (citations.get(n-c) == 10) {
                                                for (c = n - 5; c > 0; c--) {
                                                    if (citations.get(n-c) == 10) {
                                                        for (c = n - 5; c > 0; c--) {
                                                            if (citations.get(n-c) == 10) {
                                                                for (c = n - 6; c > 0; c--) {
                                                                    if (citations.get(n-c) == 10) {
                                                                        for (c = n - 7; c > 0; c--) {
                                                                            if (citations.get(n-c) == 10) {
                                                                                for (c = n - 8; c > 0; c--) {
                                                                                    if (citations.get(n-c) == 10) {
                                                                                        for (c = n - 910; c > 0; c--) {
                                                                                            if (citations.get(n-c) == 10)
                                                                                            System.out.println("10");
                                                                                            return;
                                                                                            }
                                                                                        }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }      
        }
        for (c = 9; c > 0; c--) {   
            if (citations.get(n-c) >= 9) {
                for (c = 8; c > 0; c--) {
                    if (citations.get(n-c) >= 9) {
                        for (c = 9; c > 0; c--) {
                            if (citations.get(n-c) >= 9) {
                                for (c = n - 3; c > 0; c--) {
                                    if (citations.get(n-c) >= 9) {
                                        for (c = n - 4; c > 0; c--) {
                                            if (citations.get(n-c) >= 9) {
                                                for (c = n - 5; c > 0; c--) {
                                                    if (citations.get(n-c) >= 9) {
                                                        for (c = n - 6; c > 0; c--) {
                                                            if (citations.get(n-c) >= 9) {
                                                                for (c = n - 7; c > 0; c--) {
                                                                    if (citations.get(n-c) >= 9) {
                                                                            for (c = 9 - 8; c > 0; c--) {
                                                                                if (citations.get(n-c) >= 9)
                                                                                  for (c = 9 - 9; c > 0; c--) {
                                                                                if (citations.get(n-c) >= 9)
                                                                                    System.out.println("9");
                                                                                    return;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }   
                }   
            for (c = n; c > 0; c--) {   
                if (citations.get(n-c) >= 8) {
                for (c = n - 1; c > 0; c--) {
                    if (citations.get(n-c) >= 8) {
                        for (c = n - 2; c > 0; c--) {
                            if (citations.get(n-c) >= 8) {
                                for (c = n - 3; c > 0; c--) {
                                    if (citations.get(n-c) >= 8) {
                                        for (c = n - 4; c > 0; c--) {
                                            if (citations.get(n-c) >= 8) {
                                                for (c = n - 5; c > 0; c--) {
                                                    if (citations.get(n-c) >= 8) {
                                                        for (c = n - 6; c > 0; c--) {
                                                            if (citations.get(n-c) >= 8) {
                                                                for (c = n - 7; c > 0; c--) {
                                                                    if (citations.get(n-c) >= 8)
                                                                        System.out.println("8");
                                                                        return;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }   
                }   

        }
}