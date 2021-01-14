package com.company.MapsLambdaandStreamAPILab;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split(" "))
                .filter(i->i.length()%2==0)
                .forEach(i-> System.out.println(i));

    }
}
