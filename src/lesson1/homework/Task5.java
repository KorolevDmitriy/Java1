package lesson1.homework;

public class Task5 {

    public static void main(String[] args) {
        digitIdentifier(-5);
        digitIdentifier(8);
        digitIdentifier(5);
    }

    public static void digitIdentifier(int digit) {
        if (digit < 0) {
            System.out.println(digit + " is negative digit");
        } else{
            System.out.println(digit + " is positive digit");
        }
    }
}
