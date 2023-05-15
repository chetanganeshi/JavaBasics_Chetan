public class JavaMath {
    public static void main(String[] args) {
        /*
        The Java Math class has many methods that allows you to perform mathematical tasks on numbers.

        Math.max(x,y)
        The Math.max(x,y) method can be used to find the highest value of x and y.

        Math.min(x,y)
        The Math.min(x,y) method can be used to find the lowest value of x and y.

        Math.sqrt(x)
        The Math.sqrt(x) method returns the square root of x.

        Math.abs(x)
        The Math.abs(x) method returns the absolute (positive) value of x.

        Random Numbers
        Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive).

        To get more control over the random number, for example, if you only want a random number between 0 and 100, you can use the following formula:

        */

        System.out.println(Math.max(5, 10)); 
        System.out.println(Math.min(5, 10));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-4.7));
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);
    }
}
