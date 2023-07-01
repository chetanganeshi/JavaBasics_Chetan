package Java_OOPS;

public class JavaOOPS {
    /*
        OOP stands for Object-Oriented Programming.

        Procedural programming is about writing procedures or methods that perform operations on the data, while object-oriented programming is about creating objects that contain both data and methods.

        Object-oriented programming has several advantages over procedural programming:

            OOP is faster and easier to execute
            OOP provides a clear structure for the programs
            OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
            OOP makes it possible to create full reusable applications with less code and shorter development time

        Classes and objects are the two main aspects of object-oriented programming.
        
        So, a class is a template for objects, and an object is an instance of a class.

        When the individual objects are created, they inherit all the variables and methods from the class.


        Java Classes/Objects:

        Java is an object-oriented programming language.

        Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.

        A Class is like an object constructor, or a "blueprint" for creating objects.

        Create a Class:
        To create a class, use the keyword class.

        Create an Object:
        To create an object of Main, specify the class name, followed by the object name, and use the keyword new.
        You can create multiple objects of one class.
        You can also create an object of a class and access it in another class. This is often used for better organization of classes (one class has all the attributes and methods, while the other class holds the main() method (code to be executed)).
        Remember that the name of the java file should match the class name.

        Java Class Attributes:
        We used the term "variable" for x in the example (as shown below). It is actually an attribute of the class. Or you could say that class attributes are variables within a class.
    */

    int x = 5;

    public static void main(String[] args) {
        JavaOOPS myObj = new JavaOOPS();
        System.out.println(myObj.x);

        // You can also modify or override existing attribute values.
        // If you don't want the ability to override existing values, declare the attribute as final.
        myObj.x = 40;
        System.out.println(myObj.x);
    }



}
