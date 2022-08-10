package com.bdse03.pfs;

import java.util.Scanner;

public class GetUserName extends VarClass {
    public void userGetName() {
        Scanner input = new Scanner(System.in);
        System.out.println();

        System.out.println("Welcome to MCQ Test");
        System.out.print("Input Your Name: ");
        name = input.nextLine();

        System.out.println();


    }
}
