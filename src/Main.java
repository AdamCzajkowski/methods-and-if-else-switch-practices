import java.util.Scanner;

public class Main {

    // Reading intigers from keyboard
    static int scannerInt() {
        Scanner scannerInt = new Scanner(System.in);
        return (scannerInt.nextInt());
    }

    // Reading doubles from keyboard
    static double scannerDouble() {
        Scanner scannerDouble = new Scanner(System.in);
        return (scannerDouble.nextDouble());
    }

    // Return summary, divide and multiplication of 2 number
    static void math(int a, int b) {
        int sum = a + b;
        int div = a / b;
        int multi = a * b;
        System.out.println("sum = " + sum + ", div = " + div + ", multi = " + multi);
    }

    // Is provided number is even? return true or false
    static boolean evenNumber(int c) {
        if (c % 2 == 0) {
            return true;
        }
        return false;
    }

    // Is provided number is divided by 3 and 5? return true or false
    static boolean divBy3and5(int d) {
        if (d % 3 == 0 && d % 5 == 0) {
            return true;
        }
        return false;
    }

    // Provided number is raisng to square power
    static void involution(double e) {
        double inv = Math.pow(e, 2);
        System.out.println(e + " raised to square power is " + inv);
    }

    static void showingMenu() {
        System.out.print("Menu: \n 1. Adding, diciding and multiplication 2 numbers. \n 2. Checking number is it even or odd. \n 3. Checking number is divided by 3 and 5.  \n 4. Rainsing number to square power. \n ");
    }

    public static void main(String[] args) {
        showingMenu();
        System.out.println(" \n \nProvide number of option: ");
        switch (scannerInt()) {
            case 1:
                System.out.println("Give me a 2 numbers: (second number has to diffrent than 0)");
                math(scannerInt(), scannerInt());
                break;
            case 2:
                System.out.println("Give me a number: ");
                if (evenNumber(scannerInt()) == true) {
                    System.out.println("Number is even. ");
                } else {
                    System.out.println("Number is odd. ");
                }
                break;
            case 3:
                System.out.println("Give me a number: ");
                if (divBy3and5(scannerInt()) == true) {
                    System.out.println("Number is divided by 3 and 5. ");
                } else {
                    System.out.println("Number isn't divided by 3 and 5. ");
                }
                break;
            case 4:
                System.out.println("Give me a number: ");
                involution(scannerDouble());
                break;
            default:
                System.out.println("Provide correct number of option. ");
        }
    }
}
