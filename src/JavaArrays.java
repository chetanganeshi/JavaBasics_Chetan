public class JavaArrays {
    public static void main(String[] args) {
        /*
        
        Java Arrays:
        Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
        To declare an array, define the variable type with square brackets.

        To insert values to it, you can place the values in a comma-separated list, inside curly braces.

        You can access an array element by referring to the index number.
        Array indexes start with 0: [0] is the first element. [1] is the second element, etc.

        To change the value of a specific element, refer to the index number.

        To find out how many elements an array has, use the length property.

        */

        // String[] cars;
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        
        int[] myNum = {10, 20, 30, 40};
        System.out.println(myNum[0]);

    }
}
