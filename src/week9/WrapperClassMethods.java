package week9;

import java.util.Scanner;

public class WrapperClassMethods {

    public static void main(String[] args) {

        one();
        two();
        System.out.println("------------------------");
        // Autoboxing
        int a = 40;

        Integer b = a;

        // Unboxing
        Integer c = 50;

        int d = c;

        /*
        !. parsInt():
        2.valueOf():
        3.toString():
        4.Integer.max or min take maximum Integer value or minimum Integer value
         */

        System.out.println(Integer.toString(123).concat("OneTwoThree"));  // "123"

        String str = "123house258";

        int total = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                total += Integer.valueOf("" + str.charAt(i));
            }
        }

        System.out.println("total = " + total);


    }

    public static void one() {

        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        boolean isPositive = false;

        int num = Integer.parseInt(number);
        if (num > 0) {
            isPositive = true;
        }
        System.out.println(isPositive);
        scanner.close();
    }

    public static void two() {

        String str = "456number8745";
        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                if (Integer.valueOf(str.charAt(i)) % 3 == 0) {
                    num += Integer.valueOf("" + str.charAt(i));
                }
            }

        }
        System.out.println(num);
    }
}