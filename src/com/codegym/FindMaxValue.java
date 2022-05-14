package com.codegym;

import java.util.List;
import java.util.Scanner;

public class FindMaxValue {
    public static void main(String[] args) {
        ReadAndWriteFie readAndWriteFie = new ReadAndWriteFie();
        List<Integer> numbers = readAndWriteFie.readFile("numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFie.writeFile("result.txt",maxValue);
    }

    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max< numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }
}
