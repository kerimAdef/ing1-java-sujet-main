package io;

import java.util.Scanner;

public class Keyboard {
    private Scanner scanner;

    public Keyboard() {
        this.scanner = new Scanner(System.in);
    }

    public int readInt(){
        return scanner.nextInt();
    }
    public int askNumber() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter an int : ");
        return scn.nextInt();
    }
}
