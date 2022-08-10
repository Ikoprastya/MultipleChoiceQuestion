package com.bdse03.pfs;

import java.util.Scanner;

public class Option extends VarClass {
    public int answerOption() {
        Scanner input  = new Scanner(System.in);
        System.out.print("Input Your Answer: ");
        String checkInput = input.next();
        System.out.println();

        switch (checkInput){
            case "A","a" -> {
                countOption = 1;
                return countOption;
            }
            case "B","b" -> {
                countOption = 2;
                return countOption;
            }
            case "C","c" -> {
                countOption = 3;
                return countOption;
            }
            case "D","d" -> {
                countOption = 4;
                return countOption;
            }
            default -> {
                System.out.println("Invalid Input");
                answerOption();
            }

        }

        return countOption;
    }
}
