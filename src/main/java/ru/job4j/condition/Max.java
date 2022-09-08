package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int condition = left > right ? left : right;
        return condition;
    }

    public static void main(String[] args) {
        int msg = Max.max(100, 200);
        System.out.println(msg);
    }

}
