package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        //create an array of 10 integers
        int [] testScores = {70,85,90,50,50,70,88,90,85,92};

        //call display method that prints everything
        displayScores(testScores);

    }

    //method to find the average score
    public static double average(int[] testScores){
        int sum = 0;
        for(int i =0; i < testScores.length; i++){
            sum += testScores[i];
        }
        //compute the average
        double average = (double) sum / testScores.length;
        return average;
    }

    //method to find the highest score
    public static int highestScore(int[] testScores){
        //variable to track the highest
        int highest = 0;
        for(int j = 0; j <testScores.length; j++){
            if(highest < testScores[j]){
                highest = testScores[j];
            }
        }
        return highest;
    }

    // method for finding the highest score
    public static int lowestScore(int[] testScores){
        //create a variabl to track the lowest through the list
        int lowest = 100;
        for (int j = 0; j < testScores.length; j++) {
            if (lowest > testScores[j]) {
                lowest = testScores[j];
            }
        }
        return lowest;
    }

    public static double medianScore(int[] testScores) {
        // make a copy so the original array isn't reordered
        int[] sorted = testScores.clone();
        Arrays.sort(sorted);

        int middle = sorted.length / 2;

        if (sorted.length % 2 == 1) {
            // odd number of scores: take the middle one
            return sorted[middle];
        } else {
            // even number of scores: average the two middle ones
            return (sorted[middle - 1] + sorted[middle]) / 2.0;
        }
    }

        // create a display score
        public static void displayScores (int [] testScores){
            System.out.println("highest score is: " + highestScore(testScores));
            System.out.println("The lowest score is: "+lowestScore(testScores));
            System.out.println("Average score: " + average(testScores));
            System.out.println("Median score: " + medianScore(testScores));

        }
    }

