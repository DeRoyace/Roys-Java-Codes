public class CalculatorCLA {
    public static void main(String args[]) {

        if (args.length == 3) {

            int num1 = Integer.parseInt(args[0]);
            char opera = args[1].charAt(0);
            int num2 = Integer.parseInt(args[2]);

            double result = 0.0d;
            switch (opera) {
                case '+':
                    result = (double) num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    if (num2 != 0)
                        result = num1 / (double) num2;
                    else
                        System.out.println("Division by zero not possible");
                    break;

                case '%':
                    result = num1 % num2;
                    break;

                default:
                    System.out.println("Invalid Inputs");
            }
            System.out.println("Answer = " + result);
        } else
            System.out.println("Invalid Inputs");
    }
}

/**
 
rohit@rohit-HP-Notebook:/media/rohit/My drive 1/Desktop/My codes/Java in VSC$ javac CalculatorCLA.java
rohit@rohit-HP-Notebook:/media/rohit/My drive 1/Desktop/My codes/Java in VSC$ java CalculatorCLA 15 / 4
Answer = 3.75
rohit@rohit-HP-Notebook:/media/rohit/My drive 1/Desktop/My codes/Java in VSC$ java CalculatorCLA 9 + 8
Answer = 17.0
rohit@rohit-HP-Notebook:/media/rohit/My drive 1/Desktop/My codes/Java in VSC$ java CalculatorCLA 9 % 2
Answer = 1.0
rohit@rohit-HP-Notebook:/media/rohit/My drive 1/Desktop/My codes/Java in VSC$ java CalculatorCLA 12 / 0
Division by zero not possible
Answer = 0.0
rohit@rohit-HP-Notebook:/media/rohit/My drive 1/Desktop/My codes/Java in VSC$ java CalculatorCLA
Invalid Inputs
rohit@rohit-HP-Notebook:/media/rohit/My drive 1/Desktop/My codes/Java in VSC$ java CalculatorCLA 7 ^ 9
Invalid Inputs
Answer = 0.0

*/