package com.diceGame;

public class dice {
    private String diceName;
    private int sides;
    private int upSides;

    // Default Constructor
    public dice() {
        this.diceName = "d12";
        this.sides = 12;
        rollDice();
    }

    // one constructor arg
    public dice(int sides) {
        this.sides = sides;
        this.diceName = "d" + this.sides;
        rollDice();
    }

    // two Constructor arg
    public dice(int sides, String diceName) {
        this.sides = sides;
        this.diceName = diceName;
        rollDice();
    }

    public void rollDice() {
        int roundRandom = (int) Math.floor((Math.random() * 10));
        if (roundRandom <= 0)
            this.upSides = 1;
        else
            this.upSides = (int) Math.floor((roundRandom * this.sides) / 10);
    }


    public int getSides() {
        return this.sides;
    }

    public void setSides(int sides) {
        this.diceName =  "d" + this.sides;
        this.sides = sides;
    }

    public int getUpSides() {
        return this.upSides;
    }


    public void setDiceName(String diceName) {
        this.diceName = diceName;
    }

    public String getPublicDiceName() {
        return this.diceName = "d" + sides;
    }

    public void getHighestValue() {
        System.out.println("Highest value: " + this.sides);
    }
}
