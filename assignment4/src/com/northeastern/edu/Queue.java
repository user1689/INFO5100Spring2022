package com.northeastern.edu;

import java.util.Stack;

public class Queue<T> {

    private Stack<T> s1;
    private Stack<T> s2;

    Queue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void add(T e) {
        s1.push(e);
    }

    public T remove() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        if (s2.isEmpty()) {
            return null;
        } else {
            return s2.pop();
        }
    }

    public T peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        if (s2.isEmpty()) {
            return null;
        } else {
            return s2.peek();
        }
    }

    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }

}
