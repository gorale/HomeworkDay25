package com.company;

public class Main {

    public static String cuttingIdenticalLetters(String str,int i){
        if (i == 0) {
            if (str.charAt(i) == '(') {
                return ")";
            }
            return str;
        }
        if (str.charAt(i) == '(') {

            return ')' + mirrored(str.substring(0), i - 1);
        }

        return str.charAt(i) + mirrored(str.substring(0), i - 1);
    }

    /**
     * mirrored
     *
     * @param str
     * @param i
     * @return
     */
    public static String mirrored(String str, int i) {
        if (i == 0) {
            if (str.charAt(i) == '(') {
                return ")";
            }
            return str;
        }
        if (str.charAt(i) == '(') {

            return ')' + mirrored(str.substring(0), i - 1);
        }

        return str.charAt(i) + mirrored(str.substring(0), i - 1);
    }

    /**
     * Parentheses
     *
     * @param str
     * @param i
     * @param k
     * @return
     */
    public static String parentheses(String str, int i, int k) {


        if (i == 0) {
            return "(" + str + ")";
        }
        if (str.charAt(i) != '(' || str.charAt(i) != ')') {
            --i;
            return parentheses(str.substring(0, i + 1) + (i < k / 2 ? "(" : ")") + str.substring(i + 1), i, k);
        }
        --i;
        return parentheses(str, i, k);
    }

    /**
     * Asterisks
     *
     * @param str
     * @param i
     * @return
     */
    public static String asterisks(String str, int i) {
        if (i == 0) {
            return str;
        }
        if (str.charAt(i) != '*') {
            --i;
            return asterisks(str.substring(0, i + 1) + "*" + str.substring(i + 1), i);
        }
        --i;
        return asterisks(str, i);

    }

    /**
     * in String count numbers
     *
     * @param str
     * @param count
     */
    public static void countNumbers(String str, int count) {
        if (str.length() == 1) {
            if (str.charAt(0) <= '9') {
                Integer.parseInt(String.valueOf(str.charAt(0)));
                count++;
                System.out.println(count);
            } else {
                System.out.println(count);
                return;
            }
        }

        String newString = str.substring(1);
        if (str.charAt(0) > '9') {

            countNumbers(newString, count);
        } else {
            count++;

            countNumbers(newString, count);
        }
    }

    /**
     * decimal digits
     *
     * @param str
     * @return
     */
    public static int decimalDigits(String str) {
        if (str.length() <= 1) {
            return Integer.parseInt(String.valueOf(str.charAt(0)));
        }
        String newString = str.substring(1);
        if (str.charAt(0) < str.charAt(1)) {
            return decimalDigits(newString);
        } else {

            newString = str.substring(2);
            return decimalDigits(str.charAt(0) + newString);
        }
    }

    /**
     * Number is prime or not prime
     *
     * @param num
     * @param i
     * @return
     */
    public static Boolean primeOrNot(int num, int i) {
        if (num <= 2)
            return (num == 2) ? true : false;
        if (num % i == 0)
            return false;
        if (i * i > num)
            return true;

        return primeOrNot(num, i + 1);
    }


    /**
     * Cleaned String
     *
     * @param str
     * @return
     */
    public static String cleaned(String str) {
        if (str.length() <= 1) {
            return String.valueOf(str.charAt(0));
        }
        String newString = str.substring(1);
        if (str.indexOf(str.charAt(0)) == str.indexOf(str.charAt(1))) {
            return cleaned(newString);
        } else {

            return str.charAt(0) + cleaned(newString);
        }
    }

    /**
     * Move 'x' to the end String
     *
     * @param str
     * @return
     */
    public static String moveX(String str) {

        if (str.length() < 1) {
            return "";
        }

        String newString = str.substring(1);

        if (str.indexOf('x') == 0) {
            return moveX(newString) + 'x';
        } else {
            return str.charAt(0) + moveX(newString);
        }

    }

    /**
     * Reverse String
     *
     * @param str
     * @param i
     * @return
     */
    public static String reverseString(String str, int i) {

        if (i == 0) {
            return String.valueOf(str.charAt(i));
        }


        return str.charAt(i) + reverseString(str.substring(0), i - 1);
    }

    public static String newStringX(String str, int i) {
        if (i == str.length() - 1) {
            return str.charAt(i) == 'x' ? "" : String.valueOf(str.charAt(i));
        }

        return (str.charAt(i) == 'x' ? "" : String.valueOf(str.charAt(i))) + newStringX(str.substring(0), i + 1);
    }

    /**
     * count lowercase 'x'
     *
     * @param str
     * @param i
     * @return
     */
    public static int countLowercaseX(String str, int i) {

        if (i == str.length() - 1) {
            return str.charAt(i) == 'x' ? 1 : 0;
        }


        return (str.charAt(i) == 'x' ? 1 : 0) + countLowercaseX(str.substring(0), i + 1);
    }

    /**
     * count 7 digit
     *
     * @param n
     * @return
     */
    public static int count7Digit(int n) {
        if (n < 10) {
            return n == 7 ? 1 : 0;
        }
        return (n % 10 == 7 ? 1 : 0) + count7Digit(n / 10);
    }

    /**
     * Sum digits
     *
     * @param n
     * @return
     */
    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return n % 10 + sumDigits(n / 10);
    }

    /**
     * Blocks Triangle
     *
     * @param n
     * @return
     */
    public static int blockTriangle(int n) {
        if (n == 0) {
            return 0;
        }

        return n + blockTriangle(n - 1);
    }


    /**
     * Fibonacci
     *
     * @param n
     * @return
     */
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        return n == 1 ? 1 : fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Factorial
     *
     * @param n
     * @return
     */
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }


    /**
     * Array sum
     *
     * @param arr
     * @param i
     * @return
     */
    public static int sumArray(int[] arr, int i) {

        if (i == 0) {
            return 0;
        }

        return arr[--i] + sumArray(arr, i);
    }


    public static void main(String[] args) {

//        int[] arr = new int[]{1, 2, 3};
//        System.out.println(sumArray(arr,arr.length));

//        System.out.println(factorial(4));

//        System.out.println(fibonacci(50));

//        System.out.println(blockTriangle(3));

//        System.out.println(sumDigits(12345));


//        System.out.println(count7Digit(17237));

        String str = "(ab( c(ade(";
//        System.out.println(str.substring(0,str.length()/2));


//        System.out.println(countLowercaseX(str, 0));

//        System.out.println(newStringX(str,0));


//        System.out.println(String.valueOf(str.charAt(3)));


//        System.out.println(reverseString(str,str.length()-1));


//        System.out.println(parentheses(str, str.length()-1,str.length()));

        System.out.println(mirrored(str, str.length() - 1));

    }
}
