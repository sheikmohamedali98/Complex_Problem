package com.handcircket;

import java.util.Random;
import java.util.Scanner;

public class HandCircket {
static Scanner scan = new Scanner(System.in);
    private static int generateRandom() {
        Random random = new Random();
        int computerScore = random.nextInt(6);
        return computerScore;
    }

    public static void main(String[] args) {
        String playerName = null;
        int runToBeScore = 0;
        int playerRun = 0;
        int wicket = 0;
        String gameStart = " ";
        System.out.println("Welcome To Apple Game shall we Start(y/n)");
        gameStart = scan.next().toUpperCase();
        if (gameStart.charAt(0) == 'Y') {
            System.out.println("Enter Your Name ");
            playerName = scan.next();
            System.out.println("Shall we start game (y/n)");
            String option = scan.next().toUpperCase();



            if (option.charAt(0) == 'Y') {
                System.out.println("welcome " + playerName + " ");
                System.out.println("Enter the which Run to be Chase");
                 runToBeScore = scan.nextInt();





                while (playerRun < runToBeScore) {
                    System.out.println("Enter the Your Run :");
                    int run = scan.nextInt();

                    if(run>0&&run<=6) {
                        System.out.println(playerName+" Run is "+run);
                        int computerRun = generateRandom();
                        System.out.println("Computer Run is "+computerRun);
                        if(run==computerRun) {
                            wicket++;
                            System.out.println("Your out better luck next Time :(");
                            if(wicket == 10){
                                break;
                            }


                        }else {
                            playerRun += run;
                            System.out.println("your run is "+playerRun+" Wicket "+wicket);
                        }


                    }else {
                        System.out.println("Enter the run betweeen 1 to 6");
                    }//if player run Enter
                }//while
            }else{
                System.out.println("Okay shall we play next time");//enter game
            }

        }//start game

        if(runToBeScore <= playerRun) {
            System.out.println("you win Conrajulation");
            System.out.println(playerName+" Score is "+playerRun+" wicket "+wicket );

        }


        System.out.println(playerName+" Score is "+playerRun+" wicket "+wicket );
    }

    }

