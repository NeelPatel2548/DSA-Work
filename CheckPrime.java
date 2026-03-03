// A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2

public class CheckPrime {

    public static void main(String[] args) {
        int n = 36, count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count > 2) {
            System.out.println("Is Not Prime");
        } else {
            System.out.println("Is Prime");
        }
    }
}
