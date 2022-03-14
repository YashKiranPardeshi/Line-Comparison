package com.infogalaxylinecomparisonproblem;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class LineComparisonProblem {
    public static void main(String[] args) {
        double x1;
        double x2;
        double y1;
        double y2;
        double length;
        System.out.println("Welcome To Line Comparison Program Made by Yash");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x1 coordinate : ");
        x1 = scanner.nextDouble();
        System.out.println("Enter the value of x2 coordinate : ");
        x2 = scanner.nextDouble();
        System.out.println("Enter the value of y1 coordinate : ");
        y1 = scanner.nextDouble();
        System.out.println("Enter the value of y2 coordinate :");
        y2 = scanner.nextDouble();
        length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Length of line is =" + length);
    }
}






