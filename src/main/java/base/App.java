/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Liam Pido
 */

/*
Exercise 7 - Area of a Rectangular Room

When working in a global environment, you’ll have to present information in both metric and Imperial units.
And you’ll need to know when to do the conversion to ensure the most accurate results.

Create a program that calculates the area of a room. Prompt the user for the length and width of the room in feet.
Then display the area in both square feet and square meters.

Example Output

What is the length of the room in feet? 15
What is the width of the room in feet? 20
You entered dimensions of 15 feet by 20 feet.
The area is
300 square feet
27.871 square meters

The formula for this conversion is m2 = f2 × 0.09290304

Constraints

Keep the calculations separate from the output.
Use a constant to hold the conversion factor.

Challenges

Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Create a new version of the program that allows you to choose feet or meters for your inputs.
Implement this program as a GUI program that automatically updates the values when any value changes.
 */
package base;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App myApp = new App();
        int length = myApp.inputLength();
        int width = myApp.inputWidth();
        int area = myApp.calculateArea(length, width);
        double m2 = myApp.convert(area);
        myApp.output(length, width, area, m2);
    }

    public double convert(int area) {
        double c = 0.09290304;
        return Math.round((area * c)*1000.0)/1000.0;
    }

    public void output(int length, int width, int area, double m2) {
        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");
        System.out.println("The area is");
        System.out.println(area + " square feet");
        System.out.println(m2 + " square meters");
    }

    public int calculateArea(int length, int width) {
        return (length * width);
    }

    public int inputWidth() {
        System.out.print("What is the width of the room in feet? ");
        String input = in.nextLine();
        return Integer.parseInt(input);
    }

    public int inputLength() {
        System.out.print("What is the length of the room in feet? ");
        String input = in.nextLine();
        return Integer.parseInt(input);
    }
}
