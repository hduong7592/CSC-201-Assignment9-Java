/**
 * Hieu Duong
 * CSC 201
 * Assignment 9
 * Problem 9.6:
 * (Stopwatch) Design a class named StopWatch. The class contains:
 * ■ Private data fields startTime and endTime with getter methods.
 * ■ A no-arg constructor that initializes startTime with the current time.
 * ■ A method named start() that resets the startTime to the current time.
 * ■ A method named stop() that sets the endTime to the current time.
 * ■ A method named getElapsedTime() that returns the elapsed time for the
 * stopwatch in milliseconds.
 *
 * 09/30/2017
 *
 */

import java.util.Random;

public class StopWatch {

    /**
     * Declare values
     */
    private double startTime;
    private double endTime;

    /**
     * get startTime
     * @return
     */
    public double getStartTime() {
        return startTime;
    }

    /**
     * Get endTime
     * @return
     */
    public double getEndTime() {
        return endTime;
    }

    /**
     * StopWatch constructor
     */
    public StopWatch(){
        startTime = System.currentTimeMillis();
    }

    /**
     * start method
     */
    public void start(){
        startTime = System.currentTimeMillis();
    }

    /**
     * stop method
     */
    public void stop(){
        endTime = System.currentTimeMillis();
    }

    /**
     * Get elapsed time method
     * the value is in miliseconds, we need to change it to seconds
     * @return
     */
    public double getElapsedTime(){
        double CurrentTime = System.currentTimeMillis();
        double ElapseTime = (CurrentTime - startTime)/1000;
        return  ElapseTime;
    }

    /**
     * Main method, doesnt really need it, just put it here to run the code
     * @param args
     */
    public static void main(String[] args){

        StopWatch watch1 = new StopWatch();
        int row = 100000;
        int[] array = new int[row];
        for(int i=0; i<row; i++){
            array[i] = RandomNumber(1,1000);
        }

        array = SortArray(array);

        double time1 = watch1.getElapsedTime();
        System.out.printf("%.2f seconds\n",time1);
    }

    /**
     * Get a random number between 2 numbers
     * @param min
     * @param max
     * @return
     */
    public static int RandomNumber(int min, int max){
        Random random = new Random();
        int randomNum = random.nextInt((max - min)+1)+min;
        return randomNum;
    }

    /**
     * Sort array method
     * @param list
     * @return
     */
    public static int[] SortArray(int[] list){

        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            int currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }

        return list;
    }
}
