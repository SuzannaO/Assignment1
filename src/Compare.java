public class Compare {

    public static void main(String[] args) {
        short numberOne = 8;
        short numberTwo = 5;
        if (numberOne > numberTwo) System.out.println("Number One is larger, number Two is smaller");
        else {
            System.out.println("Number Two is larger, number One is smaller");
        }
        if(numberOne == numberTwo)
        {
            System.out.println("Numbers are equal");
        }
        else
        {
            System.out.println("Numbers are not equal");

        }
        short number1 = -5;
        short number2 = 10;
        if (number1 % 2 == 0) {
            System.out.println("Number One is even");
        } else
            System.out.println("Number One is odd");
        if (number2 % 2 == 0) {
            System.out.println("Number Two is even");
        } else
            System.out.println("Number Two is odd");
        if (number1 < 0) {
            System.out.println("Number One is negative");
        } else
            System.out.println("Number One is positive");
        if (number2 < 0) {
            System.out.println("Number Two is negative");
        } else
            System.out.println("Number Two is positive");
        if (number1 < 100) {
            System.out.println("Number One is less than 100");
        } else
            System.out.println("Number One is more than 100");
        if (number2 < 100) {
            System.out.println("Number Two is more than 100");
        }
    }
}



