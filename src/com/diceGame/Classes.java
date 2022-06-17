/*
 * Name: Tochukwu Ozurumba
 * Student Id: A0023457787
 * Description: This is Jav-Lab 3 Assignment. It's an assignment done by Tochukwu Ozurumba.
 *
 * */
package com.diceGame;

public class Classes {
    static int upSide;
    static int sides;
    static String diceName;


    public static void main(String[] args) {
//        constructor 1
        System.out.println("Fist Constructor with no args");
        dice dice = new dice();

        upSide = dice.getUpSides();
        sides = dice.getSides();
        diceName = dice.getPublicDiceName();

//        display dice
        getDiceInfo(sides, upSide, diceName);
//        get status
        diceRollStatus(dice);

        System.out.println("\n \n");

//        constructor 2
        System.out.println("Second Constructor with 1 args");
        dice diceInstanceWithOneArgs = new dice(15);
        upSide = diceInstanceWithOneArgs.getUpSides();
        sides = diceInstanceWithOneArgs.getSides();
        diceName = diceInstanceWithOneArgs.getPublicDiceName();
//        display dice
        getDiceInfo(sides, upSide, diceName);
//        get status
        diceRollStatus(diceInstanceWithOneArgs);

        System.out.println("\n \n");

//        constructor 3
        System.out.println("Second Constructor with 2 args");
        dice diceInstanceWith2Args = new dice(55, "almighty");
        upSide = diceInstanceWith2Args.getUpSides();
        sides = diceInstanceWith2Args.getSides();
        diceName = diceInstanceWith2Args.getPublicDiceName();
//        display dice
        getDiceInfo(sides, upSide, diceName);
//        get status
        diceRollStatus(diceInstanceWith2Args);

//        select one constructor and get highest value
        diceInstanceWith2Args.getHighestValue();
    }

    public static void getDiceInfo(int sides, int sideUp, String name) {
        System.out.println("Face of Dice: " + sides + " \n " + "Face of Dice: " + sideUp + " \n " + "Name of dice: " + name);
    }

    public static void diceRollStatus(dice diceInstance) {
        int diceBeforeShuffle = diceInstance.getUpSides();
        System.out.println("Face before roll: " + diceBeforeShuffle);

        diceInstance.rollDice();

        int diceAfterShuffle = diceInstance.getUpSides();
        System.out.println("Face after roll: " + diceAfterShuffle);
    }
}
