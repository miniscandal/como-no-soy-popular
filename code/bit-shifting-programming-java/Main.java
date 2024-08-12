public class Main {
    public static void main(String... args) {
        // Original number
        int number = 5; // In binary: 0000 0101

        // Left shift by 1 bit
        int shiftedLeft = number << 1; // In binary: 0000 1010

        // Display results
        System.out.println("Original number: " + number);
        System.out.println("Number after left shift by 1 bit: " + shiftedLeft);

        // Verify the result in binary
        System.out.println("Original number in binary: " + Integer.toBinaryString(number));
        System.out.println("Number after shift in binary: " + Integer.toBinaryString(shiftedLeft));
    }
}
