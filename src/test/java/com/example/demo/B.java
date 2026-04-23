package com.example.demo;

public class B {

    public static void main(String[] args) {

        A a1 = new A();
        A a2 = new A();

        a1.print();
        a2.print();

        // ❌ 外部直接改
        //a1.name = "B";


        a1.print();
        a2.print();
    }
}