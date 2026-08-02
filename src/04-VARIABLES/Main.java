public class Main {
    public static void main(String[] args) {

        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);


        // we can also assign multiple variables the same value in one line
        int x, y, z;
        x = y = z = 50;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        // this is a practical example of how to use variables in a program to store studebnt information
        // Student data
        String studentName = "John Doe";
        int studentID = 15;
        int studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'B';

        // Print variables
        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);
    }
    
}
