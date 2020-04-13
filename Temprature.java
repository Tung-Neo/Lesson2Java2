package Lesson2Java2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        Integer higherAvg;

        int sum = 0;
        int n;
        double avg = 0;

        System.out.printf("Enter day: ");
        int day = sc.nextInt();
        System.out.printf("Enter %s integer values.\n", day);
        for (int i = 0; i < day; i++){
            list.add(sc.nextInt());
        }
        for (n = 0; n < day; n++){
            System.out.println("Element " + (n+1)+ ", type value was " + list.get(n));
            sum += list.get(n);
            avg = (double)sum/day;
        }
        System.out.println("Average is " + avg);
    }
}
