import java.util.Scanner;

class QuickStart {
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        int nunber1, nunber2, sum;

        System.out.print("Enter first integer: ");
        nunber1 = input.nextInt();

        System.out.print("Enter first integer: ");
        nunber2 = input.nextInt();
        sum = nunber1 + nunber2;

        System.out.printf("Sum is %d%n", sum);
    }
}