package Java_Basics;
public class JavaForEachLoop {
    public static void main(String[] args) {
        /*
        For-Each Loop:
        There is also a "for-each" loop, which is used exclusively to loop through elements in an array.
        */

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
        System.out.println(i);
        }
    }
}
