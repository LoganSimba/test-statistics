package com.pluralsight;

public class TestStatistics {
    public static void main(String[] args) {
        //create an array of 10 integers
        int [] testScores = {70,85,90,50,50,70,5080,90,85};

        //initiate variable
        System.out.println(average(testScores));

        //finding the highest score by iterating through the list







    }

    //method to find the average score
    public static double average(int[] testScores){
        int sum = 0;
        for(int i =0; i < testScores.length; i++){
            sum += testScores[i];
        }
        //compute the average
        double average = sum / testScores.length;
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
        int lowest = 0;
        for(int j = 0; j <testScores.length; j++){
            if(lowest > testScores[j]){
                lowest = testScores[j];
            }
        }
        return lowest;
    }
}
