package com.designpattern;

public class Design {
    void display() {
        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
        }
    }
}