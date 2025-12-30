/**
 * Java program to use reflection to get access to class constructors and methods.
 */
package com.myreflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Coffee class.
 */
class Coffee {

    String name;
    double price;

    public Coffee() {
    }

    // Will not be visible through reflection because modificator private
    private Coffee(String name) {
        this.name = name;
    }

    public Coffee(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

/**
 * Main class.
 */
public class Main {

    // Main method to run java program
    public static void main(String[] args) throws ClassNotFoundException {

        Class c = Class.forName("com.myreflection.Coffee");

        // Array of created in class "com.myreflection.Coffee" constructors
        Constructor [] constructors = c.getConstructors();

        for (int index = 0; index < constructors.length; index++) {

            // Printing names and parameters of each constructor to console.
            System.out.println("Name Of Constructor: " + constructors[index]);

        }

        // Creating an array of methods what class "com.myreflection.Coffee" has.
        Method [] methods = c.getMethods();

        for (int index = 0; index < methods.length; index++) {

            // Printing methods of class "com.myreflection.Coffee" to console.
            System.out.println(methods[index]);

        }
    }
}