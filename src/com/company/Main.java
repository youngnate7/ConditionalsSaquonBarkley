package com.company;
import javax.swing.*;
import java.awt.Color;

public class Main {
    public static double totalWages(double hours, double rate){
        double wages;
        double x;
        x= hours-40;
        if(hours>=40) {
            wages = 40 * rate + 1.5* rate * x;
        }
        else {
            wages = hours * rate;
        }
        return wages;
    }
    public static boolean isLeapYear(int year){
        if(year%4==0 && year%100!=0 || year%400==0) {
            return true;
        }
            else{
                return false;
            }

    }
    public static boolean isLater( int month1, int day1, int year1, int month2, int day2, int year2) {
        if (year1 > year2 || year1 == year2 && month1 > month2 || year1 == year2 && month1 == month2 && day1 > day2) {
            return true;
        } else {
            return false;
        }
    }
    public static Color bestMatch(int r, int g, int b) {
        if (r > g && r > b) {
            return Color.RED;
        } else if (g > r && g > b) {
            return Color.GREEN;
        } else if (b > g && b > r) {
            return Color.BLUE;
        } else if (r == g && r == b) {
            return Color.GRAY;
        }
        else if (r == g && r > b) {
            return Color.YELLOW;
        }
        else if (r == b && r > g) {
            return Color.MAGENTA;
        }
        else if (g == b && g > r) {
            return Color.CYAN;
        }
        return null;
    }
    public static int findBestFit( int size1, int size2, int space) {
        if (size1 + size2 <= space) {
            return 3;
        }
        if (size1 >= size2 && size1 < space || size1 < size2 && size2 > space) {
            return 1;
        }
        if (size2 >= size1 && size2 < space || size1 > size2 && size1 > space) {
            return 2;
        }
        return 0;
    }
    public static void main(String[] args) {
        double wages = totalWages(45, 12.5);
        System.out.println("Wages for 45 hours at $12.50 " + wages);
        wages = totalWages(30, 10);
        System.out.println("Wages for 30 hours at $10.00 " + wages);

// leap year
        System.out.println("2000 " + isLeapYear(2000));
        System.out.println("2004 " + isLeapYear(2004));
        System.out.println("2003 " + isLeapYear(2003));
        System.out.println("2100 " + isLeapYear(2100));
//
//
//// is later
        System.out.println("1/2/2010 is later than 1/2/2011 " + isLater(1,2,2010, 1,2,2011));
        System.out.println("1/2/2011 is later than 1/2/2010 " + isLater(1,2,2011, 1,2,2010));
        System.out.println("1/2/2010 is later than 3/2/2010 " + isLater(1,2,2010, 3,2,2010));
        System.out.println("3/2/2010 is later than 1/2/2010 " + isLater(3,2,2010, 1,2,2010));//       System.out.println("1/3/2010 is later than 1/2/2010 " + isLater(1,3,2010, 1,2,2010));
       System.out.println("1/2/2010 is later than 1/3/2011 " + isLater(1,2,2010, 1,3,2010));
        System.out.println("1/2/2010 is later than 1/2/2010 " + isLater(1,2,2010, 1,2,2010));

//// Best match
        System.out.println("Best match 2 3 4 " + bestMatch(2,3,4));
        System.out.println("Best match 4 3 3 " + bestMatch(4,3,3));
        System.out.println("Best match 3 8 4 " + bestMatch(3,8,4));
        System.out.println("Best match 4 3 4 " + bestMatch(4,3,4));
        System.out.println("Best match 2 4 4 " + bestMatch(2,4,4));
        System.out.println("Best match 8 8 4 " + bestMatch(8,8,4));
        System.out.println("Best match 4 4 4 " + bestMatch(4,4,4));

//// Best Fit
        System.out.println("Find Best fit 2 3 6 is " + findBestFit(2,3,6));
        System.out.println("Find Best fit 4 3 6 is " + findBestFit(4,3,6));
        System.out.println("Find Best fit 3 4 6 is " + findBestFit(3,4,6));
        System.out.println("Find Best fit 2 3 1 is " + findBestFit(2,3,1));
        System.out.println("Find Best fit 6 3 4 is " + findBestFit(6,3,4));
        System.out.println("Find Best fit 3 6 4 is " + findBestFit(3,6,4));
    }
}

//Output:
//Wages for 45 hours at $12.50 593.75
//Wages for 30 hours at $10.00 300.0
//2000 true
//2004 true
//2003 false
//2100 false
//1/2/2010 is later than 1/2/2011 false
//1/2/2011 is later than 1/2/2010 true
//1/2/2010 is later than 3/2/2010 false
//3/2/2010 is later than 1/2/2010 true
//1/2/2010 is later than 1/3/2011 false
//1/2/2010 is later than 1/2/2010 false
//Best match 2 3 4 java.awt.Color[r=0,g=0,b=255]
//Best match 4 3 3 java.awt.Color[r=255,g=0,b=0]
//Best match 3 8 4 java.awt.Color[r=0,g=255,b=0]
//Best match 4 3 4 java.awt.Color[r=255,g=0,b=255]
//Best match 2 4 4 java.awt.Color[r=0,g=255,b=255]
//Best match 8 8 4 java.awt.Color[r=255,g=255,b=0]
//Best match 4 4 4 java.awt.Color[r=128,g=128,b=128]
//Find Best fit 2 3 6 is 3
//Find Best fit 4 3 6 is 1
//Find Best fit 3 4 6 is 2
//Find Best fit 2 3 1 is 1
//Find Best fit 6 3 4 is 2
//Find Best fit 3 6 4 is 1
//
//Process finished with exit code 0