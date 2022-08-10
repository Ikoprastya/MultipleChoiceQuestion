package com.bdse03.pfs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShowQuestion extends GetUserName {
    public static void questions (String fileName) {
        File showQuest = new File(fileName);
        try {
            Scanner takeQuest = new Scanner(showQuest);
            while (takeQuest.hasNext()) {
                String data = takeQuest.nextLine();
                String[] endArray = data.split(";");
                System.out.println();

                //question
                System.out.println(endArray[0]);
                //option
                System.out.println(endArray[1]);
                System.out.println(endArray[2]);
                System.out.println(endArray[3]);
                System.out.println(endArray[4]);
                //answer
                int answer;
                answer = Integer.parseInt(endArray[5]);
                Option check = new Option();
                int chooseAnswer = check.answerOption();

                //correct or incorrect answer
                if (chooseAnswer == answer) {
                    System.out.println("Well done, that correct!");
                    System.out.println();
                    trueResult++;
                    result++;
                } else {
                    System.out.println("Sorry, that is incorrect! " + endArray[answer] + " is the correct answer.");
                    System.out.println();
                    falseResult++;
                    result++;
                }
            }
            System.out.println("All question has been answered");
            System.out.println(name + " ,you answered  " + trueResult + " Questions Right, " +  falseResult + " Questions Wrong for a Total of " + result + " Questions.");
            System.out.println("Your scored " + trueResult*10 + "%");
            takeQuest.close();
        }

        //exception handling
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
