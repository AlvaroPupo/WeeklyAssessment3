package com.company.Question_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Switch {


    private String answer = "you are the best!!";
    private String answer2 = "you are the most perfect!!";
    private String answer3 = "you are not perfect!!";
    private String answer4 = "you are the worst!!";

    protected void startSwitch() {

        Scanner input = new Scanner(System.in);
        System.out.println("type a number from 1 to 4 to guess how perfect you are: \n(1, 2, 3, 4)");

        try {
            switch (input.nextInt()) {
                case 1:
                    System.out.println(answer);
                    System.out.println();
                    startSwitch();
                    break;
                case 2:
                    System.out.println(answer2);
                    System.out.println();
                    startSwitch();
                    break;
                case 3:
                    System.out.println(answer3);
                    System.out.println();
                    startSwitch();
                    break;
                case 4:
                    System.out.println(answer4);
                    System.out.println();
                    startSwitch();
                    break;
                default:
                    System.out.println("type a valid number!!");
                    System.out.println();
                    startSwitch();
                    input.nextLine();
                    break;
            }
        }catch (InputMismatchException ime){
            System.out.println("type in a number from 1 to 4!!");
            System.out.println();
            startSwitch();
        }

    }
}



