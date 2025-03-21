public class ComparisonLogicalOperators {
    public static void main(String[] args) {
        // Initializing variables
        int num1 = 4, num2 = 3, num3 = 12, num4 = 1;

        // Logical and Comparison Operations
        boolean a = num1 > num2 || num3 < num4;   // true || false => true
        boolean b = num1 < num2 && num3 > num4;   // false && true => false
        boolean c = num1 >= num2 || num3 <= num4; // true || false => true
        boolean d = num1 != num2 && num3 == num4; // true && false => false
        boolean e = !(num1 == num2);              // !(false) => true
        boolean f = num1 < num3 && num2 > num4;   // true && true => true

        // Printing the results
        System.out.println(num1 + " > " + num2 + " || " + num3 + " < " + num4 + " is: " + a);
        System.out.println(num1 + " < " + num2 + " && " + num3 + " > " + num4 + " is: " + b);
        System.out.println(num1 + " >= " + num2 + " || " + num3 + " <= " + num4 + " is: " + c);
        System.out.println(num1 + " != " + num2 + " && " + num3 + " == " + num4 + " is: " + d);
        System.out.println("!(" + num1 + " == " + num2 + ") is: " + e);
        System.out.println(num1 + " < " + num3 + " && " + num2 + " > " + num4 + " is: " + f);
    }
}
