package Java_Basics;
public class JavaMultiDimensionalArray {
    public static void main(String[] args) {
        /*
        
        A multidimensional array is an array of arrays.
        Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.

        To create a two-dimensional array, add each array within its own set of curly braces.

        To access the elements of the myNumbers array, specify two indexes: one for the array, and one for the element inside that array. This example accesses the third element (2) in the second array (1) of myNumbers.

        Array indexes start with 0: [0] is the first element. [1] is the second element, etc.

        */

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]);

    }
}