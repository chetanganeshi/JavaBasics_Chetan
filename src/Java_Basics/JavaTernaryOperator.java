package Java_Basics;
public class JavaTernaryOperator {
    public static void main(String[] args) {
        // Short Hand If...Else (or) Ternary Operator.

        // Syntax:
        // variable = (condition) ? expressionTrue :  expressionFalse;

        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}