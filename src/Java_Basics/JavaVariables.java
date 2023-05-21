package Java_Basics;
public class JavaVariables {
    public static void main(String[] args) {
        String name = "Virat Kohli";
        System.out.println(name);

        int myNum = 15;
        System.out.println(myNum);

        // Note that if you assign a new value to an existing variable, it will overwrite the previous value.

        // Final Variables:
        // If you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only)

         final int myFinalNum = 16;
         System.out.println(myFinalNum);

        // If you try to change 'myFinalNum' variable, it will generate error: cannot assign a value to a final variable.
        // myFinalNum = 17;
        // Uncomment above line to witness the error.

        int myNumber = 18;
        float myFloatNum = 15.88f;
        char myLetter = 'c';
        boolean myBool = true;
        String myText = "Glenn Maxwell";

        // Print Variables
        System.out.println("Hello "+myText);
        System.out.println(myNum + myNumber);
        System.out.println(myFloatNum);
        System.out.println(myBool);
        System.out.println(myLetter);

    }
}
