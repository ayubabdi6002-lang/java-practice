// A String variable contains a collection of characters surrounded by double quotes (""):

public class Main {
    public static void main(String[] args) {
        String greeting = "Hello, World!";
        System.out.println(greeting);


    // Concatenation
    String firstName = "John";
    String lastName = "Doe";
    String fullName = firstName + " " + lastName;
    System.out.println(fullName);   


    // String length
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("The length of the txt string is: " + txt.length());  // Outputs 26


    // Escape character , it allows you to use double quotes when you normally would not be allowed:
    String txt2 = "We are the so-called \"Vikings\" from the north.";
    System.out.println(txt2);        // Outputs: We are the so-called "Vikings" from the north.

    // String methods
    String txt3 = "Hello World";
    System.out.println(txt3.toUpperCase());   // Outputs "HELLO WORLD"
    System.out.println(txt3.toLowerCase());   // Outputs "hello world"  

    // String index.    it returns the index of the first occurrence of a specified character in a string. The index of the first character is 0, the second character is 1, and so on.
    String txt4 = "Hello";
    System.out.println(txt4.indexOf("e")); // Outputs 1 
    
    // String substring
    String txt5 = "Hello World";
    System.out.println(txt5.substring(0, 5)); // Outputs "Hello"  as the substring starts at index 0 and ends at index 5 (not including index 5)

    // String replace , here we replace the word "World" with "Java" in the string "Hello World".
    String txt6 = "Hello World";
    System.out.println(txt6.replace("World", "Java")); // Outputs "Hello Java" 

    // String split , here we split the string "Hello World" into an array of words using the space character as the delimiter.
    String txt7 = "Hello World";
    String[] words = txt7.split(" ");
    System.out.println(words[0]); // Outputs "Hello"
    System.out.println(words[1]); // Outputs "World"


    // String trim , the trim() method removes whitespace from both ends of a string. In this example, we have a string with leading and trailing spaces, and we use the trim() method to remove them.
    String txt8 = "       Hello World!       ";
    System.out.println(txt8.trim()); // Outputs "Hello World!"
    
    // String charAt , the charAt() method returns the character at a specified index (position) in a string. In this example, we have a string "Hello World" and we use the charAt() method to get the character at index 0, which is "H".
    String txt9 = "Hello World";
    System.out.println(txt9.charAt(0)); // Outputs "H"

    // String contains , the contains() method checks if a string contains a specified sequence of characters. In this example, we have a string "Hello World" and we use the contains() method to check if it contains the word "Hello". The method returns true because "Hello" is indeed present in the string.
    String txt10 = "Hello World";
    System.out.println(txt10.contains("Hello")); // Outputs true

    // String startsWith , the startsWith() method checks if a string starts with a specified prefix. In this example, we have a string "Hello World" and we use the startsWith() method to check if it starts with the word "Hello". The method returns true because "Hello" is indeed the starting substring of the string.
    String txt11 = "Hello World";
    System.out.println(txt11.startsWith("Hello")); // Outputs true
    
    // String endsWith , the endsWith() method checks if a string ends with a specified suffix. In this example, we have a string "Hello World" and we use the endsWith() method to check if it ends with the word "World". The method returns true because "World" is indeed the ending substring of the string.
    String txt12 = "Hello World";
    System.out.println(txt12.endsWith("World")); // Outputs true

    // String equals , the equals() method compares two strings for equality. In this example, we have a string "Hello World" and we use the equals() method to check if it is equal to another string "Hello World". The method returns true because both strings are identical.
    String txt13 = "Hello World";
    System.out.println(txt13.equals("Hello World")); // Outputs true

    // String equalsIgnoreCase , the equalsIgnoreCase() method compares two strings for equality, ignoring case differences. In this example, we have a string "Hello World" and we use the equalsIgnoreCase() method to check if it is equal to another string "hello world". The method returns true because both strings are considered equal when case is ignored.
    String txt14 = "Hello World";
    System.out.println(txt14.equalsIgnoreCase("hello world")); // Outputs true

    // String compareTo , the compareTo() method compares two strings lexicographically.(alphabetically) In this example, we have a string "Hello World" and we use the compareTo() method to compare it with another string "Hello World". The method returns 0 because both strings are identical.
    // Rules for compareTo() method:
    // If both strings are exactly the same. , Output:0
    // If the first string comes after the second alphabetically. , the output will be a positive number.
    // e.g : "Hello World".compareTo("Hello") will return a positive number because "Hello World" comes after "Hello" alphabetically.
    // or even another example is : String a = "Dog"; String b = "Cat"; System.out.println(a.compareTo(b)); Output: 1 because Dog comes after Cat.
    // if the first string comes before the second alphabetically. , the output will be a negative number.
    // e.g : "Hello".compareTo("Hello World") will return a negative number because "Hello" comes before "Hello World" alphabetically.

    
    
    String txt15 = "Hello World";
    System.out.println(txt15.compareTo("Hello World")); // Outputs 0
    
    // String isEmpty , the isEmpty() method checks if a string is empty (has a length of 0). In this example, we have an empty string and we use the isEmpty() method to check if it is empty. The method returns true because the string has no characters.
    String txt16 = "";
    System.out.println(txt16.isEmpty()); // Outputs true
    

    // String valueOf , the valueOf() method converts different types of values (such as int, double, boolean, etc.) into their string representation. In this example, we have an integer value 100 and we use the valueOf() method to convert it into a string. The resulting string is "100".
    int myNum = 100;
    String txt17 = String.valueOf(myNum);
    System.out.println(txt17); // Outputs "100"

    // String format , the format() method allows you to create formatted strings by specifying placeholders and providing values to fill those placeholders. In this example, we use the format() method to create a string that includes a name and an age. The placeholders %s and %d are used for the name (string) and age (integer), respectively.
    String txt18 = String.format("My name is %s and I am %d years old.", "John", 30);
    System.out.println(txt18); // Outputs "My name is John and I am 30 years old."

    // String join , the join() method allows you to concatenate multiple strings with a specified delimiter. In this example, we use the join() method to combine the strings "Hello" and "World" with a space as the delimiter.
    String txt19 = String.join(" ", "Hello", "World");
    System.out.println(txt19); // Outputs "Hello World"
    
    // String repeat , the repeat() method allows you to create a new string by repeating the original string a specified number of times. In this example, we use the repeat() method to repeat the string "Hello " three times.
    String txt20 = "Hello ";
    System.out.println(txt20.repeat(3)); // Outputs "Hello Hello Hello "

    // String strip , the strip() method removes leading and trailing whitespace from a string. In this example, we have a string with leading and trailing spaces, and we use the strip() method to remove them.
    String txt21 = "   Hello World!   ";
    System.out.println(txt21.strip()); // Outputs "Hello World!"

    // String stripLeading , the stripLeading() method removes leading whitespace from a string. In this example, we have a string with leading spaces, and we use the stripLeading() method to remove them.
    String txt22 = "   Hello World!   ";
    System.out.println(txt22.stripLeading()); // Outputs "Hello World!   "

    // String stripTrailing
    String txt23 = "   Hello World!   ";
    System.out.println(txt23.stripTrailing()); // Outputs "   Hello World!"


    // String lines
    String txt24 = "Hello\nWorld\n!";
    String[] lines2 = txt24.lines().toArray(String[]::new);
    for (String line : lines2) {
        System.out.println(line); }

    // String repeat
    String txt25 = "Hello ";
    System.out.println(txt25.repeat(3)); // Outputs "Hello Hello Hello "

    // String isBlank
    String txt26 = "   ";
    System.out.println(txt26.isBlank()); // Outputs true

    // String strip
    String txt27 = "   Hello World!   ";
    System.out.println(txt27.strip()); // Outputs "Hello World!"

    // String stripLeading
    String txt28 = "   Hello World!   ";
    System.out.println(txt28.stripLeading()); // Outputs "Hello World!   "

    // String stripTrailing
    String txt29 = "   Hello World!   ";
    System.out.println(txt29.stripTrailing()); // Outputs "   Hello World!"


    }

    
}
