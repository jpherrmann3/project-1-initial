package com.csc205.project1;

import java.lang.Math;

// Leveraging OpenAI for code completion.
// Link to the chat log: https://chat.openai.com/share/9f89fb0d-e6a1-4aa6-b1cd-8d556cbfaf29

// START OF PROMPT //
// Let's create a java class. Here are the details:

// - Design and implement a class called "Point" that represents a location in the Cartesian plane.
// - Include (at a minimum) the following methods:

// 1. A constructor that taxes "x" and "y" coordinates as double arguments.
// 2. setX(double x), setY(double y) - standard setters
// 3. getX(), getY() - standard getters
// 4. setPoint(double x, double y) - set the coordinates of the point.
// 5. shiftX(double n), shiftY(double n) - shift a point by a given amount along one of the axes.
// 6. distance(Point p2) finds the distance between to point p2.
// 7. rotate(double angle) - rotates the point by a specified (radian) angle around the origin. The formula operates as follows:

// x' = xcos(theta) - ysin(theta)
// y' = xsin(theta) + ycos(theta)
// END OF PROMPT //

public class Point {
    private double x;
    private double y;

    // Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Default constructor
    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    // Standard setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Standard getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Set the coordinates of the point
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Shift a point by a given amount along one of the axes
    public void shiftX(double n) {
        this.x += n;
    }

    public void shiftY(double n) {
        this.y += n;
    }

    // Find the distance between two points using Pythagorean theorem
    public double distance(Point p2) {
        double dx = p2.getX() - this.x;
        double dy = p2.getY() - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Rotate the point by a specified (radian) angle around the origin
    public void rotate(double angle) {
        double newX = x * Math.cos(angle) - y * Math.sin(angle);
        double newY = x * Math.sin(angle) + y * Math.cos(angle);
        x = newX;
        y = newY;
    }

    // Testing the Point class
    public static void main(String[] args) {
        Point point1 = new Point(1.0, 2.0);
        System.out.println("Original Point: (" + point1.getX() + ", " + point1.getY() + ")");

        point1.setPoint(3.0, 4.0);
        System.out.println("New Point: (" + point1.getX() + ", " + point1.getY() + ")");

        point1.shiftX(2.0);
        System.out.println("Shifted Point (X): (" + point1.getX() + ", " + point1.getY() + ")");

        point1.shiftY(-1.0);
        System.out.println("Shifted Point (Y): (" + point1.getX() + ", " + point1.getY() + ")");

        Point point2 = new Point(5.0, 6.0);
        System.out.println("Distance between points: " + point1.distance(point2));

        point1.rotate(Math.PI / 2); // Rotating by 90 degrees
        System.out.println("Rotated Point: (" + point1.getX() + ", " + point1.getY() + ")");

        Point point3 = new Point();
        System.out.println("Original Point: (" + point3.getX() + ", " + point3.getY() + ")");
    }
}

