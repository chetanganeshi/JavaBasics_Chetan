package Java_Basics;
public class JavaStrings {
    public static void main(String[] args) {
    /*
        Java Strings:
        Strings are used for storing text.

        A String variable contains a collection of characters surrounded by double quotes.

        String methods reference: https://www.w3schools.com/java/java_ref_string.asp
    */
    
    String greeting = "Hello";
    System.out.println(greeting);

    // A String in Java is actually an object, which contain methods that can perform certain operations on strings. For example, the length of a string can be found with the length() method
    String txt1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("The length of the txt string is: " + txt1.length());


    String txt2 = "Hello World";
    System.out.println(txt2.toUpperCase());   // Outputs "HELLO WORLD"
    System.out.println(txt2.toLowerCase());   // Outputs "hello world"

    // The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace)
    String txt3 = "Please locate where 'locate' occurs!";
    System.out.println(txt3.indexOf("locate")); // Outputs 7


        /*
        Method	                Description	                                                                Return Type
        charAt()	            Returns the character at the specified index (position)	                    char
        codePointAt()	        Returns the Unicode of the character at the specified index	                int
        codePointBefore()	    Returns the Unicode of the character before the specified index	            int
        codePointCount()	    Returns the number of Unicode values found in a string.	                    int
        compareTo()	            Compares two strings lexicographically	                                    int
        compareToIgnoreCase()	Compares two strings lexicographically, ignoring case differences	        int
        concat()	            Appends a string to the end of another string	                            String
        contains()	            Checks whether a string contains a sequence of characters	                boolean
        contentEquals()	        Checks whether a string contains the exact same sequence of characters
                                 of the specified CharSequence or StringBuffer	                            boolean
        copyValueOf()	        Returns a String that represents the characters of the character array	    String
        endsWith()	            Checks whether a string ends with the specified character(s)	            boolean
        equals()	            Compares two strings. Returns true if the strings are equal,
                                 and false if not	                                                        boolean
        equalsIgnoreCase()	    Compares two strings, ignoring case considerations	                        boolean
        format()	            Returns a formatted string using the specified locale,
                                 format string, and arguments	                                            String
        getBytes()	            Encodes this String into a sequence of bytes using the named charset,
                                 storing the result into a new byte array	                                byte[]
        getChars()	            Copies characters from a string to an array of chars	                    void
        hashCode()	            Returns the hash code of a string	                                        int
        indexOf()	            Returns the position of the first found occurrence of
                                 specified characters in a string	                                        int
        intern()	            Returns the canonical representation for the string object	                String
        isEmpty()	            Checks whether a string is empty or not	                                    boolean
        lastIndexOf()	        Returns the position of the last found occurrence of
                                 specified characters in a string	                                        int
        length()	            Returns the length of a specified string	                                int
        matches()	            Searches a string for a match against a regular expression,
                                 and returns the matches	                                                boolean
        offsetByCodePoints()	Returns the index within this String that is offset from the
                                 given index by codePointOffset code points	                                int
        regionMatches()	        Tests if two string regions are equal	                                    boolean
        replace()	            Searches a string for a specified value, and returns a new string
                                 where the specified values are replaced	                                String
        replaceFirst()	        Replaces the first occurrence of a substring that matches the given
                                 regular expression with the given replacement	                            String
        replaceAll()	        Replaces each substring of this string that matches the
                                 given regular expression with the given replacement	                    String
        split()	                Splits a string into an array of substrings	                                String[]
        startsWith()	        Checks whether a string starts with specified characters	                boolean
        subSequence()	        Returns a new character sequence that is a subsequence of this sequence	    CharSequence
        substring()	            Returns a new string which is the substring of a specified string	        String
        toCharArray()	        Converts this string to a new character array	                            char[]
        toLowerCase()	        Converts a string to lower case letters	                                    String
        toString()	            Returns the value of a String object	                                    String
        toUpperCase()	        Converts a string to upper case letters	                                    String
        trim()	                Removes whitespace from both ends of a string	                            String
        valueOf()	            Returns the string representation of the specified value	                String
        */


        /*
        Strings - Special Characters:
        Because strings must be written within quotes, Java will misunderstand this string, and generate an error.

        The solution to avoid this problem, is to use the backslash escape character.

        The backslash (\) escape character turns special characters into string characters.

        Escape character	Result	    Description
        \'	                '	        Single quote
        \"	                "	        Double quote
        \\	                \	        Backslash

        
        Other common escape sequences that are valid in Java are:

        Code	Result
        \n	    New Line	
        \r	    Carriage Return	
        \t	    Tab	
        \b	    Backspace	
        \f	    Form Feed

        
        */

    }
}
