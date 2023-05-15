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

        Math Methods Reference https://www.w3schools.com/java/java_ref_math.asp
        */

        System.out.println(Math.max(5, 10)); 
        System.out.println(Math.min(5, 10));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-4.7));
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);

        /*
        Method	                Description	                                                                        Return Type
        abs(x)	                Returns the absolute value of x	                                                    double|float|int|long
        acos(x)	                Returns the arccosine of x, in radians	                                            double
        asin(x)	                Returns the arcsine of x, in radians	                                            double
        atan(x)	                Returns the arctangent of x as a numeric value between -PI/2 and PI/2 radians	    double
        atan2(y,x)	            Returns the angle theta from the conversion of rectangular coordinates (x, y)
                                 to polar coordinates (r, theta).	                                                double
        cbrt(x)	                Returns the cube root of x	                                                        double
        ceil(x)	                Returns the value of x rounded up to its nearest integer	                        double
        copySign(x, y)	        Returns the first floating point x with the sign of the second floating point y	    double
        cos(x)	                Returns the cosine of x (x is in radians)	                                        double
        cosh(x)	                Returns the hyperbolic cosine of a double value	                                    double
        exp(x)	                Returns the value of Ex	                                                            double
        expm1(x)	            Returns ex  -1	                                                                    double
        floor(x)	            Returns the value of x rounded down to its nearest integer	                        double
        getExponent(x)	        Returns the unbiased exponent used in x	                                            int
        hypot(x, y)	            Returns sqrt(x2 +y2) without intermediate overflow or underflow	                    double
        IEEEremainder(x, y)	    Computes the remainder operation on x and y as prescribed by the IEEE 754 standard	double
        log(x)	                Returns the natural logarithm (base E) of x	                                        double
        log10(x)	            Returns the base 10 logarithm of x	                                                double
        log1p(x)	            Returns the natural logarithm (base E) of the sum of x and 1	                    double
        max(x, y)	            Returns the number with the highest value	                                        double|float|int|long
        min(x, y)	            Returns the number with the lowest value	                                        double|float|int|long
        nextAfter(x, y)	        Returns the floating point number adjacent to x in the direction of y	            double|float
        nextUp(x)	            Returns the floating point value adjacent to x in the direction of
                                 positive infinity	                                                                double|float
        pow(x, y)	            Returns the value of x to the power of y	                                        double
        random()	            Returns a random number between 0 and 1	                                            double
        round(x)	            Returns the value of x rounded to its nearest integer	                            int
        rint(x)	                Returns the double value that is closest to x and equal to a mathematical integer	double
        signum(x)	            Returns the sign of x	                                                            double
        sin(x)	                Returns the sine of x (x is in radians)	                                            double
        sinh(x)	                Returns the hyperbolic sine of a double value	                                    double
        sqrt(x)	                Returns the square root of x	                                                    double
        tan(x)	                Returns the tangent of an angle	                                                    double
        tanh(x)	                Returns the hyperbolic tangent of a double value	                                double
        toDegrees(x)	        Converts an angle measured in radians to an approx. equivalent angle measured
                                 in degrees	                                                                        double
        toRadians(x)	        Converts an angle measured in degrees to an approx. angle measured in radians	    double
        ulp(x)	                Returns the size of the unit of least precision (ulp) of x	                        double|float 
        
        */
    }
}
