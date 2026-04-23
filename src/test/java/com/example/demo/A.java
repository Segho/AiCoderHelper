package com.example.demo;

public class A {

    // ❌ 没有 private
    // ❌ 没有 static
    // ❌ 没有 final
    public  String name = "A";

    public void print() {
        System.out.println("A.name = " + name);
    }
}