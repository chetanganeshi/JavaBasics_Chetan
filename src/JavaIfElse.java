public class JavaIfElse {
    public static void main(String[] args) {
        /*
        Java has the following conditional statements:

        Use 'if' to specify a block of code to be executed, if a specified condition is true
        Use 'else' to specify a block of code to be executed, if the same condition is false
        Use 'else if' to specify a new condition to test, if the first condition is false
        Use 'switch' to specify many alternative blocks of code to be executed
        */

        // Use the if statement to specify a block of Java code to be executed if a condition is true

        int x = 20;
        int y = 18;
        if (x > y) {
        System.out.println("x is greater than y");
        }

        // Use the else statement to specify a block of code to be executed if the condition is false

        int time1 = 20;
        if (time1 < 18) {
        System.out.println("Good day.");
        } else {
        System.out.println("Good evening.");
        }

        // Use the else if statement to specify a new condition if the first condition is false

        int time2 = 22;
        if (time2 < 10) {
        System.out.println("Good morning.");
        } else if (time2 < 18) {
        System.out.println("Good day.");
        } else {
        System.out.println("Good evening.");
        }
    }
}
