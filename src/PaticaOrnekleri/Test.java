package PaticaOrnekleri;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        //DO NOT TOUCH THE FOLLOWING LINES
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE
        int n = 1;
        for(int i = 0; i <= 7;  i++){
            if(n <= 7){
                System.out.println("Enter score for judge "+ n++ + ":");
                score[i] = input.nextInt();
            }
        }

        double max = score[0];
        double min = score[0];
        double scoreTotalSum = 0.0;
        double sum5Scores = 0.0;

        for(int i= 0; i < score.length; i++){

            if(score[i] > max){
                max = score[i];
            }
            if(score[i] < min){
                min = score[i];
            }
            scoreTotalSum += score[i];
        }

        System.out.println("Enter the difficulty rating:");
        double rating = input.nextDouble();

        sum5Scores = (scoreTotalSum - (min + max)) *rating;

        System.out.println("Final Score: " + (sum5Scores * 0.6));
    }
}