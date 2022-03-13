package com.northeastern.edu;

public class Main {

    public static void main(String[] args) {
        Queue<String> q1 = new Queue<>();
        Queue<Integer> q2 = new Queue<>();
        q1.add("hi");
        q1.add("professor");
        q2.add(1);
        q2.add(2);
        System.out.println(q1.peek());
        System.out.println(q2.peek());

        StringBuilder sb = new StringBuilder();
        while (!q1.isEmpty()) {
            sb.append(q1.remove());
            sb.append(" ");
        }
        System.out.println(sb.toString());
        while (!q2.isEmpty()) {
            System.out.println(q2.remove());
        }
    }

}
