public class PrimeSeries {
    public static void main(String[] args) {
        int n = 50;

        System.out.println("Prime numbers up to " + n + ":");

        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}