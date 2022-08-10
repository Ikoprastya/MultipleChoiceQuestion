package com.bdse03.pfs;

import java.util.Scanner;

public class UserPickedTest extends ShowQuestion {
    public void userPickMcq() {
        System.out.println("Pick Your MCQ Test!");
        System.out.println("1. HTML");
        System.out.println("2. CSS");
        System.out.print("Input Your Test: ");
        Scanner input = new Scanner(System.in);
        pickOption = input.nextInt();

        if (pickOption == 1){
            questions("src\\com\\bdse03\\pfs\\csv\\htmlmcq.csv");

        } else if (pickOption == 2){
            questions("src\\com\\bdse03\\pfs\\csv\\cssmcq.csv");
        } else {
            System.out.println("Please enter 1 or 2");
            userPickMcq();
        }

    }

}
