package com.company;

public class Third {
    public static int turnLastZeroIntoOne(int a) {
        if((a & 1) == 0) {
            return a ^ 1;
        }
        return a;
    }
}
