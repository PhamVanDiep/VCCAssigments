package main;

import java.util.Random;

/**
 *
 * @author dieppv
 */
public final class Main {

    /**
     * coordinator x of point A.
     */
    private static final int A_X = 800;

    /**
     * coordinator y of point A.
     */
    private static final int A_Y = 800;

    /**
     * coordinator x of point B.
     */
    private static final int B_X = 4000;

    /**
     * coordinator y of point B.
     */
    private static final int B_Y = 800;

    /**
     * coordinator x of point C.
     */
    private static final int C_X = 2400;

    /**
     * coordinator y of point C.
     */
    private static final int C_Y = 2400;

    /**
     * constraint number of points to A.
     */
    private static final int NUM_A = 8000;

    /**
     * constraint number of points to B.
     */
    private static final int NUM_B = 10000;

    /**
     * constraint number of points to C.
     */
    private static final int NUM_C = 12000;

    /**
     * constraint distance to point A.
     */
    private static final int DIS_A = 400;

    /**
     * constraint distance to point B.
     */
    private static final int DIS_B = 500;

    /**
     * constraint distance to point C.
     */
    private static final int DIS_C = 600;

    private Main() {

    }

    /**
     * @param args
     */
    public static void main(final String[] args) {
        System.out.println("Hello World!");
    }

    /**
     * @return random integer
     */
    private static int getRandomInteger() {
        Random random = new Random();
        int upperbound = Integer.MAX_VALUE;
        return random.nextInt(upperbound);
    }
}
