public class Conditions {

    public static void main(String[] args) {

        int a = 2;
        int b = 5;

        // && & - AND
        // || | - OR
        // ^ - XOR

        System.out.println("2 = " + Integer.toBinaryString(2));
        System.out.println("2 = " + Integer.toBinaryString(5));

        System.out.println(2 & 5);
        System.out.println(2 | 5);
        System.out.println(2 ^ 5);
    }
}
