package com.pluralsight;

public class TestStatistics {
    public static void main(String[] args) {
        //create an array of 10 integers
        int [] testScores = {70,85,90,50,50,70,5080,90,85};

        //initiate variable
        int sum = 0;
        for(int i =0; i < testScores.length; i++){
            sum += testScores[i];
        }
        //compute the average
        double average = sum / testScores.length;

        System.out.println(average);


    }
}
