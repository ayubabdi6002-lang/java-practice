public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Subtraction
        int difference = b - a;
        System.out.println("Difference: " + difference);

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product);

        // Division
        int quotient = b / a;
        System.out.println("Quotient: " + quotient);

        // Modulus
        int remainder = b % a;
        System.out.println("Remainder: " + remainder);



        // Increment and Decrement (pre increment and pre decrement ,first pre increment or pre decrement then use the value)

        int z = 5;
        ++z;
        System.out.println(z); // 6

        --z;
        System.out.println(z); // 5


        // Increment and Decrement (post increment and post decrement, first use the value and then increment or decrement later)
        int x = 5;
        x++;
        System.out.println(x); // 6 

        x--;
        System.out.println(x); // 5


        // Comparison Operators
        System.out.println("Is a equal to b? " + (a == b)); // false
        System.out.println("Is a not equal to b? " + (a != b)); // true
        System.out.println("Is a greater than b? " + (a > b)); // false
        System.out.println("Is a less than b? " + (a < b)); // true
        System.out.println("Is a greater than or equal to b? " + (a >= b)); // false
        System.out.println("Is a less than or equal to b? " + (a <= b)); // true 
        
        // Logical Operators
        boolean isLoggedIn = true;
        boolean isAdmin = false;

        System.out.println("Regular user: " + (isLoggedIn && !isAdmin));
        System.out.println("Has access: " + (isLoggedIn || isAdmin));
        System.out.println("Not logged in: " + (!isLoggedIn));
        
    }
    
}
