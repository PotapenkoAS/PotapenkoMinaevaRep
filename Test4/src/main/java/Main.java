

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {

        System.out.println(doer());

    }

    public static int doer() throws FileNotFoundException {
        File file = new File("src\\main\\resources\\Notes.txt");
        Scanner readFile = new Scanner(file);

        String temp;
        String[] tempArr;
        int num;
        int min;
        int max;
        int sum = 0;
        while (readFile.hasNext()) {
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
            temp = readFile.nextLine();
            tempArr = temp.split("\t");
            for (String el : tempArr) {
                num = Integer.valueOf(el);
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }
            sum += max - min;
            System.out.println(max - min);
        }

        return sum;
    }
}




