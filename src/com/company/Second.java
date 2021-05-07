package com.company;

import java.util.ArrayDeque;
import java.util.Deque;

public class Second {
    public static boolean isValid(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[') {
                deque.push(c);
            } else if (c == ')') {
                if (deque.isEmpty() || deque.pop() != '(') {
                    return false;
                }
            } else if (c == ']') {
                if (deque.isEmpty() || deque.pop() != '[') {
                    return false;
                }
            }
        }
        return deque.isEmpty();
    }
}
