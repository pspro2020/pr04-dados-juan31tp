package main;

import java.util.Random;

public class Dice {

    private int n1=0, n2=0, n3=0, n4=0, n5=0, n6=0;

    void throwDice(){

        Random rnd = new Random();

        synchronized (this) {
            switch (rnd.nextInt(6)+1){
                case 1:
                    n1++;
                    break;
                case 2:
                    n2++;
                    break;
                case 3:
                    n3++;
                    break;
                case 4:
                    n4++;
                    break;
                case 5:
                    n5++;
                    break;
                case 6:
                    n6++;
                    break;
            }
        }
    }

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public int getN3() {
        return n3;
    }

    public int getN4() {
        return n4;
    }

    public int getN5() {
        return n5;
    }

    public int getN6() {
        return n6;
    }
}
