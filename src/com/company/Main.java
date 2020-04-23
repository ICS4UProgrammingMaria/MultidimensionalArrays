/*
 * Created by: Maria temu
 * Created on: 1-March-2020
 * Created for: ICS4U
 * Day #13 (Multidimensional Arrays)
 * This program calculates the average that
 * is randomly generated
 */

package com.company;

import java.util.Random;


public class Main {

    // averageNum of a multidimensional array
    static double averageNum(int[][] input) {
        double sum = 0; double number = 0;
        for (int num = 0; num < input.length; num++) {
            for (int numi = 0; numi < input[num].length; numi++) {
                sum += input[num][numi];

                number++;
            }
        }

        // return averageNum
        return sum / number;
    }

    static int[][] randomClassGaussian(){
        Random rand = new Random();

        int[][] output = new int[4][6];

        //generate random grade
        for (int num = 0; num < 4; num++) {
            for (int numi = 0; numi < 6; numi++) {

                //generate a random number w/ avg of 75
                int randoNum = (int) ((rand.nextGaussian() * 15.) + 75.);

                if (100 < randoNum);
                    else if (0 > randoNum) randoNum = 0;
                //output
                output[num][numi] = randoNum;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        //array
        int[][] stuArray = randomClassGaussian();

        // Take the averageNum of the array
        double averageNum = averageNum(stuArray);
        //float averageNum = averageNum(stuArray);

        //print averageNum
        System.out.printf("The class averageNum is " + averageNum);
    }
}

