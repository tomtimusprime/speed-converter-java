package com.company;

import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        printConversion(150.0);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            return -1;
        }
        long milesPerHour = (long) ((long) kilometersPerHour / 1.609);
        Math.round(milesPerHour);
        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value.");
        }
        System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");

    }
}

