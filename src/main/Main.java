package main;

public class Main {

    public static void main(String[] args) {

        Dice dice = new Dice();

        Thread t1 = new Thread(new SubThread(dice));
        Thread t2 = new Thread(new SubThread(dice));
        Thread t3 = new Thread(new SubThread(dice));

        startThreaads(t1, t2, t3);

        try{
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e){
            System.out.println("ERROR!");
        }

        showData(t1, t2, t3, dice);
    }

    private static void showData(Thread t1, Thread t2, Thread t3, Dice dice) {

        System.out.println( "Number one appeared " + dice.getN1() + " times\n" +
                            "Number two appeared " + dice.getN2() + " times\n" +
                            "Number three appeared " + dice.getN3() + " times\n" +
                            "Number four appeared " + dice.getN4() + " times\n" +
                            "Number five appeared " + dice.getN5() + " times\n" +
                            "Number six appeared " + dice.getN5() + " times\n\n" +
                            "Total throws: " + sumThrows(dice));


    }

    private static int sumThrows(Dice dice) {

        int total= dice.getN1()+dice.getN2()+dice.getN3()+dice.getN4()+dice.getN5()+dice.getN6();
        return total;
    }

    private static void startThreaads(Thread t1, Thread t2, Thread t3) {
        t1.start();
        t2.start();
        t3.start();
    }


}
