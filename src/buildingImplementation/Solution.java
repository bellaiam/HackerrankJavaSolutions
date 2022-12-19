package buildingImplementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


interface Building{
    void floorCompleted(int floorNumber);
    void printStatus(int floorNumber);
    void printNumberOfFloors();
}

/* model output for cut and paste
A ____ is being constructed
Construction for floor number ____ completed in ____
Floor number ____ does not exist in ____
Construction for floor number ____ completed in ____
Construction for floor number ____ not completed in ____ 
The ____ has ____ floors
*/
class School implements Building {
    private int[] floors;

    School(int n) {
        floors = new int[n];
        Arrays.fill(floors, 0);
        System.out.println("A school is being constructed");
    }
    @Override
    public void floorCompleted(int floorNumber) {
        for (int i = 0; i < floors.length; i++) {
            if (i == floorNumber) {
                floors[floorNumber] = 1;
                break;
            }
        }
        if (floorNumber <= floors.length) {
            System.out.println("Construction for floor number " + floorNumber + " completed in school");

        } else {
            System.out.println("Floor number " + floorNumber + " does not exist in school");
        }
    }


    @Override
    public void printStatus(int floorNumber) {
        if (floorNumber > floors.length) {
            System.out.println("Floor number " + floorNumber + " does not exist in school");
        } else if (floorNumber < floors.length && floors[floorNumber] == 1) {
            System.out.println("Construction for floor number " + floorNumber + " completed in school");
        } else {
            System.out.println("Construction for floor number " + floorNumber + " not completed in school");
        }
    }
    @Override
    public void printNumberOfFloors() {
        System.out.println("The school has " + floors.length + " floors");
    }
}
class Hospital implements Building {
    private int[] floors;
    Hospital(int n) {
        floors = new int[n];
        Arrays.fill(floors, 0);
        System.out.println("A hospital is being constructed");
    }
    @Override
    public void floorCompleted(int floorNumber) {

        for (int i = 0; i < floors.length; i++) {
            if (i == floorNumber) {
                floors[floorNumber] = 1;
                break;
            }
        }
        if (floorNumber > floors.length) {
            System.out.println("Floor number " + floorNumber + " does not exist in hospital");
        } else {
            System.out.println("Construction for floor number " + floorNumber + " completed in hospital");
        }
    }
    @Override
    public void printStatus(int floorNumber) {
        if (floorNumber > floors.length) {
            System.out.println("Floor number " + floorNumber + " does not exist in hospital");
        } else if (floorNumber < floors.length && floors[floorNumber] == 1) {
            System.out.println("Construction for floor number " + floorNumber + " completed in hospital");
        } else {
            System.out.println("Construction for floor number " + floorNumber + " not completed in hospital");
        }
    }
    @Override
    public void printNumberOfFloors() {
        System.out.println("The hospital has " + floors.length + " floors");
    }
}
public class Solution {
    public static void main(String [] args ) throws Exception {
        Scanner sc = new Scanner(System.in);

        String[] floors = sc.nextLine().split(" ");

        School s = new School(Integer.parseInt(floors[0]));
        Hospital h = new Hospital(Integer.parseInt(floors[1]));
        s.printNumberOfFloors();
        h.printNumberOfFloors();

        String[] floorNumbers = sc.nextLine().split(" ");
        for (int i = 0; i < floorNumbers.length; i++) {
            s.floorCompleted(Integer.parseInt(floorNumbers[i]));
        }

        floorNumbers = sc.nextLine().split(" ");
        for (int i = 0; i < floorNumbers.length; i++) {
            s.printStatus(Integer.parseInt(floorNumbers[i]));
        }

        floorNumbers = sc.nextLine().split(" ");
        for (int i = 0; i < floorNumbers.length; i++) {
            h.floorCompleted(Integer.parseInt(floorNumbers[i]));
        }

        floorNumbers = sc.nextLine().split(" ");
        for (int i = 0; i < floorNumbers.length; i++) {
            h.printStatus(Integer.parseInt(floorNumbers[i]));
        }
    }
}