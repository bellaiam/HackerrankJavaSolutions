package EmployeeImplementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;

interface Company {
    void assignSalaries(int[] salaries);
    void averageSalary();
    void maxSalary();
    void minSalary();
}

/* model output for cut and paste
Incomes of ____ credited
Average salary of ____ is ____
Maximum salary amongst ____ is ____
Minimum salary amongst ____ is ____
*/
class EngineerFirm implements Company{
    int[] income;
    // int n; // num of engineers
    public EngineerFirm(int n){
        income = new int [n];
        Arrays.fill(income, 0);
    }
    @Override
    public void assignSalaries(int[] salaries) {

        for (int i = 0; i < salaries.length; i++) {
            if(i < income.length){ // Just in case arr isn't larger
                income[i] = salaries[i];
            }
        }

        System.out.println("Incomes of engineers credited");
    }
    public void averageSalary() {
        double averageSalary = 0;
        for(int i : income) {
            averageSalary += i;
        }
        averageSalary = averageSalary/income.length;
        System.out.println("Average salary of engineers is " + String.format("%.2f",averageSalary));
    }
    public void maxSalary(){
        int maxSalary = Arrays.stream(income).max().getAsInt();
        System.out.println("Maximum salary amongst engineers is " + maxSalary);
    }
    public void minSalary(){
        int maxSalary = Arrays.stream(income).min().getAsInt();
        System.out.println("Minimum salary amongst engineers is " + maxSalary);
    }
}
class AccountantFirm implements Company{
    int [] income;
    public AccountantFirm(int n){
        income = new int [n];
        Arrays.fill(income, 0);
    }
    @Override
    public void assignSalaries(int[] salaries) {
        for (int i = 0; i < income.length; i++) {
            if (i < salaries.length) {
                income[i] = salaries[i];
            }

        }
        System.out.println("Incomes of accountants credited");
    }
    public void averageSalary() {
        double averageSalary = 0;
        for(int i : income) {
            averageSalary += i;
        }
        averageSalary = averageSalary/income.length;
        System.out.println("Average salary of accountants is " + String.format("%.2f", averageSalary));
    }
    public void maxSalary(){
        int maxSalary = Arrays.stream(income).max().getAsInt();
        System.out.println("Maximum salary amongst accountants is " + maxSalary);
    }
    public void minSalary(){
        int maxSalary = Arrays.stream(income).min().getAsInt();
        System.out.println("Minimum salary amongst accountants is " + maxSalary);
    }
}
public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);

        String[] count = sc.nextLine().split(" ");

        EngineerFirm e = new EngineerFirm(Integer.parseInt(count[0]));
        AccountantFirm a = new AccountantFirm(Integer.parseInt(count[1]));

        count = sc.nextLine().split(" ");

        int[] incomeEngineers = new int[count.length];
        for (int i=0; i < count.length; i++) {
            incomeEngineers[i] = Integer.parseInt(count[i]);
        }
        e.assignSalaries(incomeEngineers);

        count = sc.nextLine().split(" ");
        int[] incomeAccountants = new int[count.length];
        for (int i=0; i < count.length; i++) {
            incomeAccountants[i] = Integer.parseInt(count[i]);
        }
        a.assignSalaries(incomeAccountants);

        e.averageSalary();
        e.maxSalary();
        e.minSalary();

        a.averageSalary();
        a.maxSalary();
        a.minSalary();
    }
}
