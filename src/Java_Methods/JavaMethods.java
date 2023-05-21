package Java_Methods;

public class JavaMethods {
    /*
    Methods:

    A method is a block of code which only runs when it is called.

    You can pass data, known as parameters, into a method.

    Methods are used to perform certain actions, and they are also known as functions.

    Why use methods? To reuse code: define the code once, and use it many times. 

    Create a Method:

    A method must be declared within a class. It is defined with the name of the method, followed by parentheses (). 
    Java provides some pre-defined methods, such as System.out.println(), but we can also create your own methods to perform certain actions.
    
    Call a Method:

    To call a method in Java, write the method's name followed by two parentheses () and a semicolon;

    In the following example, myMethod() is used to print a text (the action), when it is called:
    */

    
    static void myMethod1() {
        System.out.println("I just got executed!");
    }
    
    static void sampleMethod() {
        myMethod1();
    }
    
    
    // Outputs "I just got executed!"

    /*
    myMethod() is the name of the method.
    static means that the method belongs to the Main class and not an object of the Main class.
    void means that this method does not have a return value. 
    */

    /*
    Parameters and Arguments:

    Information can be passed to methods as parameter. Parameters act as variables inside the method.
    Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.
    You can have as many parameters as you like.
    Note that when you are working with multiple parameters, the method call must have the same number of arguments as there are parameters, and the arguments must be passed in the same order.
    */

    /*
    Return Values:

    The void keyword, used in the examples above, indicates that the method should not return a value. If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) instead of void, and use the return keyword inside the method.
    */
    
    static int myMethod2(int x, int y) {
        return x + y;
    }
    
    static void returnValues() {
        int z = myMethod2(5, 3);
        System.out.println(z);
    }
    // Outputs 8 (5 + 3)

    /*
    Method Overloading:
    
    With method overloading, multiple methods can have the same name with different parameters.
    */

    static int plusMethod(int x, int y) {
        return x + y;
    }
      
    static double plusMethod(double x, double y) {
        return x + y;
    }
      
    static void methodOverloading() {
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }

    /*
    Java Recursion:

    Recursion is the technique of making a function call itself. This technique provides a way to break complicated problems down into simple problems which are easier to solve.
    
    Halting Condition:
    
    Just as loops can run into the problem of infinite looping, recursive functions can run into the problem of infinite recursion. Infinite recursion is when the function never stops calling itself. Every recursive function should have a halting condition, which is the condition where the function stops calling itself.
    */

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    static void recursion() {
        int result = sum(10);
        System.out.println(result);
      }

    public static void main(String[] args) {
        sampleMethod();
        returnValues();
        methodOverloading();
        recursion();
    }
}
