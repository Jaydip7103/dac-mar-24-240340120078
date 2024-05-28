public class Main {
    // Function to calculate sum of two numbers
    static int sum(int A, int B) {
        int result = A + B;
        return result;
    }

    // Function to calculate average of two numbers
    static double average(int A, int B) {
        double result = sum(A, B) / 2.0;
        return result;
    }

    public static void main(String[] args) {
        int A, B;
        A = 10;
        B = 5;
        double C = average(A, B);
        System.out.println(&quot;Average of &quot; + A + &quot; and &quot; + B + &quot; = &quot; + C);
    }
}
